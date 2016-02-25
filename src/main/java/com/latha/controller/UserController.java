package com.latha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.latha.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView createUser(
			@ModelAttribute("user") User user) {
		System.out.println("in usercontroller post method");
		ModelAndView mv = new ModelAndView("regSuccess");
		mv.addObject("user", user);
		
		
		System.out.println(user.getName());
		return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("user") User user){
		
		System.out.println("in usercontroller get method");
		 
		ModelAndView mv = new ModelAndView("register");
		return mv;
			
	}

}
