package com.address.service;

import java.util.List;

import com.address.entity.AddressEntity;

public interface AddressServiceI {
 AddressEntity addAddress(AddressEntity addressEntity);
 List<AddressEntity> allAddress();
 List<AddressEntity> addressForUser(Integer empId);
 
}
