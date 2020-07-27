package com.cts.pss.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cts.pss.entities.Flight;
import com.cts.pss.services.FlightSearchService;

@RestController
@RequestMapping("/search")
public class FlightSearchController {

	@Autowired
	private FlightSearchService service;

	@RequestMapping("/getAirline")
	public Set<Flight> getFlightsByNameAndDate(@RequestParam("airlineName") String airLine,
			@RequestParam("date") String date) {
		LocalDate ld = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		return service.findAllFlightsByAirelineAndDate(airLine, ld);
	}

	@RequestMapping("/{origin}")
	public List<Flight> getAllFlightsByOriginAndDate(@PathVariable("origin") String origin,
			@RequestParam("date") String date) {
		LocalDate ld = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		return service.findAllFlightsByOriginAndDate(ld, origin);
	}

	@RequestMapping("/{flightNum}/{origin}")
	public List<Flight> getAllFlightsByFlightNumAndOrigin(@PathVariable("flightNum") String flightNum,
			@PathVariable("origin") String origin) {
		return service.getAllFlightsByFlightNumAndOrigin(flightNum, origin);
	}

	@RequestMapping("/{flightNum}/{date}/{time}")
	public Flight getFlightByFlightNumDateTime(@PathVariable("flightNum") String flightNumber,
			@PathVariable("date") String flightDate, @PathVariable("time") String flightTime) {
		LocalDate ldate = LocalDate.parse(flightDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String[] arr = flightTime.split(":");
		int hr = 0;
		int mm = 0;
		int ss = 0;
		LocalTime localTime = null;
		if (arr.length == 3) {
			hr = Integer.parseInt(arr[0]);
			mm = Integer.parseInt(arr[1]);
			ss = Integer.parseInt(arr[2]);
			localTime = LocalTime.of(hr, mm, ss);
		}
		return service.getFlightNumberAndFlightDateAndFlightTime(flightNumber, ldate, localTime);
	}
	
	@RequestMapping(name="/flights",method=RequestMethod.POST)
	public List<Flight> getFlightsToANdFrowWithDateTime(@RequestAttribute("origin")String origin, @RequestAttribute("dest")String destination,
			@RequestAttribute("dteval")String flightDate,@RequestAttribute("tmeval") String flightTime){
		LocalDate ldate = LocalDate.parse(flightDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String[] arr = flightTime.split(":");
		int hr = 0;
		int mm = 0;
		int ss = 0;
		LocalTime localTime = null;
		if (arr.length == 3) {
			hr = Integer.parseInt(arr[0]);
			mm = Integer.parseInt(arr[1]);
			ss = Integer.parseInt(arr[2]);
			localTime = LocalTime.of(hr, mm, ss);
		}
		return service.getFlightsOrgDesDateTime(origin, destination, ldate, localTime);
	}

}
