package com.Liv2train.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Liv2train.application.Dao.TrainCenterDao;
import com.Liv2train.application.entities.TrainCenter;

@Service
public class TrainCenterServiceImpl  implements  TrainCenterService{
     
	@Autowired
    private TrainCenterDao traincenterDao;
	
	
	
	// Fetching List of All Training center
	@Override
	public List<TrainCenter> gettraincenter() {
		
		return traincenterDao.findAll();
	}
	
	
    // Add training center 
	@Override
	public TrainCenter addtraincenter(TrainCenter t) {
	
		traincenterDao.save(t); 
		return t;
		
	}

}
