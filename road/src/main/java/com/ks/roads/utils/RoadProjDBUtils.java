package com.ks.roads.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class RoadProjDBUtils {

	public static String driver;
	public static String url;
	public static String username;
	public static String password;

	// 锟斤拷锟节存储db.properties锟侥硷拷锟斤拷锟斤拷锟捷的硷拷锟斤拷
	private static Properties properties = new Properties();

	/** 私锟叫伙拷锟斤拷锟届方锟斤拷 */
	private RoadProjDBUtils() {
	}

	static {
		try {
			// 锟斤拷锟饺讹拷取db.properties锟侥硷拷
			InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");

			// 锟窖讹拷取锟斤拷db.properties锟侥硷拷锟叫碉拷锟斤拷锟捷硷拷锟诫到Properties锟斤拷锟斤拷锟斤拷
			properties.load(is);
			
			// 锟窖讹拷取锟斤拷锟斤拷锟斤拷锟捷革拷值锟斤拷锟斤拷锟斤拷锟斤拷
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			
			// 注锟斤拷锟斤拷锟斤拷
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 锟斤拷锟矫该凤拷锟斤拷锟酵伙拷取锟斤拷锟斤拷锟捷匡拷锟斤拷锟斤拷佣锟斤拷锟�
	 * @return
	 */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
