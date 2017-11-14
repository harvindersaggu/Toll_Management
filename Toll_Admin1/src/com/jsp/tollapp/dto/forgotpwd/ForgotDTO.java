package com.jsp.tollapp.dto.forgotpwd;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForgotDTO implements Serializable {

	private static Logger logger = LoggerFactory.getLogger(ForgotDTO.class);
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ForgotDTO() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "ForgotDTO [email=" + email + "]";
	}
}
