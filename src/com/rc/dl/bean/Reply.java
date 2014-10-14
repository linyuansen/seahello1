package com.rc.dl.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_REPLY")
public class Reply {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "postid", nullable = false)
	private int postId;
	
	@Column(name = "useid", nullable = false)
	private int useId;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "content", nullable = false)
	private String content;
	

}
