package com.rc.dl.service.impl;

import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.rc.dl.bean.FItem;
import com.rc.dl.dao.IFItemDao;
import com.rc.dl.service.IFItemService;

@Transactional
public class FItemServiceImpl implements IFItemService {
	//注入DAO
	@Resource
	private IFItemDao fitemDao;

	@Override
	public void clickToUpPV(int id, int pv) {
		fitemDao.doUpdatePV(id, pv + 1);

	}

	@Override
	public List<FItem> getTop(int limit) {
		return fitemDao.getTop(limit);
		
	}

	@Override
	public List<FItem> findAll() {
		return fitemDao.findAll(null);		
	}

	@Override
	public void save(FItem fitem) {
		fitemDao.doSave(fitem);
	}

	@Override
	public void delete(FItem fitem) {
		fitemDao.doDelete(fitem);
	}

	@Override
	public FItem findById(int id) {
		return fitemDao.findById(id);
	}

	@Override
	public void update(FItem fitem) {
		fitemDao.doUpdate(fitem);
	}

	@Override
	public InputStream getInputStream() {
		return null;
	}
	


}
