package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.MutualFund;

@Repository
public interface MutualFundRepo extends JpaRepository<MutualFund, String> {
	

}
