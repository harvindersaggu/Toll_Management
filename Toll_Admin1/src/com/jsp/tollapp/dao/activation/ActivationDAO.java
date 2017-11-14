package com.jsp.tollapp.dao.activation;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ActivationDAO {

	private static Logger logger = LoggerFactory.getLogger(ActivationDAO.class);

	public ActivationDAO() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	@Autowired
	private SessionFactory factory;

	public int activation(String email) {
		logger.info("ActivationDAO  activation() method started");
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int i = 0;
		try {
			String hql = "update AdminDTO A set A.status=1 where A.email=:em";
			Query query = session.createQuery(hql);
			// query.setParameter("st", true);
			query.setParameter("em", email);
			i = query.executeUpdate();
			transaction.commit();
		} catch (HibernateException e) {
			logger.error("Exception in ActivationDAO activation method");
			e.printStackTrace();
		}
		logger.info("ActivationDAO  activation() method  ended");
		return i;
	}
}
