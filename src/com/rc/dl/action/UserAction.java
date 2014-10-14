 package com.rc.dl.action;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.codehaus.jackson.map.ObjectMapper;

import com.opensymphony.xwork2.ActionSupport;
import com.rc.dl.bean.User;
import com.rc.dl.common.Constant;
import com.rc.dl.service.IUserService;

/**
 * 登录的ACTION
 * @author cat
 *
 */
public class UserAction extends ActionSupport implements ServletRequestAware ,ServletResponseAware
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1506542947327300206L;
	
	@Resource
	private IUserService userService;
	
	
	
	public IUserService getUserService() {
		return userService;
	}



	public void setUserService(IUserService userService) {
		this.userService = userService;
	}



	//输入参数
	private User user;
	
	private String saveCookie;
	
	//登录返回JSON字符串
	private String jsonString;
	
	private ObjectMapper objectMapper;
	
	private HttpServletRequest request;
	
	private HttpServletResponse response;
	
	public HttpServletRequest getRequest() {
		return request;
	}



	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}



	public HttpServletResponse getResponse() {
		return response;
	}



	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}



	public String getSaveCookie() {
		return saveCookie;
	}



	public void setSaveCookie(String saveCookie) {
		this.saveCookie = saveCookie;
	}



	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}



	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}



	public String getJsonString() {
		return jsonString;
	}



	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	/**
	 *登录 
	 * @return
	 */
	public String login()
	{
		String loginString = userService.login(user.getUserName(), user.getPassword());
		
		if(Constant.lOGIN_SUCCESS.equals(loginString))
		{
			//设置登录密匙
			String uuid = UUID.randomUUID().toString();
			String key = uuid.substring(0, 20);
			userService.updateUUID(key,user.getUserName());
			int id = userService.findUserByName(user.getUserName()).getId();
			//绑定到session
			HttpSession session =request.getSession();
			session.setAttribute("key", key);
			session.setAttribute("userName", user.getUserName());
			session.setAttribute("userId", String.valueOf(id));
			
			//设置cookie
			Cookie userNameCookie = new Cookie("loginName",user.getUserName());
			Cookie passwordCookie = new Cookie("loginPwd",user.getPassword());
			//如果选中保存一周
			if(Constant.SAVE_COOKIE.equals(saveCookie))
			{
				//设置cookie时间
				userNameCookie.setMaxAge(7*24*3600);
				passwordCookie.setMaxAge(7*24*3600);
				//可在同一应用服务器内共享方法
				userNameCookie.setPath("/");
				passwordCookie.setPath("/");
			}
			else
			{
				//设置cookie时间
				userNameCookie.setMaxAge(0);
				passwordCookie.setMaxAge(0);
				//可在同一应用服务器内共享方法
				userNameCookie.setPath("/");
				passwordCookie.setPath("/");
			}
			//写入cookie
			response.addCookie(userNameCookie);
			response.addCookie(passwordCookie);
			return SUCCESS;
		}		
		return "fail";
			
	}
	/**
	 * 验证用户
	 * @return
	 */
	public String checkUser()
	{
		String loginString = userService.login(user.getUserName(), user.getPassword());
		if(Constant.lOGIN_SUCCESS.equals(loginString))
		{
			jsonString = "0";
		}
		
		if(Constant.ERROR_USER.equals(loginString))
		{
			jsonString = "1";
		}
		
		if(Constant.ERROR_PASSWORD.equals(loginString))
		{
			jsonString = "2";
		}
		
		return "success";
	}


	@Override
	public void setServletRequest(HttpServletRequest request) 
	{
		this.request = request;
		
	}



	@Override
	public void setServletResponse(HttpServletResponse response) 
	{
		this.response = response;		
	}

}
