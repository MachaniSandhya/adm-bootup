package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entities.AirlineInfo;

public interface AirlineInfoDAO extends JpaRepository<AirlineInfo, Integer>{
	
	public AirlineInfo findByAirlineName(String name);
}
