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
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Account;

import com.cts.service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("/account")
	public List<Account> getAcc(){
		return accountService.getAllAccount();
	}
	
	@PostMapping("/account")
	public void addCustomer(@RequestBody Account acc) {
		accountService.addAccount(acc);
	}
	
	@RequestMapping(value = "/account", method = RequestMethod.PUT)
	public HttpStatus updateCustomer(@RequestBody Account acc) {
		return accountService.updateAccount(acc)  ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	
	@RequestMapping(value = "/account/{username}", method = RequestMethod.DELETE)
	public HttpStatus delete(@PathVariable String username) {
		accountService.deleteAcc(username);
		return HttpStatus.NO_CONTENT;
	}
	
	
	@RequestMapping(value = "/account/{username}", method = RequestMethod.GET)
	public List<Account> getAccByUsername(@PathVariable String username) {
		return accountService.findByUsername(username) ;
	}

}
