package com.jsp.tollapp.controller.activation;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.tollapp.dto.admin.AdminDTO;
import com.jsp.tollapp.service.activation.ActivationService;

@Controller
@RequestMapping("/")
public class ActivationController {

	private static Logger logger = LoggerFactory.getLogger(ActivationController.class);

	public ActivationController() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	@Autowired
	private ActivationService service;

	@RequestMapping(value = "/activate.toll", method = RequestMethod.GET)
	public ModelAndView activate(HttpServletRequest request) {
		logger.info("ActivationController activate() method started");
		
		String emailid=request.getParameter("em");
		String message = null;
		try {
			message = service.activateService(emailid);
		} catch (Exception e) {
			logger.error("Exception in ActivationController activate method");
			e.printStackTrace();
		}
		logger.info("ActivationController activate() method ended");
		return new ModelAndView("Login.jsp","msg",message);
	}
}
