package com.rc.dl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.rc.dl.bean.Post;
import com.rc.dl.dao.IPostDao;
import com.rc.dl.service.IPostService;

@Transactional
public class PostServiceImpl implements IPostService{
	@Resource
	private IPostDao postDao;

	@Override
	public List<Post> findAll() {
		return postDao.findAll();
	}

	@Override
	public void save(Post post) {
		postDao.doCreate(post);
	}

	@Override
	public void delete(Post post) {
		postDao.doDelete(post);
	}

	@Override
	public Post findById(int id) {
		return postDao.findById(id);
	}

	@Override
	public void update(Post post) {
		postDao.doUpdate(post);
	}

}
