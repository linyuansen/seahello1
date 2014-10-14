package com.rc.dl.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rc.dl.bean.Order;
import com.rc.dl.bean.PageParam;
import com.rc.dl.dao.ISendManageDao;


public class SendManageDaoImpl implements ISendManageDao 
{
	//注入sessionFactory
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Order> findSendOrders(String customID) 
	{
		//根据发布者的ID来查   新增订单的时候此ID入库
		String hql = "from Order t where t.bossId =? ";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, customID);
		@SuppressWarnings("unchecked")
		List<Order> orderList = query.list();
		return orderList;
	}
	
	/**
	 * 分页查询发单信息
	 */
	@Override
	public List<Order> findSendOrdersPage(String customID,PageParam pageParam) {
		//获取HQL语句
		String hql = spellHql(pageParam);
		Query query = getSession().createQuery(hql);
		//设置起始行
		query.setFirstResult((pageParam.getPageNum()-1)*pageParam.getPageSize());
		//每页条数
		query.setMaxResults(pageParam.getPageSize());
		
		query.setString(0, customID);
		@SuppressWarnings("unchecked")
		List<Order> orders = query.list();
		return orders;
	}
	
	/**
	 * 根据QUERYID来拼写HQL语句
	 */
	public String spellHql(PageParam pageParam)
	{
		StringBuffer hql = new StringBuffer();
		hql.append("from Order t where t.bossId =? ");
		//如果ID 是1的话 表示 根据发布时间分页查询
		if("1".equals(pageParam.getQueryId()))
		{
			if(null!=pageParam.getStartTime() && !"".equals(pageParam.getStartTime()))
			{
				hql.append(" and ");
				hql.append(" t.creatTime >= '"+pageParam.getStartTime()+"' " );
				if(null!=pageParam.getEndTime() && !"".equals(pageParam.getEndTime()))
				{
					hql.append(" and t.creatTime  <=  '"+ pageParam.getEndTime()+"' " );
				}
				
				if(null!= pageParam.getMinPrice() && !"".equals(pageParam.getMinPrice()))
				{
					hql.append(" and ");
					hql.append(" t.orderPrice >= '"+pageParam.getMinPrice()+"' "  );
					if(null!= pageParam.getMaxPrice() && !"".equals(pageParam.getMaxPrice()))
					{
						hql.append("  and t.orderPrice  <=  '" +pageParam.getMaxPrice()+"' " );
					}
				}
			}
			else
			{
				if(null!=pageParam.getEndTime() && !"".equals(pageParam.getEndTime()))
				{
					hql.append(" and ");
					hql.append(" t.creatTime <= '"+pageParam.getEndTime()+"' " );
				}
				if(null!= pageParam.getMinPrice() && !"".equals(pageParam.getMinPrice()))
				{
					hql.append(" and ");
					hql.append(" t.orderPrice >= '"+  pageParam.getMinPrice()+"' " );
					if(null!= pageParam.getMaxPrice() && !"".equals(pageParam.getMaxPrice()))
					{
						hql.append("  and t.orderPrice <= '"+pageParam.getMaxPrice()+"' " );
					}
				}
			}
		}
		//如果ID 是2的话 表示 根据接单时间分页查询
		if("2".equals(pageParam.getQueryId()))
		{
			if(null!=pageParam.getStartTime() && !"".equals(pageParam.getStartTime()))
			{
				hql.append(" and ");
				hql.append(" t.startTime >= '"+pageParam.getStartTime()+"' " );
				if(null!= pageParam.getEndTime() && !"".equals(pageParam.getEndTime()))
				{
					hql.append(" and t.startTime <= '"+ pageParam.getEndTime()+"' " );
				}
				
				if(null!= pageParam.getMinPrice() && !"".equals(pageParam.getMinPrice()))
				{
					hql.append(" and ");
					hql.append(" t.orderPrice >= '"+pageParam.getMinPrice()+"' "  );
					if(null!= pageParam.getMaxPrice() && !"".equals(pageParam.getMaxPrice()))
					{
						hql.append("  and t.orderPrice <= '" +pageParam.getMaxPrice()+"' " );
					}
				}
			}
			else
			{
				if(null!=pageParam.getEndTime() && !"".equals(pageParam.getEndTime()))
				{
					hql.append(" and ");
					hql.append(" t.startTime <= '"+pageParam.getEndTime()+"' " );
				}
				if(null!= pageParam.getMinPrice() && !"".equals(pageParam.getMinPrice()))
				{
					hql.append(" and ");
					hql.append(" t.orderPrice >= '"+  pageParam.getMinPrice()+"' " );
					if(null!=pageParam.getMaxPrice() && !"".equals(pageParam.getMaxPrice()))
					{
						hql.append("  and t.orderPrice <= '"+pageParam.getMaxPrice()+"' " );
					}
				}
			}
		}
		
		//如果ID 是3的话 表示 根据订单结束时间分页查询
		if("3".equals(pageParam.getQueryId()))
		{
			if(null!=pageParam.getStartTime() && !"".equals(pageParam.getStartTime()))
			{
				hql.append(" and ");
				hql.append(" t.endTime >= '"+pageParam.getStartTime()+"' " );
				if(null!=pageParam.getEndTime() && !"".equals(pageParam.getEndTime()))
				{
					hql.append(" and endTime <= '"+ pageParam.getEndTime()+"' " );
				}
				
				if(null!= pageParam.getMinPrice() && !"".equals(pageParam.getMinPrice()))
				{
					hql.append(" and ");
					hql.append(" t.orderPrice >= "+pageParam.getMinPrice()  );
					if(null!=pageParam.getMaxPrice() && !"".equals(pageParam.getMaxPrice()))
					{
						hql.append("  and t.orderPrice <= '" +pageParam.getMaxPrice()+"' " );
					}
				}
			}
			else
			{
				if(null!=pageParam.getEndTime() && !"".equals(pageParam.getEndTime()))
				{
					hql.append(" and ");
					hql.append(" t.endTime <= '"+pageParam.getEndTime()+"' " );
				}
				if(null!= pageParam.getMinPrice() && !"".equals(pageParam.getMinPrice()))
				{
					hql.append(" and ");
					hql.append(" t.orderPrice >= '"+  pageParam.getMinPrice()+"' " );
					if(null!=pageParam.getMaxPrice() && !"".equals(pageParam.getMaxPrice()))
					{
						hql.append("  and t.orderPrice <= '"+pageParam.getMaxPrice()+"' " );
					}
				}
			}
		}
		return hql.toString();
	}


}
