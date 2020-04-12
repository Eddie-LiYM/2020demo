package com.ks.roads.pojo;

public class Score {
    private String roadname;
    private String pqi;
    private String rqi;
    private String pci;
    private String date;

    public Score(String na, String pqi, String rqi, String pci, String da){
        super();
        this.roadname = na;
        this.pqi = pqi;
        this.rqi = rqi;
        this.pci = pci;
        this.date = da;
    }

    public String getRoadname() {
        return roadname;
    }

    public String getPci() {
        return pci;
    }

    public String getPqi() {
        return pqi;
    }

    public String getRqi() {
        return rqi;
    }

    public String getDate() {
        return date;
    }
}
