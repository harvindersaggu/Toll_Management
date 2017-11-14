  package com.jsp.tollapp.dto.login;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jsp.tollapp.controller.login.LoginController;

public class LoginDTO implements Serializable {

	private static Logger logger = LoggerFactory.getLogger(LoginDTO.class);
	
	private String username;
	private String password;

	public LoginDTO() {
		logger.info("created.." + this.getClass().getCanonicalName());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", password=" + password + "]";
	}
	
}
