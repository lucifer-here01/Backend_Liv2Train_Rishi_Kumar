package com.Liv2train.application.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Liv2train.application.entities.TrainCenter;
import com.Liv2train.application.services.TrainCenterService;

@RestController
public class MyController {
	
     @Autowired	
	 public TrainCenterService traincenterservice;
	@GetMapping("/") 
	public String home() { 
		return "This is Home";
	}
	
	@GetMapping("/findTC")
	public List<TrainCenter> getCenter(){
		
		return this.traincenterservice.gettraincenter();
		
	}
	
	@PostMapping("/addTC")
	public TrainCenter addCenter(@Valid @RequestBody TrainCenter t , BindingResult result ) {
		
		if (result.hasErrors()) {
			System.out.println(result);
		}
		return this.traincenterservice.addtraincenter(t);
		
	} 

	
	
}
