package com.rc.dl.service;

import com.rc.dl.bean.Register;

public interface IRegisterService {

	/**
	 * 注册service接口
	 */
	public boolean findByUsername(String username);
	
	public boolean findByNickname(String nickname);
	
	public void saveUser(Register regist);
	
	
}
