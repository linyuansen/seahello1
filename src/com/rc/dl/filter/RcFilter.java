package com.rc.dl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

/**
 * 
 * 请求过滤器过滤掉除login.jsp之外的请求
 * @author cat
 *
 */
public class RcFilter implements Filter
{
	private final static String LOGIN_PAGE = "login.jsp";
	private final static String REGIST_PAGE = "regist.jsp";
	//销毁过滤器
	@Override
	public void destroy() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain chain) throws IOException, ServletException 
	{
		// 获取HttpServletRequest HttpServletResponse
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		//设置格式
		servletRequest.setCharacterEncoding("UTF-8");
		servletResponse.setCharacterEncoding("UTF-8");
		//功程名如：/rcdl
		String bath = request.getContextPath();
		//工程名+请求  如  /rcdl/login.jsp
		String requestUri = request.getRequestURI();
		String basePath = 
			request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+bath+"/";
		String uri = requestUri.substring(requestUri.lastIndexOf("/")+1,requestUri.length());
		//判断请是不是以login.jsp结尾的请求
		if(LOGIN_PAGE.equals(uri) || requestUri.equals(bath+"/")||REGIST_PAGE.equals(uri) )
		{
			//设置cookie
			Cookie[] cookies = ServletActionContext.getRequest().getCookies();
			//如果客户端没有cookies，不取出来，如果有证明之前保存了密码用户取出值做登录
			if(null!=cookies)
			{
				//循环遍历Cookie[]数组 
				for(Cookie cookie:cookies)
				{
					//判断cookie的名字是否有上次登录时候保存的cookie名
					if(cookie.getName().equals("userName_cookie"))
					{
						//若果有 绑定cookie值到session
						ServletActionContext.getRequest().getSession().setAttribute("loginName", cookie.getValue());
					}
					if(cookie.getName().equals("userPwd_cookie"))
					{
						//若果有 绑定cookie值到session
						ServletActionContext.getRequest().getSession().setAttribute("loginPwd", cookie.getValue());
					}
				}
			}
			
		}
		else
		{
			response.sendRedirect(basePath);
		}
		chain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException 
	{
		// TODO Auto-generated method stub
		
	}

}
