package com.jobiak.mvcjsp.model;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SignupBean {
	@NotEmpty(message="Can't leave empty")
	@Size(min=10,max=10,message="Should be 10 digits")
	@Valid
	private String mobile;
	
	@NotEmpty(message="Can't leave empty")
	@Email
	@Valid
	private String email;
	
	@NotEmpty(message="Can't leave empty")
	@Size(min=12,max=12,message="Should be 10 digits")
	@Valid
	private String aadhar;
	
	public SignupBean() {
		// TODO Auto-generated constructor stub
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "SignupBean [mobile=" + mobile + ", email=" + email + ", aadhar=" + aadhar + "]";
	}
}
