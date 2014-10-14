package com.rc.dl.service;

import java.util.List;

import com.rc.dl.bean.Order;
import com.rc.dl.bean.PageParam;


/**
 * 发布订单SERVICE接口
 * @author cat
 *
 */
public interface ISendManageService 
{
	/**
	 * 根据客户ID查询所有发布的订单
	 */
	public List<Order> findSendLists(String customID);
	
	/**
	 * 根据客户ID查询所有发布的订单分页
	 */
	List<Order> findSendOrdersPage(String customID, PageParam pageParam);
}
