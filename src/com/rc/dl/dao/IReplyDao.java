package com.rc.dl.dao;

import com.rc.dl.bean.Reply;

public interface IReplyDao {
	public int doCreate(Reply object);
	public void doUpdate(Reply object);
	public void doDelete(Reply object);
	public Reply findById(int id);

}
