package com.ks.roads.pojo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Shtzd implements Serializable{
	private String tzh;
	private String xcry;
	private String ssmc;
	private String shbw;
	private String shyy;
	private String clyj;
	private String jsy;
	private Date rq;
	private String bj;
	private Date zxsj;
	private String bz;
	public Shtzd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shtzd(String tzh, String xcry, String ssmc, String shbw, String shyy, String clyj, String jsy, Date rq,
			String bj, Date zxsj, String bz) {
		super();
		this.tzh = tzh;
		this.xcry = xcry;
		this.ssmc = ssmc;
		this.shbw = shbw;
		this.shyy = shyy;
		this.clyj = clyj;
		this.jsy = jsy;
		this.rq = rq;
		this.bj = bj;
		this.zxsj = zxsj;
		this.bz = bz;
	}
	public String getTzh() {
		return tzh;
	}
	public void setTzh(String tzh) {
		this.tzh = tzh;
	}
	public String getXcry() {
		return xcry;
	}
	public void setXcry(String xcry) {
		this.xcry = xcry;
	}
	public String getSsmc() {
		return ssmc;
	}
	public void setSsmc(String ssmc) {
		this.ssmc = ssmc;
	}
	public String getShbw() {
		return shbw;
	}
	public void setShbw(String shbw) {
		this.shbw = shbw;
	}
	public String getShyy() {
		return shyy;
	}
	public void setShyy(String shyy) {
		this.shyy = shyy;
	}
	public String getClyj() {
		return clyj;
	}
	public void setClyj(String clyj) {
		this.clyj = clyj;
	}
	public String getJsy() {
		return jsy;
	}
	public void setJsy(String jsy) {
		this.jsy = jsy;
	}
	public Date getRq() {
		return rq;
	}
	public void setRq(Date rq) {
		this.rq = rq;
	}
	public String getBj() {
		return bj;
	}
	public void setBj(String bj) {
		this.bj = bj;
	}
	public Date getZxsj() {
		return zxsj;
	}
	public void setZxsj(Date zxsj) {
		this.zxsj = zxsj;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	@Override
	public String toString() {
		return "Shtzd [tzh=" + tzh + ", xcry=" + xcry + ", ssmc=" + ssmc + ", shbw=" + shbw + ", shyy=" + shyy
				+ ", clyj=" + clyj + ", jsy=" + jsy + ", rq=" + rq + ", bj=" + bj + ", zxsj=" + zxsj + ", bz=" + bz
				+ "]";
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
