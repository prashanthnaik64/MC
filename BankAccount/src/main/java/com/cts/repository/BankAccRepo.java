package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Account;

@Repository
public interface BankAccRepo extends JpaRepository<Account, String> {
	
	List<Account> findByusername(String name);
}
