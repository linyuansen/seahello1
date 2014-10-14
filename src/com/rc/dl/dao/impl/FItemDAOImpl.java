package com.rc.dl.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rc.dl.bean.FItem;
import com.rc.dl.common.Constant;
import com.rc.dl.dao.IFItemDao;

public class FItemDAOImpl implements IFItemDao{
	
	//注入sessionFactory
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
//		return HibernateUtil.getSessionFactory().openSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	public int doCreate(FItem item) {
		
		Integer id = null;
		id = (Integer)getSession().save(item);
		return id;
	}

	@Override
	public void doUpdate(FItem item) {
		getSession().update(item);		
	}

	@Override
	public void doDelete(FItem item) {
		
		getSession().delete(item);
	}

	@SuppressWarnings("unchecked")
	@Override
	public FItem findById(int id) {
		String hql = "from FItem t where t.id = ? ";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		List<FItem> list = query.list();
		return list.get(Constant.FRIST_ELEMENT);
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FItem> findAll(String keyWord) {
		String hql = "from FItem ";
		Query query = getSession().createQuery(hql);		
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<FItem> getTop(int limit){
		String hql = "from FItem f order by f.pv desc ";
		Query query = getSession().createQuery(hql);
		query.setMaxResults(limit);
		return query.list();				
	}

	@Override
	public void doUpdatePV(int id, int pv) {
		String hql = "update FItem t set t.pv = ? where t.id = ?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, pv);
		query.setParameter(1, id);
		query.executeUpdate();		
	}

	@Override
	public void doSave(FItem fitem) {
		getSession().save(fitem);
	}	
	
	

}
