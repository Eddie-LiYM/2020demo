package com.ks.roads.service.impl;

import java.util.List;

import com.ks.roads.dao.IEmpDao;
import com.ks.roads.dao.impl.EmpDao;
import com.ks.roads.pojo.Emp;
import com.ks.roads.service.IEmpService;



/**
 * 
 * ����ӿڵ�ʵ����
 * 
 * @author Administrator
 *
 */
public class EmpService implements IEmpService {
	// ��ȡ��ר�Ŵ���־ò㷽��Ķ���
	private IEmpDao empDao = new EmpDao();

	@Override
	public Emp findEmpByNicknameAndPassword(String yhm, String mm) {

		// ����dao�еķ���
		return empDao.findEmpByNicknameAndPassword(yhm, mm);

	}

	@Override
	public int findEmpByNickname(String yhm) {
		return empDao.findEmpByNickname(yhm);
	}

	@Override
	public void registerEmp(Emp emp) {
		empDao.registerEmp(emp);
	}

	@Override
	public List<Emp> findAll() {
		return empDao.findAll();
	}

	@Override
	public void deleteById(String yhm) {
		empDao.deleteById(yhm);
	}

	@Override
	public List<Emp> findByNickname(String yhm) {
		// TODO Auto-generated method stub
		return empDao.findByNickname(yhm);
	}

}
