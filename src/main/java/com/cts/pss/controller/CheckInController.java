package com.cts.pss.controller;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.pss.dao.BookingRecordDAO;
import com.cts.pss.dao.UserLoginDAO;
import com.cts.pss.entities.BookingRecord;
import com.cts.pss.entities.User;

@Controller
public class CheckInController {
	private static int num = 120;
	@Autowired
	BookingRecordDAO brdao;

	@Autowired
	private UserLoginDAO udao;

	@RequestMapping("/checkin")
	public String CheckIn() {
		return "checkin";
	}

	@RequestMapping(value = "/checkininformation", method = { RequestMethod.POST })
	public String checkinInfo(@RequestParam("bookingId") String booking_id, Model model) {
		User u = null;
		Object principle = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if (principle instanceof UserDetails) {
			String uname = ((UserDetails) principle).getUsername();
			Optional<User> useropt = udao.findByUsername(uname);
			u = useropt.get();
		}

		BookingRecord br = brdao.findBookingRecordById(Long.parseLong(booking_id));

		if (u.getId() == br.getUser().getId()) {
			model.addAttribute("id", br.getId());
			model.addAttribute("flightNum", br.getFlightNumber().toString());
			model.addAttribute("flightDate", br.getFlightDate());
			model.addAttribute("origin", br.getOrigin().toString());
			model.addAttribute("dest", br.getDestination());
			model.addAttribute("flightTime", br.getFlightTime() + "");
			System.out.println("date  " + br.getFlightDate());
			System.out.println("Time  " + br.getFlightTime());
			model.addAttribute("seatnum", num++);
			return "checkinInfo";
		}

		model.addAttribute("id", br.getId());
		return "error_checkin";

	}
}
