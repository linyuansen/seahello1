package com.rc.dl.service;

import java.util.List;

import com.rc.dl.bean.Post;

public interface IPostService {
	public List<Post> findAll();
	
	public void save(Post object);
	
	public void delete(Post object);
	
	public Post findById(int id);
	
	public void update(Post object);

}
