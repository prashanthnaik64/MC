package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.CustomerReg;
import com.cts.repository.CustomerRepo;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	public List<CustomerReg> getAllCustomers(){
		return (List<CustomerReg>) customerRepo.findAll();
	}
	public void addCustomer(CustomerReg customerReg) {
		customerRepo.save(customerReg);
	}
	@Transactional
	public boolean updateCustomer(CustomerReg customerReg) {
		return customerRepo.save(customerReg) != null;
	}
	@Transactional
	public void deleteCustomer(String username) {
		customerRepo.deleteById(username);
	}
	
	@Transactional
	public List<CustomerReg> findByUsername(String name) {
		return customerRepo.findByusername(name);
	}
	

	

}
