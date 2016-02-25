package com.latha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.latha.model.User;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@ModelAttribute("user") User user) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("message", message);
		
		return mv;
	}
}

