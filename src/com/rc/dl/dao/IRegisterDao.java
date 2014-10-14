package com.rc.dl.dao;

import com.rc.dl.bean.Register;


/**
 * 注册DAO
 * @author cat
 *
 */
public interface IRegisterDao {
	/**
	 * 检查用户名是否存在
	 */
	public boolean checkUserName(String userName);
	/**
	 * 检查昵称是否存在
	 */
	public boolean checkNickName(String nickName);
	/**
	 *判断注册信息是否插入成功
	 * 
	 */
	public void saveUser(Register regist);
}
