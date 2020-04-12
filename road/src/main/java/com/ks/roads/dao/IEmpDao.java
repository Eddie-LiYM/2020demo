package com.ks.roads.dao;

import java.util.List;

import com.ks.roads.pojo.Emp;



/**
 * emp的持久层接口
 */
public interface IEmpDao {

	/**
	 * 通过昵称和密码查找emp对象
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String yhm, String mm);

	/**
	 * 根据昵称判断用户是否存在
	 * 
	 * @param yhm
	 * @return
	 */
	int findEmpByNickname(String yhm);

	/**
	 * 注册员工信息
	 * 
	 * @param emp
	 */
	void registerEmp(Emp emp);

	/**
	 * 获取所有emp信息
	 * 
	 * @return
	 */
	List<Emp> findAll();

	/**
	 * 根据yhm删除emp
	 * 
	 * @param id
	 */
	void deleteById(String yhm);

	

	List<Emp> findByNickname(String yhm);

}
