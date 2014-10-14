package com.rc.dl.dao;

import com.rc.dl.bean.User;

/**
 * 登录DAO
 * @author cat
 *
 */

public interface IUserDao 
{
	/**
	 * 检查用户名是否存在
	 */
	public boolean checkUserName(String userName);
	
	/**
	 *检查密码是否正确
	 */
	public boolean checkPassword(String password);
	
	/**
	 * 设置登录密匙
	 */
	public void updateUUID(String key,String userName);
	/**
	 * 查询登录用户的信息
	 * 
	 */
	public User findByUserName(String userName);
	
	public int doCreate(User user);
	public void doUpdate(User user);
	public void doDelete(User user);
	public User findById(int id);
	
}
