package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.impl.EmpServiceImpl;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmpServiceImpl service;
	@PostMapping("/add")
	ResponseEntity<Employee> add(@RequestBody Employee employee)
	
	{
		service.addEmployee(employee);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	ResponseEntity<List<Employee>> listOfAll()
	{
		return new ResponseEntity<List<Employee>>(service.employeeList(), HttpStatus.FOUND);
	}
	
	@GetMapping("/one/{empId}")
	ResponseEntity<Employee> getOneEmp(@PathVariable("empId") Integer empId)
	{
		return new ResponseEntity<Employee>(service.viewOneEmployee(empId),HttpStatus.FOUND);
	}
}
