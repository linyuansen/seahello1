package com.rc.dl.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.rc.dl.bean.Order;
import com.rc.dl.bean.PageParam;
import com.rc.dl.service.ISendManageService;

/**
 * 页面跳转Action
 * @author cat
 *
 */
public class LocationUrlAction extends ActionSupport implements ServletRequestAware ,ServletResponseAware
{

	private HttpServletRequest request;
	
	private HttpServletResponse response;
	@Resource
	private ISendManageService sendManageService;
	
	
	public ISendManageService getSendManageService() {
		return sendManageService;
	}

	public void setSendManageService(ISendManageService sendManageService) {
		this.sendManageService = sendManageService;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1136665639642399015L;
	
	//输入输出参数
	
	private List<Order> orders;
	
	private PageParam pageParam;
	
	

	public PageParam getPageParam() {
		return pageParam;
	}

	public void setPageParam(PageParam pageParam) {
		this.pageParam = pageParam;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	/**
	 * 发单管理
	 */
	public String sendManage()
	{
		//查询自己发布的所有的订单
		String id =  request.getSession().getAttribute("userId").toString();
		orders = sendManageService.findSendLists(id);
		return SUCCESS;
	}
	
	/**
	 * 发单管理分页
	 */
	public String sendManageAsPage()
	{
		//查询自己发布的所有的订单
		String id =  request.getSession().getAttribute("userId").toString();
		orders = sendManageService.findSendOrdersPage(id,pageParam);
		return SUCCESS;
	}
	
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

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		
	}
	
}
