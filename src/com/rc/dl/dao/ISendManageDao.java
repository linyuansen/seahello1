package com.rc.dl.dao;

import java.util.List;

import com.rc.dl.bean.Order;
import com.rc.dl.bean.PageParam;


/**
 * 发布订单的DAO接口
 * @author cat
 *
 */
public interface ISendManageDao 
{
	/**
	 * 根据用户ID查询发布的订单
	 */
	List<Order> findSendOrders(String customID );
	
	/**
	 * 分页查询发单信息
	 */
	List<Order> findSendOrdersPage(String customID,PageParam pageParam);
}
