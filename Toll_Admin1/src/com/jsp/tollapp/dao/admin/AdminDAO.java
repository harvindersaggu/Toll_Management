package com.jsp.tollapp.dao.admin;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.tollapp.dto.admin.AdminDTO;

@Repository
public class AdminDAO {

	private static Logger logger = LoggerFactory.getLogger(AdminDTO.class);
	@Autowired
	private SessionFactory factory;

	public AdminDAO() {
		logger.info("created.." + this.getClass().getCanonicalName());
	}

	public boolean saveAdmin(AdminDTO dto) {
		Session session = factory.openSession();
		try {
			logger.info("AdminDAO saveAdmin started");

			Transaction tx = session.beginTransaction();

			String hql = "select A.username from AdminDTO A where A.email=:em";
			Query query = session.createQuery(hql);
			query.setParameter("em", dto.getEmail());
			String username = (String) query.uniqueResult();
			Date date = new Date();

			if (username != null) {
				logger.info("Email already registered");
				return false;
			} else {
				if (dto.getExpiryDate().after(date) || dto.getExpiryDate().equals(date)) {
					logger.info("Valid expiry date");
					session.save(dto);
					tx.commit();
				} else {
					return false;
				}
			}

		} catch (Exception e) {
			logger.error("Exception in AdminDAO saveAdmin method");
			e.printStackTrace();
		}
		logger.info("AdminDAO saveAdmin ended");
		return true;
	}
}
