package com.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.entity.AddressEntity;
import com.address.service.AddressServiceImpl;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressServiceImpl service;
	
	@PostMapping("/add")
	ResponseEntity<AddressEntity> add(@RequestBody AddressEntity addressEntity)
	{
		return new ResponseEntity<AddressEntity>(service.addAddress(addressEntity),HttpStatus.CREATED);
	}
	@GetMapping("/all")
	ResponseEntity<List<AddressEntity>> all()
	{
		return new ResponseEntity<List<AddressEntity>>(service.allAddress(),HttpStatus.FOUND);
	}
	@GetMapping("/one/{empId}")
	ResponseEntity<List<AddressEntity>> getEmpAddress(@PathVariable Integer empId)
	{
		return new ResponseEntity<List<AddressEntity>>(service.addressForUser(empId),HttpStatus.FOUND);
	}
}
