package com.rc.dl.dao;

import java.util.List;

import com.rc.dl.bean.FItem;

public interface IFItemDao {
	
	//new
	public int doCreate(FItem item);
	
	//update
	public void doUpdate(FItem item);
	
	//delete
	void doDelete(FItem item);
	//query
	public FItem findById(int id);	
	public List<FItem> findAll(String keyWord);
	
	public void doUpdatePV(int id, int pv);
	
	public List<FItem> getTop(int limit);

	

	public void doSave(FItem fitem);

	

	
	

}
