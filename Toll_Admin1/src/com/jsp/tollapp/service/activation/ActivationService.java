package com.jsp.tollapp.service.activation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.tollapp.dao.activation.ActivationDAO;
import com.jsp.tollapp.dto.admin.AdminDTO;

@Service
public class ActivationService {
	private static Logger logger = LoggerFactory.getLogger(ActivationService.class);

	public ActivationService() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	@Autowired
	private ActivationDAO dao;

	public String activateService(String email) {
		logger.info("ActivationService activateService() method started");
		/*
		 * try {
		 */ int res = dao.activation(email);
		if (res==1) {
			logger.info("ActivationService activateService() method ended");
			return "Account Activated ";
		} else {
			return "Please verify ur email id first";
		}
		/*
		 * } catch (Exception e) {
		 * logger.error("Exception in activateService activate method");
		 * e.printStackTrace(); }
		 */

	}

}
