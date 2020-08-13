package com.cts.model;


import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity(name ="BankAccount")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Data
public class Account {
	
	@Id
	private String username;
	private int accountNum;
	private String BankName;
	private String IFSCCode;
	private String MICRCode;
	

}
