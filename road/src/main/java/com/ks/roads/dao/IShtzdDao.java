package com.ks.roads.dao;

import java.util.List;

import com.ks.roads.pojo.Shtzd;

public interface IShtzdDao {

	void insert(Shtzd shtzd);

	List<Shtzd> findAll();

	void delete(String tzh);

}
