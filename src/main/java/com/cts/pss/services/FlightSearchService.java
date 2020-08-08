package com.cts.pss.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.dao.AirlineInfoDAO;
import com.cts.pss.dao.FlightDAO;
import com.cts.pss.dao.FlightInfoDAO;
import com.cts.pss.entities.AirlineInfo;
import com.cts.pss.entities.Flight;
import com.cts.pss.entities.FlightInfo;

@Service
public class FlightSearchService {
	@Autowired
	private AirlineInfoDAO airLineDao;
	@Autowired
	private FlightInfoDAO flightinfoDao;
	@Autowired
	private FlightDAO flightDao;

	public Set<Flight> findAllFlightsByAirelineAndDate(String airline, LocalDate localDate) {
		AirlineInfo airLine = airLineDao.findByAirlineName(airline);
		List<FlightInfo> flights = flightinfoDao.findByAirLineInfo(airLine);
		Set<Flight> flightSet = new HashSet<>();
		for (FlightInfo flightInfo : flights) {
			List<Flight> flightlist = flightDao.findAllByInfoAndFlightDate(flightInfo, localDate);
			flightSet.addAll(flightlist);
		}
		return flightSet;
	}

	public List<Flight> findAllFlightsByOriginAndDate(LocalDate date, String origin) {
		return flightDao.findAllByFlightDateAndOrigin(date, origin);
	}

	public List<Flight> getAllFlightsByFlightNumAndOrigin(String flightNum, String origin) {
		return flightDao.findAllByFlightNumberAndOrigin(flightNum, origin);
	}

	public List<Flight> getAllFlightsByFlightNumAndOriginAndDest(String flightNum, String origin, String dest) {
		return flightDao.findAllByFlightNumberAndOriginAndDestination(flightNum, origin, dest);
	}

	public Flight getFlightNumberAndFlightDateAndFlightTime(String flightNumber, LocalDate flightDate,
			LocalTime flightTime) {
		return flightDao.findByFlightNumberAndFlightDateAndFlightTime(flightNumber, flightDate, flightTime);
	}

	public List<Flight> getFlightsOrgDesDateTime(String origin, String destination, LocalDate flightDate,
			LocalTime flightTime) {
		return flightDao.findAllByOriginAndDestinationAndFlightDateAndFlightTime(origin, destination, flightDate,
				flightTime);
	}

	public List<Flight> getFlightsOrgDesDate(String origin, String destination, LocalDate flightDate) {
		return flightDao.findAllByOriginAndDestinationAndFlightDate(origin, destination, flightDate);
	}
	
	public List<Flight> getFlightsOrgDesDateOrderByPrice(String origin, String destination, LocalDate flightDate) {
		System.out.println("Price_method_service");
		return flightDao.findAllByOriginAndDestinationAndFlightDateOrderByFareFare(origin, destination, flightDate);
	}
}
