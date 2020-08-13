package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity(name ="MutualFund")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Data
public class MutualFund {
	
	@Id
	private int fundId;
	private String MfundName;
	private String InvestMentAmount;
	private String transactionAmount;
	private int accountNumber;
	

}
