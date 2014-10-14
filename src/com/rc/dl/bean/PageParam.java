package com.rc.dl.bean;
/**
 * 分页参数实体类
 * @author cat
 *
 */
public class PageParam 
{
	//查询类型ID
	private String queryId;
	
	//分页第几页
	private int pageNum;
	
	//分页的大小
	private int pageSize;
	
	//开始时间
	private String startTime;
	
	//结束时间
	private String endTime;
	
	//最小价格
	private String minPrice;
	
	//最大价格
	private String maxPrice;

	public String getQueryId() {
		return queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}
	
	
}
