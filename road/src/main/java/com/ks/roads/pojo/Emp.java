package com.ks.roads.pojo;

import java.io.Serializable;

/**
 * �û�ʵ��
 * �û���������
 * @author ASUS
 *
 */

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private String yhm;//�û���
	private String mm;//����
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String yhm, String mm) {
		super();
		this.yhm = yhm;
		this.mm = mm;
	}
	public String getYhm() {
		return yhm;
	}
	public void setYhm(String yhm) {
		this.yhm = yhm;
	}
	public String getMm() {
		return mm;
	}
	public void setMm(String mm) {
		this.mm = mm;
	}
	@Override
	public String toString() {
		return "User [yhm=" + yhm + ", mm=" + mm + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
}
