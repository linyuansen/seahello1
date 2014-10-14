package com.rc.dl.service;

import com.rc.dl.bean.User;

public interface IUserService 
{
	/**
	 * 登录service接口
	 */
	public String login(String userName,String password);
	/**
	 * 修改登录密匙
	 * @param key
	 */
	public void updateUUID(String key,String userName);
	
	/**
	 * 根据用户名查询用户信息
	 */
	public User findUserByName(String userName);
	
}
