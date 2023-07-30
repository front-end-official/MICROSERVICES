package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeServiceI {
	Employee addEmployee(Employee employee);
	List<Employee> employeeList();
	Employee viewOneEmployee(Integer empId);
}
