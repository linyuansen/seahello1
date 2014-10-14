package com.rc.dl.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rc.dl.bean.FItem;
import com.rc.dl.bean.User;
import com.rc.dl.common.Constant;
import com.rc.dl.dao.IUserDao;

public class UserDAOImpl implements IUserDao 
{
	
	//注入sessionFactory
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
	public boolean checkUserName(String userName) 
	{
		String hql ="from User t where t.userName = ? ";
		Query query = getSession().createQuery(hql);
		query.setString(0, userName);
		@SuppressWarnings("unchecked")
		List<User> list= query.list();
		
		if(null!=list && list.size()>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public boolean checkPassword(String password) 
	{
		String hql ="from User t where t.password = ? ";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, password);
		@SuppressWarnings("unchecked")
		List<Object[]> list= query.list();
		if(null!=list && list.size()>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void updateUUID(String key,String userName) 
	{
		String sql = "update T_USER_INFO set login_key = ? where user_name = ? ";
		Query query = getSession().createSQLQuery(sql);
		query.setString(0, key);
		query.setString(1, userName);
		query.executeUpdate();
	}

	@Override
	public User findByUserName(String userName) {

		String hql ="from User t where t.userName = ? ";
		Query query = getSession().createQuery(hql);
		query.setString(0, userName);
		@SuppressWarnings("unchecked")
		List<User> list = query.list();
		return list.get(Constant.FRIST_ELEMENT);
	}

	@Override
	public int doCreate(User user) {
		Integer id = null;
		id = (Integer)getSession().save(user);
		return id;
	}

	@Override
	public void doUpdate(User user) {
		getSession().update(user);	
	}

	@Override
	public void doDelete(User user) {
		getSession().delete(user);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public User findById(int id) {
		String hql = "from User t where t.id = ? ";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		List<User> list = query.list();
		return list.get(Constant.FRIST_ELEMENT);
	}

}
