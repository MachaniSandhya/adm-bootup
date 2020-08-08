package com.cts.pss.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.dao.FlightDAO;
import com.cts.pss.entities.Flight;

@RestController
public class AddFlightsController {
	
	@Autowired
	FlightDAO dao;
	
	@RequestMapping(value="/addflights",method=RequestMethod.POST,consumes="application/json")
	public String addFlights(@RequestBody Flight flights) {
		 dao.save(flights);
		 return "List_of_Flights_Saved";
	}
}
