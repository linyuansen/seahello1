package com.rc.dl.service.impl;

import javax.annotation.Resource;

import com.rc.dl.bean.Register;
import com.rc.dl.dao.IRegisterDao;
import com.rc.dl.service.IRegisterService;


public class RegisterServiceImpl implements IRegisterService{

	//注入DAO
	@Resource
	private IRegisterDao registerDao;
	
	
	public IRegisterDao getRegisterDao() {
		return registerDao;
	}


	public void setRegisterDao(IRegisterDao registerDao) {
		this.registerDao = registerDao;
	}


	@Override
	public void saveUser(Register regist) {
		registerDao.saveUser(regist);
		
	}


	@Override
	public boolean findByUsername(String username) {
		registerDao.checkNickName(username);
		return false;
	}


	@Override
	public boolean findByNickname(String nickname) {
		registerDao.checkNickName(nickname);
		return false;
	}



}
