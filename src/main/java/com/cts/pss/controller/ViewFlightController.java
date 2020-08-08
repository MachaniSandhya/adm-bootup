package com.cts.pss.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.pss.entities.Flight;
import com.cts.pss.services.FlightSearchService;

@Controller
@RequestMapping("/view")
public class ViewFlightController {

	@Autowired
	private FlightSearchService service;

	@RequestMapping(value = "/flight", method = { RequestMethod.POST })
	public ModelAndView postFlightsToANdFrowWithDateTime(@RequestParam("origin") String origin,
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
		List<Flight> empList = service.getFlightsOrgDesDateTime(origin, destination, ldate, localTime);
		ModelAndView mav = new ModelAndView();
		mav.addObject("fltlist", empList);
		mav.setViewName("viewFlights");
		System.out.println(empList.get(0).getDuration());

		return mav;
	}
	@RequestMapping(value = "/flightlist", method = { RequestMethod.POST })
	public ModelAndView postFlightsToANdFrowWithDate(@RequestParam("origin") String origin,
			@RequestParam("dest") String destination, @RequestParam("date") String flightDate) {
		System.out.println("TestData");
		LocalDate ldate = LocalDate.parse(flightDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		List<Flight> empList = service.getFlightsOrgDesDate(origin, destination, ldate);
		ModelAndView mav = new ModelAndView();
		mav.addObject("fltlist", empList);
		mav.setViewName("viewFlights");
		System.out.println(empList.get(0).getDuration());
		return mav;
	}
	
	@RequestMapping(value = "/order/flightlist", method = { RequestMethod.POST })
	public ModelAndView postFlightsToANdFrowWithDate_OrderFare(@RequestParam("origin") String origin,
			@RequestParam("dest") String destination, @RequestParam("date") String flightDate) {
		System.out.println("TestData");
		LocalDate ldate = LocalDate.parse(flightDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	//	List<Flight> empList = service.getFlightsOrgDesDate(origin, destination, ldate);
		List<Flight> empList = service.getFlightsOrgDesDateOrderByPrice(origin, destination, ldate);
		ModelAndView mav = new ModelAndView();
		mav.addObject("fltlist", empList);
		mav.setViewName("viewFlights");
		System.out.println(empList.get(0).getDuration());
		return mav;
	}
}
