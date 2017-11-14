package com.jsp.tollapp.controller.forgotpwd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.tollapp.dto.forgotpwd.ForgotDTO;
import com.jsp.tollapp.service.forgotpwd.ForgotService;

@Controller
@RequestMapping("/")
public class ForgotController {

	private static Logger logger = LoggerFactory.getLogger(ForgotController.class);

	@Autowired
	private ForgotService service;

	public ForgotController() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/forgotPassword.toll", method = RequestMethod.POST)
	public ModelAndView saveForgotController(ForgotDTO dto) {
		String message = null;
		try {
			logger.info("ForgotController saveAdminController started");
			logger.info("ForgotDTO: " + dto);
			message = service.saveService(dto);
		} catch (Exception e) {
			logger.error("Exception in ForgotController saveForgotController method");
		}
		logger.info("ForgotController saveAdminController ended");
		return new ModelAndView("Login.jsp", "msg", message);
		
	}
}
