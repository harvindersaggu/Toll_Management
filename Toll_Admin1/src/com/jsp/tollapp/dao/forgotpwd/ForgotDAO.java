package com.jsp.tollapp.dao.forgotpwd;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.tollapp.dto.forgotpwd.ForgotDTO;

@Repository
public class ForgotDAO {

	private static Logger logger = LoggerFactory.getLogger(ForgotDAO.class);

	@Autowired
	private SessionFactory factory;

	public ForgotDAO() {
		logger.info("created.." + this.getClass().getSimpleName());
	}

	public boolean savePassword(ForgotDTO dto) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			String hql = "select email from AdminDTO where email=:em";
			Query query = session.createQuery(hql);
			query.setParameter("em", dto.getEmail());
			String list = (String) query.uniqueResult();
			if (list.isEmpty()) {
				return false;
			}

			else {
				String hqls = "update AdminDTO F set F.password=:pass where F.email=:ls";
				query = session.createQuery(hqls);
				query.setParameter("pass", "qwerty");
				query.setParameter("ls", list);
				query.executeUpdate();
				transaction.commit();
				return true;
			}

		} catch (HibernateException e) {
			logger.error("Exception in ForgotDAO savePassword method");
			e.printStackTrace();
		}
		return true;
	}
}
