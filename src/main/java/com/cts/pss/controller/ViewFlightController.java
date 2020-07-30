package com.cts.pss.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.dto.Search;
import com.cts.pss.entities.Flight;
import com.cts.pss.services.FlightSearchService;

@RestController
@RequestMapping("/view")
public class ViewFlightController {

	@Autowired
	private FlightSearchService service;

	@RequestMapping(value = "/flight", method = { RequestMethod.POST })
	public List<Flight> postFlightsToANdFrowWithDateTime(@RequestParam("origin") String origin,
			@RequestParam("dest") String destination, @RequestParam("date") String flightDate,
			@RequestParam("time") String flightTime) {
		System.out.println("TestData");
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

	/*
	 * @RequestMapping(value = "/flights_obj", method = RequestMethod.POST) public
	 * String getFlightsToANdFrowWithDateTime(@RequestBody Search search) {
	 * System.out.println("TestData"); LocalDate ldate =
	 * LocalDate.parse(search.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	 * String[] arr = search.getTime().split(":"); int hr = 0; int mm = 0; int ss =
	 * 0; LocalTime localTime = null; if (arr.length == 3) { hr =
	 * Integer.parseInt(arr[0]); mm = Integer.parseInt(arr[1]); ss =
	 * Integer.parseInt(arr[2]); localTime = LocalTime.of(hr, mm, ss); } return
	 * service.getFlightsOrgDesDateTime(search.getOrigin(), search.getDestination(),
	 * ldate, localTime) .toString(); }
	 * 
	 * @RequestMapping(value = "/flightsreqattr", method = RequestMethod.POST)
	 * public List<Flight>
	 * getFlightsToANdFrowWithDateTime_1(@RequestAttribute("origin") String origin,
	 * 
	 * @RequestAttribute("dest") String destination,@RequestAttribute("date") String
	 * flightDate, @RequestAttribute("time") String flightTime) {
	 * System.out.println("TestData"); LocalDate ldate = LocalDate.parse(flightDate,
	 * DateTimeFormatter.ofPattern("yyyy-MM-dd")); String[] arr =
	 * flightTime.split(":"); int hr = 0; int mm = 0; int ss = 0; LocalTime
	 * localTime = null; if (arr.length == 3) { hr = Integer.parseInt(arr[0]); mm =
	 * Integer.parseInt(arr[1]); ss = Integer.parseInt(arr[2]); localTime =
	 * LocalTime.of(hr, mm, ss); } return service.getFlightsOrgDesDateTime(origin,
	 * destination, ldate, localTime); }
	 * 
	 * 
	 * @RequestAttribute("origin")String origin, @RequestAttribute("dest")String
	 * destination,
	 * 
	 * @RequestAttribute("date")String flightDate,@RequestAttribute("time") String
	 * flightTime
	 */
}
