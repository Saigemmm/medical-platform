package org.system.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class BaseHibernateDao extends HibernateDaoSupport {
//	private static SessionFactory factory;
//	static {
//		Configuration config = new Configuration().configure();
//		factory = config.buildSessionFactory();
//	}
//	private static Session session;

//	private static Session getSession() {
//		if (session == null || !session.isOpen()) {
//			session = factory.openSession();
//		}
//		return session;
//	}

	public void add(Object item) {
//		Session session = getSession();
//		Transaction tx = session.beginTransaction();
//		session.save(item);
//		tx.commit();

		super.getHibernateTemplate().save(item);
	}

	public void delete(Class clazz, Serializable id) {
//		Session session = getSession();
//		Transaction tx = session.beginTransaction();
//		session.delete(session.get(clazz, id));
//		tx.commit();

		super.getHibernateTemplate().delete(super.getHibernateTemplate().get(clazz, id));
	}

	public void update(Object item) {
//		Session session = getSession();
//		Transaction tx = session.beginTransaction();
//		session.update(item);
//		tx.commit();
		
		super.getHibernateTemplate().update(item);
	}

	public Object get(Class clazz, Serializable id) {
//		Session session = getSession();
//		return session.get(clazz, id);
		
		return super.getHibernateTemplate().get(clazz, id);
	}

	public List find(String hql, Map<String, Object> params) {
		Session session = getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			query.setProperties(params);
		}
		return query.list();
		
	}

	public List find1(String hql, Object... params) {
//		Session session = getSession();
//		Query query = session.createQuery(hql);
//		if (params != null) {
//			for (int i = 0; i < params.length; i++) {
//				query.setParameter(i, params[i]);
//			}
//		}
//		return query.list();
		
		return super.getHibernateTemplate().find(hql, params);
	}

	public List findByPaging(String hql, Map<String, Object> params, int pageNum, int pageSize) {
		Session session = getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			query.setProperties(params);
		}
		query.setFirstResult((pageNum - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}

	public List findByPaging1(String hql, int pageNum, int pageSize, Object... params) {
		Session session = getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		query.setFirstResult((pageNum - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.list();
		
	}

	public int count(String hql, Map<String, Object> params) {
		Session session = getSession();
		Query query = session.createQuery(hql);
		if (params != null) {
			query.setProperties(params);
		}
		return (int) (Long.parseLong(query.uniqueResult().toString()));
	}

	public int pageCount(String hql, Map<String, Object> params, int pageSize) {
		int count = count(hql, params);
		int pageCount = count / pageSize;
		if (count % pageSize != 0) {
			pageCount++;
		}
		return pageCount;
	}
}
