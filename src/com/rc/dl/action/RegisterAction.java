package com.rc.dl.action;

import javax.annotation.Resource;

import com.rc.dl.bean.Register;
import com.rc.dl.service.IRegisterService;



import com.opensymphony.xwork2.ActionSupport;


public class RegisterAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	private IRegisterService RegisterService;

	public IRegisterService getRegisterService() {
		return RegisterService;
	}

	public void setRegisterService(IRegisterService registerService) {
		this.RegisterService = registerService;
	}
    
	//输入参数
	private Register  register;
	
	
	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	//返回JSON字符串
	private String jsonString;

	

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	
    public String register(){
    	 RegisterService.saveUser(register);
		return "success";
    	
    }
    
    public String checkUsername(Register register ){
    	RegisterService.findByUsername(register.getUserName());
		return "false"; 	
    }
    public String checkNickname(){
    	RegisterService.findByUsername(register.getNickName());
    	return "false";
    }

}
