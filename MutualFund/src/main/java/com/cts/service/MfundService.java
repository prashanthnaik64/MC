package com.cts.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.MutualFund;
import com.cts.repository.MutualFundRepo;

@Service
@Transactional
public class MfundService {
	

	@Autowired
	MutualFundRepo mutualFundRepo;
	public List<MutualFund> getAllMf(){
		return (List<MutualFund>) mutualFundRepo.findAll();
	}
	public void invest(MutualFund invest) {
		mutualFundRepo.save(invest);
	}
	@Transactional
	public boolean updateInvestAmount(MutualFund invest) {
		return mutualFundRepo.save(invest) != null;
	}
	
	
	@Transactional
	public Optional<MutualFund> findByfundId(String id) {
		return mutualFundRepo.findById(id);
	}


}
