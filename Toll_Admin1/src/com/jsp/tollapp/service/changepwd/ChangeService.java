package com.jsp.tollapp.service.changepwd;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.tollapp.dao.changepwd.ChangeDAO;
import com.jsp.tollapp.dto.changepwd.ChangeDTO;

@Service
public class ChangeService {
	private static Logger logger = LoggerFactory.getLogger(ChangeService.class);

	@Autowired
	private ChangeDAO dao;

	public ChangeService() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	public String changePassService(ChangeDTO dto) {
		boolean	res = false;
		try {
			
			res = dao.changePass(dto);
		} catch (HibernateException e) {
			logger.error("Exception in ChangeService changePassService method");
			e.printStackTrace();
		}

		if (res) {
			return "Password Changed Successfully";
		} else {
			return "Password and confirm password is not matching ";
		}
	}
}
