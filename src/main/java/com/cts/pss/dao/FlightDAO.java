package com.cts.pss.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.pss.entities.Flight;
import com.cts.pss.entities.FlightInfo;

public interface FlightDAO extends JpaRepository<Flight, Integer>{
	public List<Flight> findAllByInfoAndFlightDate(FlightInfo info,LocalDate flightDate);
	
	public List<Flight> findAllByFlightDateAndOrigin(LocalDate flight,String origin);
	
	public List<Flight> findAllByFlightNumberAndOrigin(String flightNumber,String origin);
	
	public Flight findByFlightNumberAndFlightDateAndFlightTime(String flightNumber,LocalDate flightDate,LocalTime flightTime);
}
