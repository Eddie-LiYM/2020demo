package com.ks.roads.pojo;

import java.util.Date;

public class BrokenRecord {
    private Date date;
    private String qzwz;
    private String roadid;
    private String roadname;
    private String jczc;
    private String jczk;
    private String shc;
    private String shk;
    private String shg;
    private String shqkms;
    private String shmj;
    private String shlxmc;
    private String dllx;
    private String notes;

    public BrokenRecord(Date date, String qzwz, String roadid, String roadname, String jczc,
                        String jczk, String shc, String shk, String shg, String shqkms, String shmj,
                        String shlxmc, String dllx, String notes){
        super();
        this.date = date;
        this.qzwz = qzwz;
        this.roadid = roadid;
        this.roadname = roadname;
        this.jczc = jczc;
        this.jczk = jczk;
        this.shc = shc;
        this.shk = shk;
        this.shg = shg;
        this.shqkms = shqkms;
        this.shmj = shmj;
        this.shlxmc = shlxmc;
        this.dllx = dllx;
        this.notes = notes;
    }

    public Date getDate(){ return date; }
    public String getQzwz(){ return qzwz; }
    public String getRoadid(){ return roadid; }
    public String getRoadname(){return roadname;}
    public String getJczc(){ return jczc; }
    public String getJczk(){return jczk;}
    public String getShc(){return shc;}
    public String getShk(){ return shk; }
    public String getShg(){return shg;}
    public String getShqkms(){return shqkms;}
    public String getShmj(){return shmj;}
    public String getShlxmc(){return shlxmc;}
    public String getDllx(){return dllx;}
    public String getNotes(){return notes;}
}
