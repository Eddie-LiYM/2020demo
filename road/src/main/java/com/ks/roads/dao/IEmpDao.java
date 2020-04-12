package com.ks.roads.dao;

import java.util.List;

import com.ks.roads.pojo.Emp;



/**
 * emp�ĳ־ò�ӿ�
 */
public interface IEmpDao {

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
	 * @param yhm
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
	 * ����yhmɾ��emp
	 * 
	 * @param id
	 */
	void deleteById(String yhm);

	

	List<Emp> findByNickname(String yhm);

}
