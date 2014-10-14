package com.rc.dl.service;

import java.io.InputStream;
import java.util.List;

import com.rc.dl.bean.FItem;

public interface IFItemService {
	//获取访问量最高的n个潮品
	public List<FItem> getTop(int limit);
	//增删改查
	
	public List<FItem> findAll();
	
	public void save(FItem fitem);
	
	public void delete(FItem fitem);
	
	public FItem findById(int id);
	
	public void update(FItem fitem);
	
	public InputStream getInputStream();
	
	
	//1.点击计算浏览量PV
	public void clickToUpPV(int id, int pv);
	//2.显示潮品详情页面
	
	//3.显示
	

}
