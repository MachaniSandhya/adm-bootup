package com.cts.pss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightParmeterizableViewController {

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/flightList")
	public String flightList() {
		return "SearchFlightsByOrgDestDate";
	}

	@RequestMapping("/bookticket")
	public String bookTicket(Model data, @RequestParam("id") String id) {
		data.addAttribute("id", id);
		return "BookTicketPassenger";
	}
	
	@RequestMapping("/flightListorder")
	public String flightsbyOrder() {
		return "OrderdFlightsByFare";
	}
	
	@RequestMapping("/registerform")
	public String login() {
		return "login";
	}
}
