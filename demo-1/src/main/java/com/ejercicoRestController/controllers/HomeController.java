package com.ejercicoRestController.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@GetMapping("/")
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.html");
		return modelAndView;
	}
	
	//@ResponseBody
	@RequestMapping("/categories")
	public ModelAndView categories() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index2.html");
		return modelAndView;
	}
	
	//@ResponseBody
	@RequestMapping("/support")
	public ModelAndView suport() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index3.html");
		return modelAndView;
	}
	
}
