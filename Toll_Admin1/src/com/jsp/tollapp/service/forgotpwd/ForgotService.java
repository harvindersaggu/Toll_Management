 package com.jsp.tollapp.service.forgotpwd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.tollapp.dao.forgotpwd.ForgotDAO;
import com.jsp.tollapp.dto.forgotpwd.ForgotDTO;

@Service
public class ForgotService {

	private static Logger logger = LoggerFactory.getLogger(ForgotService.class);

	@Autowired
	private ForgotDAO dao;

	public ForgotService() {
		logger.info("created.." + this.getClass().getCanonicalName());
	}

	public String saveService(ForgotDTO dto) {
	/*	try {*/
			
			
		boolean res=dao.savePassword(dto);
		if(res)
		{
			return "Password updated successfully";
		}
		else {
			return "Enter valid email id";
		}
		/*
		 * } catch (Exception e) {
		 * logger.error("Exception in ForgotService saveService method");
		 * e.printStackTrace(); }
		 */
		
	}
}
