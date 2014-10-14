package com.rc.dl.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户信息实体类
 * @author cat
 *
 */
@Entity
@Table(name = "T_USER_INFO")
public class User 
{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 用户名
	 */
	@Column(name = "USER_NAME")
	private String userName;
	/**
	 * 密码
	 */
	@Column(name = "PASSWORD")
	private String password;
	
	/**
	 * 登录密匙
	 * @return
	 */
	@Column(name = "LOGIN_KEY")
	private String key;
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
