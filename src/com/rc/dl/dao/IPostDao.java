package com.rc.dl.dao;

import java.util.List;

import com.rc.dl.bean.Post;

public interface IPostDao {
	public int doCreate(Post object);
	public void doUpdate(Post object);
	public void doDelete(Post object);
	public Post findById(int id);
	public List<Post> findAll();

}
