package com.ks.roads.pojo;

import java.util.Date;

public class RQIScore {
    private String iri;
    private String roadid;
    private String roadname;
    private Date date;
    private String rqi;

    public RQIScore(String iri, String roadid, String roadname, Date date){
        super();
        this.iri = iri;
        this.roadid = roadid;
        this.roadname = roadname;
        this.date = date;
    }


    public String getRoadid(){return roadid;}
    public String getRoadname(){return roadname;}
    public String getIri(){return iri;}
    public Date getDate(){return date;}

    public void setRQI(String rqi){ this.rqi = rqi;}
}
