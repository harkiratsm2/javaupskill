package com.hcl.taskmanager.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.taskmanager.entity.Task;
import com.hcl.taskmanager.repository.ITaskRepository;
import com.hcl.taskmanager.service.ITaskService;
import com.hcl.taskmanager.to.TaskTO;

@Service
public class TaskServiceImpl implements ITaskService {
	
	@Autowired
	ITaskRepository iTaskRepository;

	public String addTask(TaskTO task) {
		
		Task task1 = new Task(0, task.getDescription(), task.getAssignedDate(), task.getStatus(), task.getResolution());

		iTaskRepository.save(task1);
		
		return "Task Created Successfully";
	}

	public List<Task> getAllTasks() {

		return iTaskRepository.findAll();
	}

	public String deleteTask(int taskId) {

		Task task = iTaskRepository.findByTaskId(taskId);
		
		if(task != null)
		{
			iTaskRepository.deleteById(taskId);
			return "Task deleted Successfully";
		}
		else
		{
			return "Task Not Found";
		}
	}

	public String updateTask(Task task) {

		Task task1 = iTaskRepository.findByTaskId(task.getTaskId());
		
		if(task1 != null)
		{
			iTaskRepository.save(task);
			return "Task Updated Successfully";
		}
		else
		{
			return "Task Not Found";
		}
	}

}
