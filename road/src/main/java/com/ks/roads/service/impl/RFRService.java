package com.ks.roads.service.impl;


import java.util.List;

import com.ks.roads.dao.impl.RFRDao;
import com.ks.roads.pojo.BrokenRecord;
import com.ks.roads.pojo.Dljbzlk;
import com.ks.roads.pojo.PCIScore;
import com.ks.roads.pojo.RoadFlatRecord;
import com.ks.roads.service.IRFRService;

public class RFRService implements IRFRService {
    private RFRDao rfrDao = new RFRDao();
    @Override
    public void addRecord(RoadFlatRecord roadFlatRecord) {
        rfrDao.addRecord(roadFlatRecord);
    }

    @Override
    public void addBrokenRecord(BrokenRecord brokenRecord) {
        rfrDao.addBrokenRecord(brokenRecord);
    }

    @Override
    public void addDljbzlk(Dljbzlk dljbzlk) {
        rfrDao.addDljbzlk(dljbzlk);
    }

    @Override
    public List<RoadFlatRecord> findAll() {
        return rfrDao.findAll();
    }
    
    @Override
    public List<PCIScore> findAllpci() {
        return rfrDao.findAllpci();
    }


}
