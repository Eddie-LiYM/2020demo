package com.ks.roads.service.impl;

import java.util.List;

import com.ks.roads.dao.IRcxjDao;
import com.ks.roads.dao.impl.RcxjDao;
import com.ks.roads.pojo.Rcxj;
import com.ks.roads.service.IRcxjService;

public class RcxjService implements IRcxjService{
	// 获取到专门处理持久层方面的对象
	private IRcxjDao rcxjDao = new RcxjDao();
	
	@Override
	public void insertRcxj(Rcxj rcxj) {
		
		rcxjDao.insertRcxj(rcxj);
	}

	@Override
	public List<Rcxj> findAll() {
	
		
		return rcxjDao.findAll();
	}

	@Override
	public void deleteByXcry(String xcry) {
		
		rcxjDao.deleteByXcry(xcry);
		
	}

	@Override
	public List<Rcxj> findRcxjByXcry(String xcry) {
		
		return rcxjDao.findRcxjByXcry(xcry);
	}

	@Override
	public void updateRcxj(Rcxj rcxj,String xcry2) {
		
		rcxjDao.updateRcxj(rcxj,xcry2);
		
	}

	

}
