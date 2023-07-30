package com.address.repo;

import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.address.entity.AddressEntity;
@Repository
public interface AddressRepo extends JpaRepository<AddressEntity, Integer>{
	@LoadBalanced
	List<AddressEntity> findByEmpId(Integer empId);
}
