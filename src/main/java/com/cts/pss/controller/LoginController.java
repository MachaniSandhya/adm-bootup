package com.cts.pss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.pss.dao.UserLoginDAO;
import com.cts.pss.entities.User;

@Controller
public class LoginController {

	@Autowired
	UserLoginDAO udao;

	@RequestMapping(value = "/adduser")
	public ModelAndView addUser(@ModelAttribute("userlogin") User user) {
		ModelAndView mav = new ModelAndView();
		user.setActivated("true");
		user.setRoles("ROLE_USER");
		user = udao.save(user);
		mav.setViewName("userAdded");
		mav.addObject("user", user);
		return mav;
	}
}