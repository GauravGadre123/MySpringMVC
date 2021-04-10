package com.techno.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.techno.model.User;

@Controller
public class MyController {

	/*--------------------- 1st session----------------------- */
	
	@RequestMapping(value = "/home")
	public String home(Model model) {
		model.addAttribute("data", "parsing data from home");
		return "home";
	}

	@RequestMapping(value = "/home1")
	public ModelAndView home1() {
		ModelAndView mv = new ModelAndView();
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
	

	/*--------------------- 1st session End----------------------- */

	

	/*--------------------- 2nd session----------------------- */
	
	@RequestMapping("/input")
	public String inputForm() {

		return "input";
	}
	/*
	@RequestMapping(value = "/show_data", method = RequestMethod.POST)
	public String showData(Model model, @RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword) {
		System.out.println(userEmail);
		System.out.println(userPassword);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		return "home";
	}
*/
/*
	@RequestMapping(value = "/show_data", method = RequestMethod.POST)
	public String showData(@ModelAttribute User user, Model model) {
		
		model.addAttribute("user", user);
		return "redirect:/success";
	}
*/	
	@RequestMapping(value = "/show_data", method = RequestMethod.POST)
	public RedirectView showData(@ModelAttribute User user, Model model) {
		
		model.addAttribute("user", user);

		RedirectView rv = new RedirectView();
		rv.setUrl("success");
		return rv;

	}
	
	@RequestMapping("/success")
	public String successForm() {

        int[] a = new int[4];
		System.out.println(a[5]);
		
		return "success";
	}


	/*--------------------- 2nd session End----------------------- */
	

	/*--------------------- 3rd session ----------------------- */
	

	// for getting values from url

	@RequestMapping(value = "/show_values/{id}/{name}")
	public String showValues(@PathVariable("id") int uid, @PathVariable("name") String uname) {
		System.out.println(uid);

		System.out.println(uname);
		return "";

	}
	
	// exception handling

	/*
	@ExceptionHandler({ IllegalStateException.class, ArrayIndexOutOfBoundsException.class })
	public String handlingException() {
		return "exception_handle";
	}
   */

	

	/*--------------------- 3rd session End ----------------------- */
	
	
	
}
