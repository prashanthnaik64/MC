package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.CustomerReg;
import com.cts.service.CustomerService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController

public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	
	@GetMapping("/customers")
	public List<CustomerReg> getCustomer(){
		return customerservice.getAllCustomers();
	}
	@ApiOperation(value= "add customer details",
			notes="post new customer into the list",
			response = CustomerReg.class)
	@PostMapping("/customer")
	public void addCustomer(@RequestBody CustomerReg customerReg) {
		customerservice.addCustomer(customerReg);
	}
	@ApiOperation(value= "update exisiting ",
			notes="update restaurant which is already in database",
			response = CustomerReg.class)
	@RequestMapping(value = "/customer", method = RequestMethod.PUT)
	public HttpStatus updateCustomer(@RequestBody CustomerReg customerReg) {
		return customerservice.updateCustomer(customerReg)  ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@ApiOperation(value= "delete customer from list",
			notes="delete existing customer from customer list",
			response = CustomerReg.class)
	@RequestMapping(value = "/customer/{username}", method = RequestMethod.DELETE)
	public HttpStatus delete(@PathVariable String username) {
		customerservice.deleteCustomer(username);
		return HttpStatus.NO_CONTENT;
	}
	
	@ApiOperation(value= "find customer from customer list",
			notes="use customer's name for searching",
			response = CustomerReg.class)
	@RequestMapping(value = "/customer/{username}", method = RequestMethod.GET)
	public List<CustomerReg> getCustomerByUsername(@ApiParam(value="Username value for the customer you need to retrieve", required= true)@PathVariable String username) {
		return customerservice.findByUsername(username) ;
	}
	

}
