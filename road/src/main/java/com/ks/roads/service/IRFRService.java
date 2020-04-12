package com.ks.roads.service;



import java.util.List;

import com.ks.roads.pojo.BrokenRecord;
import com.ks.roads.pojo.Dljbzlk;
import com.ks.roads.pojo.PCIScore;
import com.ks.roads.pojo.RoadFlatRecord;

public interface IRFRService {
    void addRecord(RoadFlatRecord roadFlatRecord);
    void addBrokenRecord(BrokenRecord brokenRecord);
    void addDljbzlk(Dljbzlk dljbzlk);
    List<RoadFlatRecord> findAll();
    List<PCIScore> findAllpci();
}

