package com.ks.roads.pojo;

import java.io.Serializable;
import java.util.Date;

public class RoadFlatRecord implements Serializable {
    private Date date;
    private String testperson;
    private String roadid;
    private String roadname;
    private String recordnum;
    private String iri;
    private String notes;

    public RoadFlatRecord(Date date, String testperson, String roadid, String roadname, String recordnum, String iri, String notes){
        super();
        this.date = date;
        this.testperson = testperson;
        this.roadid = roadid;
        this.roadname = roadname;
        this.recordnum = recordnum;
        this.iri = iri;
        this.notes = notes;
    }

    public Date getDate(){
        return date;
    }
    public String getTestperson(){
        return testperson;
    }
    public String getRoadid(){
        return roadid;
    }
    public String getRoadname(){
        return roadname;
    }
    public String getRecordnum(){
        return recordnum;
    }
    public String getIri(){
        return iri;
    }
    public String getNotes(){
        return notes;
    }
    public void setDate(Date date){this.date = date;}

    public void setTestperson(String testperson){this.testperson = testperson;}

    public void setRoadid(String roadid){this.roadid = roadid;}
    public void setRoadname(String roadname){this.roadname = roadname;}
    public void setRecordnum(String recordnum){this.recordnum = recordnum;}
    public void setIri(String iri){this.iri = iri;}
    public void setNotes(String notes){this.notes = notes;}





}
