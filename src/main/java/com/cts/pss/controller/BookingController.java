package com.cts.pss.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.pss.dao.BookingRecordDAO;
import com.cts.pss.dao.FlightDAO;
import com.cts.pss.dao.PassengerDAO;
import com.cts.pss.dao.UserLoginDAO;
import com.cts.pss.entities.BookingRecord;
import com.cts.pss.entities.Flight;
import com.cts.pss.entities.Passenger;
import com.cts.pss.entities.User;

@Controller
public class BookingController {
	@Autowired
	private FlightDAO flightDao;
	@Autowired
	private BookingRecordDAO brdao;
	@Autowired
	private PassengerDAO pasDao;
	
	@Autowired
	private UserLoginDAO udao;

	@RequestMapping(value = "/bookpassenger", method = { RequestMethod.POST })
	public String addPassenger_booking(@ModelAttribute("user") User user,@RequestParam("id") long id,Model data) {
		Flight flight = flightDao.findFlightById(id);
	
		BookingRecord br = new BookingRecord();
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		
		br.setOrigin(flight.getOrigin());
		br.setBookingdate(ld);
		br.setFlightTime(flight.getFlightTime());
		br.setFlightDate(flight.getFlightDate());
		br.setDestination(flight.getDestination());
		br.setFare(flight.getFare().getFare());
	    br.setFlightNumber(flight.getFlightNumber());
	
	    List<Passenger> set = new ArrayList<Passenger>();
	
	    Passenger pass = new Passenger();
		pass.setFirstName(user.getFirstname());
		pass.setLastName(user.getLastname());
		pass.setGender(user.getGender());
		pass.setMobileNumber(Long.parseLong(user.getMobile()));
		br.setPassengers(set);
		set.add(pass);
		
		Object principle = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principle instanceof UserDetails) {
			String uname = ((UserDetails) principle).getUsername();
			Optional<User> useropt = udao.findByUsername(uname);
			User u = useropt.get();
			br.setUser(u);
		}
		
		brdao.save(br);
		data.addAttribute("id", br.getId());
		data.addAttribute("flightNum",flight.getFlightNumber());
		data.addAttribute("flightDate",flight.getFlightDate());
		data.addAttribute("origin",flight.getOrigin());
		data.addAttribute("dest",flight.getDestination());
		data.addAttribute("flightTime",flight.getFlightTime());
		
		return "SuccessfullBooking";
	}

}
