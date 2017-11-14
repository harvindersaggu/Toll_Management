 package com.jsp.tollapp.dao.login;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.tollapp.dto.admin.AdminDTO;
import com.jsp.tollapp.dto.login.LoginDTO;

@Repository
public class LoginDAO {

	private static Logger logger = LoggerFactory.getLogger(LoginDAO.class);

	@Autowired
	private SessionFactory factory;

	public LoginDAO() {
		logger.info("created.." + this.getClass().getCanonicalName());
	}

	public AdminDTO fetchUserDAO(LoginDTO dto) {
		logger.info("LoginDAO method started");
		AdminDTO dtoFromDB = null;
		try {
			String hql = "From AdminDTO  A where A.username=:un and A.password=:pw";
			Session session = factory.openSession();
			Query query = session.createQuery(hql);
			query.setParameter("un", dto.getUsername());
			query.setParameter("pw", dto.getPassword());
			dtoFromDB = (AdminDTO) query.uniqueResult();

		} catch (HibernateException e) {
			logger.error("Exception in LoginDAO fetchUserDAO method");
			e.printStackTrace();
		}
		logger.info("LoginDAO method ended");
		return dtoFromDB;
	}
}
