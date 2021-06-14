package com.Liv2train.application.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Liv2train.application.entities.TrainCenter;

public interface TrainCenterDao extends JpaRepository<TrainCenter,String> {

}
