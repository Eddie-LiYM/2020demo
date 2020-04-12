package com.ks.roads.service;

import java.util.List;


import com.ks.roads.pojo.Emp;

/**
 * ����ӿ�
 *
 */
public interface IEmpService {

	/**
	 * ͨ���ǳƺ��������emp����
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String yhm, String mm);

	/**
	 * �����ǳ��ж��û��Ƿ����
	 * 
	 * @param nickname
	 * @return
	 */
	int findEmpByNickname(String yhm);

	/**
	 * ע��Ա����Ϣ
	 * 
	 * @param emp
	 */
	void registerEmp(Emp emp);

	/**
	 * ��ȡ����emp��Ϣ
	 * 
	 * @return
	 */
	List<Emp> findAll();

	/**
	 * ����idɾ��emp
	 * 
	 * @param id
	 */
	void deleteById(String yhm);

	List<Emp> findByNickname(String yhm);

}
