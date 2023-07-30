package com.address.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Address_service_table")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String city; 
	private String district; 
	private String state; 
	private Integer pin; 
	private Integer empId;
}
