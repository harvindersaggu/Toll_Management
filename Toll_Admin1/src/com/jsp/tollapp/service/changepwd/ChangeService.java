package com.jsp.tollapp.service.changepwd;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

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
		String datas = dto.getPassword();
		String conpwd =dto.getConfirmpassword();
		String data = null;
		
		String confirm =null;
		boolean res = false;
		try {
			data = Base64.getEncoder().encodeToString(datas.getBytes("UTF-8"));
			dto.setPassword(data);
			
			confirm = Base64.getEncoder().encodeToString(conpwd.getBytes("UTF-8"));
			dto.setConfirmpassword(confirm);
			res = dao.changePass(dto);
		} catch (UnsupportedEncodingException e) {
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
