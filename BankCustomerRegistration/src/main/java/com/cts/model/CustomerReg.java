package com.cts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import io.swagger.annotations.ApiModel;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity(name ="Customer_Reg")
//@Table(name="Customer_Reg")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Data
public class CustomerReg {
	
	@Id
	@ApiModelProperty(notes = "USERNAME should be  unique")
	private String username;
	
	@ApiModelProperty(notes="Enter First name")
	@Pattern(regexp = "[a-zA-Z]{2}[A-Za-z\\s]*", message = "name can only have alphabets with minimum length 2")
	@NotNull(message = "Name cannot be null")
	private String fname;
	
	
	@Pattern(regexp = "[a-zA-Z]{2}[A-Za-z\\s]*", message = "name can only have alphabets with minimum length 2")
	@ApiModelProperty(value = "last name of the customer")
	private String lname;
	
	@ApiModelProperty(notes="Enter Password")
	@NotNull(message = "Password cannot be null")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,}$",message="password should be valid")
	@Size(min = 8, message = "password must have atleast 8 characters")
	private String password;
	
	@ApiModelProperty(notes="Confirm Password")
	private String confirmPassword;
	
	@Email
	@ApiModelProperty(notes="Enter Email")
	private String email;
	
	@ApiModelProperty(notes="Enter Dob (format>>> MM/DD/YYYY)")
	@NotNull(message = "DOB cannot be null")
	@Pattern(regexp ="^(0[1-9]|1[012])/(0[1-9]|[12][0-9]|[3][01])/\\d{4}",message="enter valid DOB")
	private Date dob;
	
	@ApiModelProperty(notes="Enter Contact Number")
	@NotNull(message = "phone cannot be null")
	@Pattern(regexp ="[1-9]{1}[0-9]{9}", message = "mobile number must be of 10 digits and should not begin with 0")
	private String contactNumber;
	
}
