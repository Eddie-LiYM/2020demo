package com.ks.roads.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ks.roads.dao.IShtzdDao;
import com.ks.roads.pojo.Rcxj;
import com.ks.roads.pojo.Shtzd;
import com.ks.roads.utils.MyDBUtils;

public class ShtzdDao implements IShtzdDao {

	@Override
	public void insert(Shtzd shtzd) {
		
		String sql="insert into 设备损坏通知单(tzh, xcry, ssmc, shbw,shyy,clyj,jsy, rq, bj, zxsj,bz)"+ " values('"+ shtzd.getTzh()+"','"+ shtzd.getXcry()+"','"+shtzd.getSsmc()+"','"+shtzd.getShbw()+"','"+shtzd.getShyy()+"','"+shtzd.getClyj()+"','"+shtzd.getJsy()+"','"+new java.sql.Date(shtzd.getRq().getTime())+"','"+shtzd.getBj()+"','"+new java.sql.Date(shtzd.getZxsj().getTime())+"','"+shtzd.getBz()+"')";
		System.out.println(sql);
		//new java.sql.Date(shtzd.getRq().getTime())
		
		Connection connection=null;
		Statement stmt=null;
		int a=0;
		try {
			connection = MyDBUtils.getConnection();
	    	stmt=connection.createStatement();
	    	a=stmt.executeUpdate(sql);
	    }catch (Exception e) {	 
	           e.printStackTrace();	 
	       } finally {	 
	           try {
	                if (connection != null) {
	                    connection.close();
	                }	 
	               if(stmt!=null){
	                   stmt.close();
	                }

	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	       }
		
	}

	@Override
	public List<Shtzd> findAll() {
		
		String sql = "select * from 设备损坏通知单";

		// 用于存储查询到的所有数据的对象
		List<Shtzd> list = new ArrayList<Shtzd>();

		// 获取链接对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 获取执行sql语句的对象
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// 执行sql语句, 获取到结果集
			ResultSet resultSet = preparedStatement.executeQuery();
			
			//rq, xcry, dlbh, dlmc,shqkms,bz
			while (resultSet.next()) {
				
				Date rq = resultSet.getDate("rq");
				Date zxsj = resultSet.getDate("zxsj");
				String tzh = resultSet.getString("tzh");
				String xcry = resultSet.getString("xcry");
				String ssmc = resultSet.getString("ssmc");
				String shbw = resultSet.getString("shbw");
				String shyy = resultSet.getString("shyy");
				String clyj = resultSet.getString("clyj");
				String jsy = resultSet.getString("jsy");
				String bj = resultSet.getString("bj");
				String bz = resultSet.getString("bz");
				

				// 把数据封装到实体对象中
				Shtzd shtzd = new Shtzd(tzh, xcry, ssmc, shbw,shyy,clyj,jsy, rq, bj, zxsj,bz);

				// 把封装好的实体对象存储到集合中
				list.add(shtzd);
			}

			// 把集合对象返回出去
			//return list;

		} catch (Exception e) {
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public void delete(String tzh) {
		String sql = "delete from 设备损坏通知单 where tzh=?";

		// 获取链接对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 获取执行sql语句的对象
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, tzh);

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

}
