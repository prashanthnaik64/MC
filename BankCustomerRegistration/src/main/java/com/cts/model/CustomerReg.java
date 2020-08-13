package com.cts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity(name ="Customer_Reg")
//@Table(name="Customer_Reg")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Data
public class CustomerReg {
	@ApiModelProperty(notes = "USERNAME should be  unique")
	@Id
	private String username;
	@ApiModelProperty(notes="Enter First name")
	private String fname;
	@ApiModelProperty(notes="Enter Last name")
	private String lname;
	@ApiModelProperty(notes="Enter Password")
	private String password;
	@ApiModelProperty(notes="Confirm Password")
	private String confirmPassword;
	@ApiModelProperty(notes="Enter Email")
	private String email;
	@ApiModelProperty(notes="Enter Dob (format>>> MM/DD/YYYY)")
	private Date dob;
	@ApiModelProperty(notes="Enter Contact Number")
	private String contactNumber;
	
}
