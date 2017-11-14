package com.jsp.tollapp.controller.admin;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.tollapp.dto.admin.AdminDTO;
import com.jsp.tollapp.service.admin.AdminService;

@Controller
@RequestMapping("/")
public class AdminController {

	private static Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private AdminService service;

	public AdminController() {
		logger.info("created.." + this.getClass().getCanonicalName());
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/addAdmin.toll", method = RequestMethod.POST)
	public ModelAndView saveAdminController(AdminDTO adminDTO) {
		logger.info("AdminController saveAdminController started");
		logger.info("adminDTO" + adminDTO);
		String message = null;
		try {
			message = service.saveAdminService(adminDTO);
		} catch (Exception e) {
			logger.error("Exception in AdminController saveAdminController method");
			e.printStackTrace();
		}
		logger.info("AdminController saveAdminController ended");
		return new ModelAndView("Home.jsp", "msg", message);
	}
	@RequestMapping(value = "/logout.toll")
    public String logout(HttpServletRequest request) {
        System.out.println("logout()");
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();

        return "/Login.jsp";
    }
    }
