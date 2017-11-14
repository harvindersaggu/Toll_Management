package com.jsp.tollapp.controller.changepwd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.tollapp.dto.changepwd.ChangeDTO;
import com.jsp.tollapp.service.changepwd.ChangeService;

@Controller
@RequestMapping("/")
public class ChangeController {
	private static Logger logger = LoggerFactory.getLogger(ChangeController.class);

	@Autowired
	private ChangeService service;

	public ChangeController() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/changepwd.toll", method = RequestMethod.POST)
	public ModelAndView changePassController(ChangeDTO dto) {
		logger.info("ActivationController activate() method started");

		String message = null;
		try {
			message = service.changePassService(dto);
		} catch (Exception e) {
			logger.error("Exception in ActivationController activate method");
			e.printStackTrace();
		}
		logger.info("ActivationController activate() method ended");
		return new ModelAndView("Login.jsp", "msg", message);
	}
}
