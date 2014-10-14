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
	public User(){	
	}
	
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
	@Column(name = "username", nullable = false, length = 100)
	private String userName;
	/**
	 * 密码
	 */
	@Column(name = "password", nullable = true, length = 200)
	private String password;
	
	/**
	 * 登录密匙
	 * @return
	 */
	@Column(name = "loginKey", nullable = true, length = 20)
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
