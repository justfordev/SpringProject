package com.study.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hp() throws Exception {
		return "index";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("name", "王帆");
		return mv;
	}
	 
}
