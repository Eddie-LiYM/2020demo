package com.ks.roads.dao.impl;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.ks.roads.dao.IRFRDao;
import com.ks.roads.pojo.BrokenRecord;
import com.ks.roads.pojo.Dljbzlk;
import com.ks.roads.pojo.PCIScore;
import com.ks.roads.pojo.RQIScore;
import com.ks.roads.pojo.RoadFlatRecord;
import com.ks.roads.utils.RoadProjDBUtils;

public class RFRDao implements IRFRDao{
    @Override
    public void addRecord(RoadFlatRecord roadFlatRecord) {
    	String sql = "insert into 道路路面平整度检测记录表 values(?, ?, ?, ?, ?, ?, ?)";

        Connection connection = RoadProjDBUtils.getConnection();

        try {

            PreparedStatement prepareStatement = connection.prepareStatement(sql);

            prepareStatement.setDate(1, new java.sql.Date( roadFlatRecord.getDate().getTime()));
            prepareStatement.setString(2, roadFlatRecord.getRecordnum());
            prepareStatement.setString(3, roadFlatRecord.getTestperson());
            prepareStatement.setString(4, roadFlatRecord.getRoadid());
            prepareStatement.setString(5, roadFlatRecord.getRoadname());
            prepareStatement.setString(6, roadFlatRecord.getIri());
            prepareStatement.setString(7, roadFlatRecord.getNotes());


            System.out.println(sql);

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
    public void addBrokenRecord(BrokenRecord brokenRecord) {
    	String sql = "insert into 道路设施路面损害情况记录表 values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = RoadProjDBUtils.getConnection();

        try {

            PreparedStatement prepareStatement = connection.prepareStatement(sql);

            prepareStatement.setDate(1, new java.sql.Date(brokenRecord.getDate().getTime()));
            prepareStatement.setString(2, brokenRecord.getQzwz());
            prepareStatement.setString(3, brokenRecord.getJczc());
            prepareStatement.setString(4, brokenRecord.getJczk());
            prepareStatement.setString(5, brokenRecord.getShc());
            prepareStatement.setString(6, brokenRecord.getShk());
            prepareStatement.setString(7, brokenRecord.getShg());
            prepareStatement.setString(8, brokenRecord.getShqkms());
            prepareStatement.setString(9, brokenRecord.getShmj());
            prepareStatement.setString(10, brokenRecord.getRoadid());
            prepareStatement.setString(11, brokenRecord.getRoadname());
            prepareStatement.setString(12, brokenRecord.getDllx());
            prepareStatement.setString(13, brokenRecord.getShlxmc());
            //prepareStatement.setString(14, brokenRecord.getshlx()));
            prepareStatement.setString(14, brokenRecord.getNotes());


            System.out.println(sql);

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
    public void addDljbzlk(Dljbzlk dljbzlk) {
    	String sql = "insert into 道路基本资料卡 values(?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?)";

        Connection connection = RoadProjDBUtils.getConnection();

        try {

            PreparedStatement prepareStatement = connection.prepareStatement(sql);

            prepareStatement.setString(1, dljbzlk.getZbdw());
            prepareStatement.setString(2, dljbzlk.getDlmc());
            prepareStatement.setString(3, dljbzlk.getDlbh());
            prepareStatement.setString(4, dljbzlk.getSsxz());
            prepareStatement.setInt(5, dljbzlk.getDldj());

            prepareStatement.setString(6, dljbzlk.getDllx());
            prepareStatement.setString(7, dljbzlk.getLmlx());
            prepareStatement.setString(8, dljbzlk.getGldw());
            prepareStatement.setString(9, dljbzlk.getDlzx());
            prepareStatement.setString(10, dljbzlk.getQd());

            prepareStatement.setString(11, dljbzlk.getZd());
            prepareStatement.setString(12, dljbzlk.getSjdw());
            prepareStatement.setString(13, dljbzlk.getSgdw());
            prepareStatement.setString(14, dljbzlk.getLmdj());
            prepareStatement.setString(15, dljbzlk.getSjss());

            prepareStatement.setString(16, dljbzlk.getLfkdfw());
            prepareStatement.setString(17, dljbzlk.getDlcd());
            prepareStatement.setString(18, dljbzlk.getDlmj());
            prepareStatement.setString(19, dljbzlk.getAadt());
            prepareStatement.setString(20, dljbzlk.getJtldj());

            prepareStatement.setString(21, dljbzlk.getGlfl());
            prepareStatement.setString(22, dljbzlk.getYhdw());
            prepareStatement.setDate(23, new java.sql.Date(dljbzlk.getJzny().getTime()));
            prepareStatement.setString(24, dljbzlk.getCxdlmhd());
            prepareStatement.setString(25, dljbzlk.getCxdjclx());

            prepareStatement.setString(26,dljbzlk.getCxdjchd());
            prepareStatement.setString(27,dljbzlk.getCxdcds());
            prepareStatement.setString(28,dljbzlk.getCxdtxfx() );
            prepareStatement.setString(29, dljbzlk.getCxdkdfw());
            prepareStatement.setString(30, dljbzlk.getZfjdcdkd());

            prepareStatement.setString(31, dljbzlk.getYfjdcdkd());
            prepareStatement.setString(32, dljbzlk.getCxdmj());
            prepareStatement.setString(33, dljbzlk.getYwgjzycd());
            prepareStatement.setString(34, dljbzlk.getCslx());
            prepareStatement.setString(35, dljbzlk.getCscd());

            prepareStatement.setString(36, dljbzlk.getPslx());
            prepareStatement.setString(37, dljbzlk.getPscd());
            prepareStatement.setString(38, dljbzlk.getShr());
            prepareStatement.setString(39, dljbzlk.getZbr());
            prepareStatement.setDate(40, new java.sql.Date(dljbzlk.getZbrq().getTime()));

            System.out.println(sql);

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
    public List<RoadFlatRecord> findAll(){
    	String sql = "select * from 道路路面平整度检测记录表";

        List<RoadFlatRecord> list = new ArrayList<RoadFlatRecord>();

        Connection connection = RoadProjDBUtils.getConnection();

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Date date = resultSet.getDate("rq");
                String recordnum = resultSet.getString("pzdjlh");
                String testperson = resultSet.getString("jcry");
                String roadid = resultSet.getString("dlbh");
                String roadname = resultSet.getString("dlmc");
                String iri = resultSet.getString("IRI");
                String notes = resultSet.getString("bz");

                RoadFlatRecord roadFlatRecord = new RoadFlatRecord(date,testperson,roadid,roadname,recordnum,iri,notes);

                System.out.println(date+" "+recordnum+" "+roadid+" "+roadname+" "+iri);
                list.add(roadFlatRecord);
            }
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
    public List<RQIScore> finAll() {

    	String sql = "select * from 道路路面平整度检测记录表";

        List<RQIScore> list = new ArrayList<RQIScore>();

        Connection connection = RoadProjDBUtils.getConnection();

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Date date = resultSet.getDate("rq");
                String recordnum = resultSet.getString("pzdjlh");
                String testperson = resultSet.getString("jcry");
                String roadid = resultSet.getString("dlbh");
                String roadname = resultSet.getString("dlmc");
                String iri = resultSet.getString("IRI");
                String notes = resultSet.getString("bz");

                RoadFlatRecord roadFlatRecord = new RoadFlatRecord(date,testperson,roadid,roadname,recordnum,iri,notes);

                System.out.println(date+" "+recordnum+" "+roadid+" "+roadname+" "+iri);
                //list.add(roadFlatRecord);
            }
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
	public List<PCIScore> findAllpci() {
		// TODO Auto-generated method stub
		return null;
	}

}
