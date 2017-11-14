package com.jsp.tollapp.dto.changepwd;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChangeDTO implements Serializable {

	private static Logger logger = LoggerFactory.getLogger(ChangeDTO.class);
	
	private String email;
	private String password;
	private String confirmpassword;
	public ChangeDTO() {
		logger.info("created.." + this.getClass().getSimpleName());
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ChangeDTO [email=" + email + ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}
	
}
