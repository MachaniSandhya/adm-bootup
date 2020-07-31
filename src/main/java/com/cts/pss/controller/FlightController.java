package com.cts.pss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlightController {
	
	
		
		@RequestMapping("/s1")
		public String f1(Model data) {
			System.out.println("ProductController:: f1 method");
			// Logic -> Model
			// Display template - View
			data.addAttribute("user", "Admin");
			return "welcome";
		}

	}

