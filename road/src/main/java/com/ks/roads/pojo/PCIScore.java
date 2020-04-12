package com.ks.roads.pojo;

public class PCIScore {
    private String scorecal;
    private String brokenrou;
    private String brokentype;
    private String brokentype1;

    public PCIScore(String bt, String br, String sc){
        super();
        brokentype = bt;
        brokenrou = br;
        scorecal = sc;
    }

    public void setBrokentype1(String bt1){this.brokentype1=bt1;}
    public String getBrokentype1(){return brokentype1;}
    public String getBrokenrou(){return brokenrou;}
    public String getScorecal(){return scorecal;}
    public String getBrokentype(){return brokentype;}
}
