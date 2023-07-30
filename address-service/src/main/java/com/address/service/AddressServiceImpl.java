package com.address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.entity.AddressEntity;
import com.address.repo.AddressRepo;

@Service
public class AddressServiceImpl implements AddressServiceI {
	@Autowired
	AddressRepo addressRepo;
	@Override
	public AddressEntity addAddress(AddressEntity addressEntity) {
		// TODO Auto-generated method stub
		return addressRepo.save(addressEntity);
	}

	@Override
	public List<AddressEntity> allAddress() {
		// TODO Auto-generated method stub
		return addressRepo.findAll();
	}

	@Override
	public List<AddressEntity> addressForUser(Integer empId) {
		// TODO Auto-generated method stub
		return addressRepo.findByEmpId(empId);
	}

}
