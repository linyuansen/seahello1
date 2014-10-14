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

public class TestAction extends ActionSupport implements ServletRequestAware ,ServletResponseAware
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8393322464328170915L;
	
	
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

	@Resource
	private ISendManageService sendManageService;
	
	
	public ISendManageService getSendManageService() {
		return sendManageService;
	}

	public void setSendManageService(ISendManageService sendManageService) {
		this.sendManageService = sendManageService;
	}
	
	//输入输出参数
	
	private List<Order> orders;
	
	private PageParam pageParam;
	
	
	
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public PageParam getPageParam() {
		return pageParam;
	}

	public void setPageParam(PageParam pageParam) {
		this.pageParam = pageParam;
	}

	public String test()
	{
		return SUCCESS;
	}
	
	/**
	 * 发单管理分页
	 */

	public String sendManageAsPage()
	{
		//查询自己发布的所有的订单		
		String id =  request.getSession().getAttribute("userId").toString();
		PageParam param1= new PageParam();
		param1.setEndTime("2014-06-23");
		param1.setMaxPrice("90");
		param1.setMinPrice("1");
		param1.setPageNum(2);
		param1.setPageSize(5);
		param1.setQueryId("1");
		param1.setStartTime("2014-06-09");
		orders = sendManageService.findSendOrdersPage(id,param1);
		return SUCCESS;
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
