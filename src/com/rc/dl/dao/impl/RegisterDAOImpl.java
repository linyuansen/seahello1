package com.rc.dl.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rc.dl.bean.Register;
import com.rc.dl.bean.User;
import com.rc.dl.dao.IRegisterDao;

public class RegisterDAOImpl implements IRegisterDao{
	
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
	public boolean checkUserName(String userName) {
		String hql="from Register r where r.userName = ? ";
		Query query = getSession().createQuery(hql);
		query.setString(0, userName);
		@SuppressWarnings("unchecked")
		List<Register>  list=query.list();
		if(null!=list && list.size()>0){
			return true;
		}else{
			return false;
		}		
	}

	@Override
	public boolean checkNickName(String nickName) {
		String hql ="from Register r where r.nickName = ? ";
		Query query = getSession().createQuery(hql);
		query.setString(0, nickName);
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
	public void saveUser(Register regist) {
		getSession().save(regist);
		String userID = String.valueOf(regist.getId());
		//这边在去同步数据到T_USER_INFO  三个字段  用户名  密码  用户Id
		User user = new User();
		user.setUserName(regist.getUserName());
		user.setPassword(regist.getPassword());
		//user.setUserId(userID) ;
		getSession().save(user);
		 
		
		
		
	}

}

