package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Account;
import com.cts.repository.BankAccRepo;

@Service
@Transactional
public class AccountService {
	
	@Autowired
	BankAccRepo bankAccRepo;
	public List<Account> getAllAccount(){
		return (List<Account>) bankAccRepo.findAll();
	}
	public void addAccount(Account acc) {
		bankAccRepo.save(acc);
	}
	@Transactional
	public boolean updateAccount(Account acc) {
		return bankAccRepo.save(acc) != null;
	}
	@Transactional
	public void deleteAcc(String username) {
		bankAccRepo.deleteById(username);
	}
	
	@Transactional
	public List<Account> findByUsername(String name) {
		return bankAccRepo.findByusername(name);
	}

}
