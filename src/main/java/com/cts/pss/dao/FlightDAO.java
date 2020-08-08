package com.cts.pss.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.pss.entities.Flight;
import com.cts.pss.entities.FlightInfo;

public interface FlightDAO extends JpaRepository<Flight, Integer> {

	public Flight findFlightById(long id);

	public List<Flight> findAllByInfoAndFlightDate(FlightInfo info, LocalDate flightDate);

	public List<Flight> findAllByFlightDateAndOrigin(LocalDate flight, String origin);

	public List<Flight> findAllByFlightNumberAndOrigin(String flightNumber, String origin);

	public List<Flight> findAllByFlightNumberAndOriginAndDestination(String flightNumber, String origin,
			String destination);

	public Flight findByFlightNumberAndFlightDateAndFlightTime(String flightNumber, LocalDate flightDate,
			LocalTime flightTime);

	public List<Flight> findAllByOriginAndDestinationAndFlightDateAndFlightTime(String origin, String destination,
			LocalDate flightDate, LocalTime flightTime);

	public List<Flight> findAllByOriginAndDestinationAndFlightDate(String origin, String destination,
			LocalDate flightDate);

	public Flight findByFlightDateAndFlightTimeAndOriginAndDestinationAndFlightNumber(LocalDate date, LocalTime time,
			String origin, String dest, String flightnum);
	
	public List<Flight> findAllByOriginAndDestinationAndFlightDateOrderByFareFare(String origin, String destination,
			LocalDate flightDate);
	//public Flight updateFlightByFlightDateAndFlightTimeWhereId(LocalDate date, LocalTime time,long id);
}
