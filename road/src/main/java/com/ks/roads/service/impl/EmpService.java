package com.ks.roads.service.impl;

import java.util.List;

import com.ks.roads.dao.IEmpDao;
import com.ks.roads.dao.impl.EmpDao;
import com.ks.roads.pojo.Emp;
import com.ks.roads.service.IEmpService;



/**
 * 
 * 服务接口的实现类
 * 
 * @author Administrator
 *
 */
public class EmpService implements IEmpService {
	// 获取到专门处理持久层方面的对象
	private IEmpDao empDao = new EmpDao();

	@Override
	public Emp findEmpByNicknameAndPassword(String yhm, String mm) {

		// 调用dao中的方法
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
