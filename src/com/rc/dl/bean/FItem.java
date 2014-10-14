package com.rc.dl.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FASHION_ITEM")
public class FItem {
	
	public FItem(){
		
	}
	
	public FItem(String name){
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//item name
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	//item detailname
	@Column(name = "dname", nullable = true, length = 200)
	private String dname;
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	//taobao url
	@Column(name = "url", nullable = true, length = 200)
	private String url;
	
	// page views
	@Column(name = "pv")
	private int pv;
	
	// pic_m_url
	@Column(name = "pic_m_dir", nullable = true, length = 200)
	private String pic_m_dir;
	
	//pic_detail_url
	@Column(name = "pic_d_dir", nullable = true, length = 200)
	private String pic_d_dir;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	public String getPic_m_dir() {
		return pic_m_dir;
	}
	public void setPic_m_dir(String pic_m_dir) {
		this.pic_m_dir = pic_m_dir;
	}
	public String getPic_d_dir() {
		return pic_d_dir;
	}
	public void setPic_d_dir(String pic_d_dir) {
		this.pic_d_dir = pic_d_dir;
	}

}
