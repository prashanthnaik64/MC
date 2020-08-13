package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.MutualFund;
import com.cts.service.MfundService;

@RestController
public class MfController {
	
	@Autowired
	MfundService mfundService;
	
	@GetMapping("/mutual")
	public List<MutualFund> getAllmf(){
		return mfundService.getAllMf();
	}
	
	@PostMapping("/mutual")
	public void investAmount(@RequestBody MutualFund mf) {
		mfundService.invest(mf);
	}
	
	@RequestMapping(value = "/mutualf", method = RequestMethod.PUT)
	public HttpStatus updateAmount(@RequestBody MutualFund mf) {
		return mfundService.updateInvestAmount(mf)  ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	
	
	
	
	@RequestMapping(value = "/mutualf/{id}", method = RequestMethod.GET)
	public Optional<MutualFund> getAccByUsername(@PathVariable String id) {
		return mfundService.findByfundId(id) ;
	}

}
