package com.ks.roads.test;

import java.sql.Connection;

import com.ks.roads.utils.MyDBUtils;



public class TestConnection {

	public static void main(String[] args) {
		
		Connection connection = MyDBUtils.getConnection();
		System.out.println(connection);
	}
	
}
