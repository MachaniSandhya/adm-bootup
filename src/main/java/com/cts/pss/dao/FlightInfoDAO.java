package com.cts.pss.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entities.AirlineInfo;
import com.cts.pss.entities.Flight;
import com.cts.pss.entities.FlightInfo;

public interface FlightInfoDAO extends JpaRepository<FlightInfo,Integer>{
	public List<FlightInfo> findByAirLineInfo(AirlineInfo airLineInfo);
}
