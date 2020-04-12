package com.ks.roads.service;

import java.util.List;

import com.ks.roads.pojo.Rcxj;

public interface IRcxjService {

	

	
	void insertRcxj(Rcxj rcxj);

	List<Rcxj> findAll();

	void deleteByXcry(String xcry);

	List<Rcxj> findRcxjByXcry(String xcry);

	void updateRcxj(Rcxj rcxj,String xcry2);

	

	

	

}
