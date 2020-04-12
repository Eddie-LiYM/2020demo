package com.ks.roads.service.impl;

import java.util.List;

import com.ks.roads.dao.IRcxjDao;
import com.ks.roads.dao.IShtzdDao;
import com.ks.roads.dao.impl.RcxjDao;
import com.ks.roads.dao.impl.ShtzdDao;
import com.ks.roads.pojo.Shtzd;
import com.ks.roads.service.IShtzdService;

public class ShtzdService implements IShtzdService{
	// ��ȡ��ר�Ŵ���־ò㷽��Ķ���
	private IShtzdDao shtzdDao = new ShtzdDao();
	
	@Override
	public void insert(Shtzd shtzd) {
		
		shtzdDao.insert(shtzd);
	}

	@Override
	public List<Shtzd> findAll() {
		
		return shtzdDao.findAll();
	}

	@Override
	public void delete(String tzh) {
		shtzdDao.delete(tzh);
		
	}

}
