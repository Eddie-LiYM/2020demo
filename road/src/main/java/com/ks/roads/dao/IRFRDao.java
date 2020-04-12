package com.ks.roads.dao;



import java.util.List;

import com.ks.roads.pojo.BrokenRecord;
import com.ks.roads.pojo.Dljbzlk;
import com.ks.roads.pojo.PCIScore;
import com.ks.roads.pojo.RQIScore;
import com.ks.roads.pojo.RoadFlatRecord;

public interface IRFRDao {
    void addRecord(RoadFlatRecord roadFlatRecord);
    void addBrokenRecord(BrokenRecord brokenRecord);
    void addDljbzlk(Dljbzlk dljbzlk);
    List<RoadFlatRecord> findAll();
    List<RQIScore> finAll();
    List<PCIScore> findAllpci();
}
