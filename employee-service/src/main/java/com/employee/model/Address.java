package com.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private Integer addressId;
	private String city; 
	private String district; 
	private String state; 
	private Integer pin; 
	private Integer empId;

	}
