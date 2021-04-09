package com.techno.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

	@RequestMapping(value = "/home")
	public String home(Model model) {
		model.addAttribute("data", "parsing data from home");
		return "home";
	}
	

	@RequestMapping(value = "/home1")
	public ModelAndView home1() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("data", "parsing data from home1");
		mv.setViewName("home");
		return mv;
	}
	

	@RequestMapping("/form")
	public String showForm() {

		return "form";
	}
	
	@RequestMapping("/get_form_data")
	public String showFormData(HttpServletRequest req) {
		
		System.out.println(req.getParameter("name"));

		System.out.println(req.getParameter("id"));
		return "";
	}

}
