package com.ks.roads.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ks.roads.dao.IRcxjDao;
import com.ks.roads.pojo.Rcxj;
import com.ks.roads.utils.MyDBUtils;

public class RcxjDao implements IRcxjDao {

	@Override
	public void insertRcxj(Rcxj rcxj) {
		/*
		//String sql = "insert into rcxj values(?,'?', '?', '?','?', '?')";
		//String sql = "insert into rcxj values("new java.sql.Date(rcxj.getRq().getTime())";
		
		String sql="insert into rcxj(rq1, xcry, dlbh, dlmc,shqkms,bz)values('"+rcxj.getRq()+"','"+ rcxj.getXcry()+"','"+rcxj.getDlbh()+"','"+rcxj.getDlmc()+"','"+rcxj.getShqkms()+"','"+rcxj.getBz()+"')";
		Connection connection = MyDBUtils.getConnection();
		
		System.out.println(rcxj);
		System.out.println(connection);
		
		
		try {
			// 获取到执行sql的对象
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			
			// 给占位符赋值
			
			prepareStatement.setDate(1, new java.sql.Date(rcxj.getRq().getTime()));
			prepareStatement.setString(2, rcxj.getXcry());
			prepareStatement.setString(3, rcxj.getDlbh());
			prepareStatement.setString(4, rcxj.getDlmc());
			prepareStatement.setString(5, rcxj.getShqkms());
			prepareStatement.setString(6, rcxj.getBz());
			
			// 执行 增, 删, 改, 都是使用executeUpdate()方法
			prepareStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("!!!!!!!!!!!!!!!!!");
		} finally {
			try {
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		*/

		String sql="insert into 道路设施日常巡查情况记录表(rq, xcry, dlbh, dlmc,shqkms,bz)values('"+new java.sql.Date(rcxj.getRq().getTime())+"','"+ rcxj.getXcry()+"','"+rcxj.getDlbh()+"','"+rcxj.getDlmc()+"','"+rcxj.getShqkms()+"','"+rcxj.getBz()+"')";
		//String sql="insert into dlssrcxcqkjlb(rq,xcjlh,xcryid,dlbh,shwzjqkms,bz)values('"+new java.sql.Date(rcxj.getrq().getTime())+"','"+ rcxj.getxcjlh()+"','"+xc.getxcry()+"','"+xc.getdlbh()+"','"+xc.getshwzjshqkms()+"','"+xc.getbz()+"')";
		Connection connection=null;
		Statement stmt=null;
		//boolean f=false;
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
	    //if(a>0)
	    	//f= true;
	    //return f;
	}

	@Override
	public List<Rcxj> findAll() {
		

		String sql = "select * from 道路设施日常巡查情况记录表";

		// 用于存储查询到的所有数据的对象
		List<Rcxj> list = new ArrayList<Rcxj>();

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
				String xcry = resultSet.getString("xcry");
				String dlbh = resultSet.getString("dlbh");
				String dlmc = resultSet.getString("dlmc");
				String shqkms = resultSet.getString("shqkms");
				String bz = resultSet.getString("bz");
				

				// 把数据封装到实体对象中
				Rcxj rcxj = new Rcxj(rq, xcry, dlbh, dlmc,shqkms,bz);

				// 把封装好的实体对象存储到集合中
				list.add(rcxj);
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
	public void deleteByXcry(String xcry) {
		String sql = "delete from 道路设施日常巡查情况记录表 where xcry=?";

		// 获取链接对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 获取执行sql语句的对象
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, xcry);

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
	public List<Rcxj> findRcxjByXcry(String xcry) {
		String sql = "select * from 道路设施日常巡查情况记录表 where xcry='"+xcry+"'";
		
		// 用于存储查询到的所有数据的对象
				List<Rcxj> list = new ArrayList<Rcxj>();

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
						String xcry1 = resultSet.getString("xcry");
						String dlbh = resultSet.getString("dlbh");
						String dlmc = resultSet.getString("dlmc");
						String shqkms = resultSet.getString("shqkms");
						String bz = resultSet.getString("bz");
						

						// 把数据封装到实体对象中
						Rcxj rcxj = new Rcxj(rq, xcry1, dlbh, dlmc,shqkms,bz);

						// 把封装好的实体对象存储到集合中
						list.add(rcxj);
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
	public void updateRcxj(Rcxj rcxj,String xcry2) {
		String sql="update 道路设施日常巡查情况记录表 set rq=?, xcry=?, dlbh=?, dlmc=?,shqkms=?,bz=? where xcry=?";
		//values('"+new java.sql.Date(rcxj.getRq().getTime())+"','"+ rcxj.getXcry()+"','"+rcxj.getDlbh()+"','"+rcxj.getDlmc()+"','"+rcxj.getShqkms()+"','"+rcxj.getBz()+"')";
		//String sql="insert into dlssrcxcqkjlb(rq,xcjlh,xcryid,dlbh,shwzjqkms,bz)values('"+new java.sql.Date(rcxj.getrq().getTime())+"','"+ rcxj.getxcjlh()+"','"+xc.getxcry()+"','"+xc.getdlbh()+"','"+xc.getshwzjshqkms()+"','"+xc.getbz()+"')";
		// String sql="update sbshtzd set tzh=?,xcjlh=?,jsryid=?,banzid=?,ssmc=?,shbw=?,shyy=?,clyj=?,rq=?,bj=?,zxsj=? where tzh='"+tzd.gettzh()+"'";
		Connection connection=null;
		PreparedStatement prepareStatement=null;
		//Statement stmt=null;
		//boolean f=false;
		int a=0;
		try {
			connection = MyDBUtils.getConnection();
	    	
			// 获取到执行sql的对象
			prepareStatement = connection.prepareStatement(sql);
						
			// 给占位符赋值
			prepareStatement.setDate(1, new java.sql.Date(rcxj.getRq().getTime()));
			prepareStatement.setString(2, rcxj.getXcry());
			prepareStatement.setString(3, rcxj.getDlbh());
			prepareStatement.setString(4, rcxj.getDlmc());
			prepareStatement.setString(5, rcxj.getShqkms());
			prepareStatement.setString(6, rcxj.getBz());
			prepareStatement.setString(7, xcry2);
			// 执行 增, 删, 改, 都是使用executeUpdate()方法
			prepareStatement.executeUpdate();
	    	
	    }catch (Exception e) {	 
	           e.printStackTrace();	 
	       } finally {	 
	           try {
	        	   if (connection != null) {
	              
	                    connection.close();
	        	   }
	              
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	       }
	}

}
