package com.cts.pss.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.pss.dao.FlightDAO;
import com.cts.pss.dao.UserLoginDAO;
import com.cts.pss.dto.Search;
import com.cts.pss.entities.Flight;
import com.cts.pss.entities.User;
import com.cts.pss.services.FlightSearchService;

@RestController
public class SearchFlightRestCtrl {

	@Autowired
	private FlightSearchService service;
	
	@Autowired
	FlightDAO flighDao;

	@RequestMapping("/{flightNum}/{origin}/{dest}")
	public List<Flight> getAllFlightsByFlightNumAndOriginAndDest(@PathVariable("flightNum") String flightNum,
			@PathVariable("origin") String origin, @PathVariable("dest") String destination) {
		return service.getAllFlightsByFlightNumAndOriginAndDest(flightNum, origin, destination);
	}

	@RequestMapping(value = "/update", method = {
			RequestMethod.PUT }, consumes = "application/json", produces = "application/json")
	public @ResponseBody Flight upDateFlight(@RequestBody Search search) {
		System.out.println("TEST%%%%%");
		LocalDate ldate = LocalDate.parse(search.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String[] arr = search.getTime().split(":");
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
		System.out.println("TIME  " + localTime);
		System.out.println(search);
		Flight flit = flighDao.findByFlightDateAndFlightTimeAndOriginAndDestinationAndFlightNumber(ldate, localTime,
				search.getOrigin(), search.getDestination(), search.getFlightnum());
		LocalDate ld = LocalDate.parse("2020-08-21", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
		String time = "18.30.00";
		LocalTime localTimeObj = LocalTime.parse(time, formatter);
		System.out.println(flit);
		System.out.println(ld);
		System.out.println(localTimeObj);
		flit.setFlightDate(ld);
		flit.setFlightTime(localTimeObj);
		return flighDao.save(flit);

		//return flighDao.updateFlight(flit);
	}
	
	@RequestMapping(value="/delete/{id}",method = {
			RequestMethod.DELETE})
	public String deleteFlight(@PathVariable("id") long id) {
		Flight flight = flighDao.findFlightById(id);
		flighDao.delete(flight);
		return "Flight deleted the flight numbr is ::"+flight.getFlightNumber();
	}
	
}
 