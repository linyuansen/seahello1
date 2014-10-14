package com.rc.dl.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.rc.dl.bean.Post;
import com.rc.dl.dao.IPostDao;
import com.rc.dl.service.IPostService;

public class PostAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Post post;
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public List<Post> getListPost() {
		return listPost;
	}
	public void setListPost(List<Post> listPost) {
		this.listPost = listPost;
	}
	private List<Post> listPost;
	
	@Resource
	private IPostService postService;
	
	public String create(){
		postService.save(this.post);
		return SUCCESS;
	}
	public String update(){
		postService.update(this.post);
		return SUCCESS;
	}
	
	public String list(){
		listPost = postService.findAll();
		return SUCCESS;
	}
	
	public String delete(){
		postService.delete(this.post);
		return SUCCESS;
	}
	
	public String edit(){
		this.post = postService.findById(this.post.getId());
		return SUCCESS;
	}

}
