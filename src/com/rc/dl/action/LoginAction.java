package com.rc.dl.action;


import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.rc.dl.service.IFItemService;
 
public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	

 
	public String authenticate() {
 
		if (this.username.equals("admin")
				&& this.password.equals("admin")) {
			return "success";
		} else {
			addActionError(getText("error.login"));
                        //a function from ActionSupport, to get properties values from properties file
                        //we will explore this below.
			return "error";
		}
	}
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
}