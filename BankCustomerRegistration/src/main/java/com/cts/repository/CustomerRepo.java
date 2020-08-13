package com.cts.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.CustomerReg;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerReg, String> {
	List<CustomerReg> findByusername(String name);

}

