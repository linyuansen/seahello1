package com.rc.dl.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.rc.dl.common.Constant;
import com.rc.dl.dao.IUserDao;

/**
 * 鉴权处理  不符合条件的直接跳首页
 * session超时问题
 * @author cat
 *
 */
public class RcInterceptor extends ActionSupport implements Interceptor
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7882529833120161722L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
//		String path = request.getRequestURI();
//		String basePath = 
//			request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		//两种方式来在拦截器中获取DAO 可以是注入和直接掉ApplicationContext来获得BEAN
		ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
		//获取Session
		Map<String,Object> session = ActionContext.getContext().getSession();
		String method = invocation.getProxy().getMethod();
		//如果是登陆请求
		if(Constant.LOGIN_METHOD.equals(method)|| Constant.CHECK_USER.equals(method)||Constant.REGISTER_METHOD.equals(method))
		{
			 invocation.invoke();
		}
		else
		{
		    String userName = (String) session.get("userName");
			//session超时
			if(null!=userName)
			{
				//获取数据库的KEY
				IUserDao userDao = (IUserDao)ctx.getBean("userDao");
		        //String dbkey = xxdao.findkey();
				String dbkey = userDao.findByUserName(userName).getKey();
				String sessionKey = (String) session.get("key");
				if(null!=sessionKey && sessionKey.equals(dbkey))
				{
					 invocation.invoke();
				}
//				else
//				{
//					PrintWriter out = response.getWriter();
//					String outString=Constant.OUT_STRING;
//					String scriptOut = "<script type=\"text/javascript\"> alert(\""+outString+ "\");</script>";
//					out.println(scriptOut);
//					out.flush();
//				}
			}
			
		}
		return "login";
		
	}
	
}