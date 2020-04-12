package com.ks.roads.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ks.roads.dao.IEmpDao;
import com.ks.roads.pojo.Emp;
import com.ks.roads.utils.MyDBUtils;



/**
 * 持久层的实现类
 *
 */
public class EmpDao implements IEmpDao {

	@Override
	public Emp findEmpByNicknameAndPassword(String yhm, String mm) {

		String sql = "select * from 用户表 where yhm=? and mm=?";

		// 1, 获取到链接数据库的对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, 获取到执行sql语句的预编译对象
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, 给sql中的占位符[?] 赋值
			prepareStatement.setString(1, yhm);
			prepareStatement.setString(2, mm);

			// 4, 执行sql语句, 得到结果集
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, 如果有值, 则封装, 然后, 返回
			while (resultSet.next()) {
				// 获取数据库中对应的数据值
				//int id = resultSet.getInt("id");
				//String gender = resultSet.getString("gender");
				//double salary = resultSet.getDouble("salary");

				// 把数据更撞到对象中
				Emp emp = new Emp(yhm, mm);

				return emp;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 断开链接, 释放资源
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public int findEmpByNickname(String yhm) {

		String sql = "select * from 用户表 where yhm=?";

		// 1, 获取到链接数据库的对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, 获取到执行sql语句的预编译对象
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, 给sql中的占位符[?] 赋值
			prepareStatement.setString(1, yhm);

			// 4, 执行sql语句, 得到结果集
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, 如果有值, 则封装, 然后, 返回
			while (resultSet.next()) {

				return 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 断开链接, 释放资源
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public void registerEmp(Emp emp) {
		String sql = "insert into 用户表 values( ?, ?)";

		Connection connection = MyDBUtils.getConnection();

		try {
			// 获取到执行sql的对象
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 给占位符赋值
			prepareStatement.setString(1, emp.getYhm());
			prepareStatement.setString(2, emp.getMm());
			//prepareStatement.setString(3, emp.getGender());
			//prepareStatement.setDouble(4, emp.getSalary());

			// 执行 增, 删, 改, 都是使用executeUpdate()方法
			prepareStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<Emp> findAll() {

		String sql = "select * from 用户表";

		// 用于存储查询到的所有数据的对象
		List<Emp> list = new ArrayList<Emp>();

		// 获取链接对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 获取执行sql语句的对象
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// 执行sql语句, 获取到结果集
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				//int id = resultSet.getInt("id");
				String yhm = resultSet.getString("yhm");
				String mm = resultSet.getString("mm");
				//String gender = resultSet.getString("gender");
				//double salary = resultSet.getDouble("salary");

				// 把数据封装到实体对象中
				Emp emp = new Emp(yhm, mm);

				// 把封装好的实体对象存储到集合中
				list.add(emp);
			}

			// 把集合对象返回出去
			return list;

		} catch (Exception e) {
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public void deleteById(String yhm) {
		String sql = "delete from 用户表 where yhm=?";

		// 获取链接对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 获取执行sql语句的对象
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, yhm);

			preparedStatement.executeUpdate();

		} catch (Exception e) {
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<Emp> findByNickname(String yhm) {
		String sql = "select * from 用户表 where yhm='"+yhm+"'";

		// 用于存储查询到的所有数据的对象
		List<Emp> list = new ArrayList<Emp>();

		// 获取链接对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 获取执行sql语句的对象
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// 执行sql语句, 获取到结果集
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				//int id = resultSet.getInt("id");
				String yhm1 = resultSet.getString("yhm");
				String mm = resultSet.getString("mm");
				//String gender = resultSet.getString("gender");
				//double salary = resultSet.getDouble("salary");

				// 把数据封装到实体对象中
				Emp emp = new Emp(yhm1, mm);

				// 把封装好的实体对象存储到集合中
				list.add(emp);
			}

			// 把集合对象返回出去
			return list;

		} catch (Exception e) {
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
