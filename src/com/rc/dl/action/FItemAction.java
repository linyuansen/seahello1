package com.rc.dl.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rc.dl.bean.FItem;
import com.rc.dl.service.IFItemService;

public class FItemAction extends ActionSupport implements ServletRequestAware ,ServletResponseAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6468155750106596462L;
	
	private FItem fitem;
	private List<FItem> listFitem;

	public List<FItem> getListFitem() {
		return listFitem;
	}

	public void setListFitem(List<FItem> listFitem) {
		this.listFitem = listFitem;
	}

	public FItem getFitem() {
		return fitem;
	}

	public void setFitem(FItem fitem) {
		this.fitem = fitem;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Resource
	private IFItemService service;


	
	public String saveOrUpdate(){
		this.service.save(this.fitem);
		return SUCCESS;
	}
	
	public String list(){
		
		 listFitem = service.findAll();
		 return SUCCESS;
	}
	
	public String delete(){
//		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
//		this.fitem.setId(Integer.parseInt(request.getParameter("id")));
		this.service.delete(this.fitem);
		return SUCCESS;
	}
	
	public String edit(){
		
		this.fitem = this.service.findById(this.fitem.getId());		
		return SUCCESS;
	}
	
	public String genereteExcel(){
		return null;
	}
	
	
	


}
