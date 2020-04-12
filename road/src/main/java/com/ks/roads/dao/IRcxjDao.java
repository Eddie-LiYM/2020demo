package com.ks.roads.dao;

import java.util.List;

import com.ks.roads.pojo.Rcxj;

public interface IRcxjDao {

	void insertRcxj(Rcxj rcxj);

	List<Rcxj> findAll();

	void deleteByXcry(String xcry);

	List<Rcxj> findRcxjByXcry(String xcry);

	void updateRcxj(Rcxj rcxj, String xcry2);

}
