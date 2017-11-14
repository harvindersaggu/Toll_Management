package com.jsp.tollapp.service.admin;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.jsp.tollapp.dao.admin.AdminDAO;
import com.jsp.tollapp.dto.admin.AdminDTO;

@Service
public class AdminService {

	private static Logger logger = LoggerFactory.getLogger(AdminDTO.class);

	@Autowired
	private AdminDAO adminDAO;
                                    
	@Autowired
	private MailSender sender;

	public AdminService() {
		logger.info("created.." + this.getClass().getCanonicalName());
	}

	public String saveAdminService(AdminDTO dto) {

		logger.info("AdminService saveAdminService started");

	/*	try {*/
			UUID uuid = UUID.randomUUID();
			String randomUUIDString = uuid.toString();
			dto.setPassword(randomUUIDString);
			boolean res = adminDAO.saveAdmin(dto);

			if (res) {

				SimpleMailMessage mailMessage = new SimpleMailMessage();
				mailMessage.setTo(dto.getEmail());
				mailMessage.setFrom("saggu.harvin@gmail.com");
				mailMessage.setSubject("Account Creation");
				mailMessage.setText("Hi " + dto.getUsername() + "\n\n"
						+ "Please "+dto.getUsername() + " Click on below link to activate your account \n\n	"
						+"http://localhost:8080/Toll_Admin1/activate.toll?em="+dto.getEmail());
				
				sender.send(mailMessage);

				return "Registration success";
			} else {
				return "Email already registered \n\n or Expiry Date is not valid";
			/*}

		} catch (Exception e) {
			logger.error("Exception in AdminService saveAdminService method");
		}
		return "hj";*/
			}
	}
}
