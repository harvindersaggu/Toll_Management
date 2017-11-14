package com.jsp.tollapp.service.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.tollapp.dao.login.LoginDAO;
import com.jsp.tollapp.dto.admin.AdminDTO;
import com.jsp.tollapp.dto.login.LoginDTO;

@Service
public class LoginService {

	private static Logger logger = LoggerFactory.getLogger(LoginDTO.class);

	@Autowired
	private LoginDAO dao;

	public LoginService() {
		logger.info("created.." + this.getClass().getCanonicalName());
	}

	public AdminDTO fetchUserService(LoginDTO dto) {
		logger.info("LoginService method started");
		AdminDTO dtoFromDB = null;
		try {
			dtoFromDB = dao.fetchUserDAO(dto);

		} catch (Exception e) {
			logger.error("Exception in LoginService fetchUserService method");
			e.printStackTrace();
		}
		logger.info("LoginService method ended");
		return dtoFromDB;

	}
}
