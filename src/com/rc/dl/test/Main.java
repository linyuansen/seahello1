package com.rc.dl.test;

import com.rc.dl.bean.FItem;
import com.rc.dl.bean.User;
import com.rc.dl.dao.IFItemDao;
import com.rc.dl.dao.IUserDao;
import com.rc.dl.dao.impl.FItemDAOImpl;
import com.vaannila.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
//		
//		FItem item = new FItem("fashion item two11");
//		IFItemDao dao = null;
//		
//
//		dao.doCreate(item);
//		item.setUrl("url test");
//		dao.doUpdate(item);
//		item.setName("fashion item 5");
//		dao.doCreate(item);
//		item.setName("fashion item 6");
//		dao.doCreate(item);
		
		User user = new User();
		user.setUserName("linys");
		user.setPassword("linys");
		IUserDao dao= null;
		
		

	}
}
