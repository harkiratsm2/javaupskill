package com.hcl.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.taskmanager.entity.Task;
import com.hcl.taskmanager.service.ITaskService;
import com.hcl.taskmanager.to.TaskTO;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	ITaskService iTaskService;
	
	@PostMapping("/add")
	public String addUser(@RequestBody TaskTO task)
	{
		String addStatus = iTaskService.addTask(task);
		
		return addStatus;
	}
	
	@DeleteMapping("/delete/{taskId}")
	public String deleteUser(@PathVariable int taskId)
	{
		String deleteString = iTaskService.deleteTask(taskId);
		
		return deleteString;
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody Task task)
	{
		String updateStatus = iTaskService.updateTask(task);
		
		return updateStatus;
	}
	
	@GetMapping("/getAllTasks")
	public List<Task> getAllTasks()
	{
		List<Task> tasks = iTaskService.getAllTasks();
		
		return tasks;
	}

}
