package com.ks.roads.pojo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Rcxj implements Serializable {
	private Date rq;
	private String xcry;
	private String dlbh;
	private String dlmc;
	private String shqkms;
	private String bz;
	
	
	public Rcxj() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Rcxj(Date rq, String xcry, String dlbh, String dlmc, String shqkms, String bz) {
		super();
		this.rq = rq;
		this.xcry = xcry;
		this.dlbh = dlbh;
		this.dlmc = dlmc;
		this.shqkms = shqkms;
		this.bz = bz;
	}

	

	public Date getRq() {
		return rq;
	}


	public void setRq(Date rq) {
		this.rq = rq;
	}


	public String getXcry() {
		return xcry;
	}


	public void setXcry(String xcry) {
		this.xcry = xcry;
	}


	public String getDlbh() {
		return dlbh;
	}


	public void setDlbh(String dlbh) {
		this.dlbh = dlbh;
	}


	public String getDlmc() {
		return dlmc;
	}


	public void setDlmc(String dlmc) {
		this.dlmc = dlmc;
	}


	public String getShqkms() {
		return shqkms;
	}


	public void setShqkms(String shqkms) {
		this.shqkms = shqkms;
	}


	public String getBz() {
		return bz;
	}


	public void setBz(String bz) {
		this.bz = bz;
	}


	@Override
	public String toString() {
		return "Rcxj [rq=" + rq + ", xcry=" + xcry + ", dlbh=" + dlbh + ", dlmc=" + dlmc + ", shqkms=" + shqkms
				+ ", bz=" + bz + "]";
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
