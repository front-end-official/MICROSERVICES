package com.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.jparepo.EmployeeRepo;
import com.employee.model.Address;
import com.employee.model.Employee;
import com.employee.service.EmployeeServiceI;

@Service
public class EmpServiceImpl implements EmployeeServiceI{
	@Autowired
	EmployeeRepo employeeRepo;
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public Employee addEmployee(Employee employee) {
		Address address = employee.getAddress();
		
		address.setEmpId(employee.getEmpId());
		
		System.out.println(employee.getAddress());
		// Save Address Before saving Employee
		restTemplate.postForObject("http://localhost:9092/address/add", address, Address.class);
		
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> employeeList() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee viewOneEmployee(Integer empId) {
		Optional<Employee> optional = employeeRepo.findById(empId);
		return optional.get();
	}

}
