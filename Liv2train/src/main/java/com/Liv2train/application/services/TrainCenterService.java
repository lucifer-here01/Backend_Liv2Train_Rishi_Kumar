package com.Liv2train.application.services;

import java.util.List;



import com.Liv2train.application.entities.TrainCenter;

public interface TrainCenterService {
	
	public List<TrainCenter> gettraincenter();
	
	public TrainCenter addtraincenter(TrainCenter t);
	
	

}
