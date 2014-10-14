package com.rc.dl.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rc.dl.bean.Post;
import com.rc.dl.bean.Reply;
import com.rc.dl.common.Constant;
import com.rc.dl.dao.IReplyDao;

public class ReplyDAOImpl implements IReplyDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int doCreate(Reply object) {
		Integer id = null;
		id = (Integer)getSession().save(object);
		return id;
	}

	@Override
	public void doUpdate(Reply object) {
		getSession().update(object);
		
	}

	@Override
	public void doDelete(Reply object) {
		getSession().delete(object);
		
	}

	@Override
	public Reply findById(int id) {
		String hql = "from Post t where t.id = ? ";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		@SuppressWarnings("unchecked")
		List<Reply> list = query.list();
		return list.get(Constant.FRIST_ELEMENT);
	}
	

}
