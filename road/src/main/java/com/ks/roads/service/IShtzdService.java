package com.ks.roads.service;

import java.util.List;

import com.ks.roads.pojo.Shtzd;

public interface IShtzdService {

	void insert(Shtzd shtzd);

	List<Shtzd> findAll();

	void delete(String tzh);

}
