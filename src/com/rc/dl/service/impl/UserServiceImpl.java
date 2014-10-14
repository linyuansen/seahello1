package com.rc.dl.service.impl;

import javax.annotation.Resource;

import com.rc.dl.bean.User;
import com.rc.dl.common.Constant;
import com.rc.dl.dao.IUserDao;
import com.rc.dl.service.IUserService;

public  class UserServiceImpl implements IUserService 
{
	//注入DAO
	@Resource
	private IUserDao userDao;
	
	public IUserDao getUserDao() 
	{
		return userDao;
	}

	public void setUserDao(IUserDao userDao) 
	{
		this.userDao = userDao;
	}
	
	
	@Override
	public String login(String userName, String password) 
	{
		boolean isUserExits = userDao.checkUserName(userName);
		if(isUserExits)
		{
			if(userDao.checkPassword(password))
			{				
				//登录成功
				return Constant.lOGIN_SUCCESS;
			}
			else
			{
				return Constant.ERROR_PASSWORD;
			}
		}
		else
		{
			//失败
			return Constant.ERROR_USER;
		}			
	}

	@Override
	public void updateUUID(String key,String userName) 
	{
		userDao.updateUUID(key,userName);
		
	}

	@Override
	public User findUserByName(String userName) 
	{
		return userDao.findByUserName(userName);
	}




}
