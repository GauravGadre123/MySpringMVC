package com.techno.utill;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

	

	@ExceptionHandler(value=IllegalStateException.class)
	public String handlingException(Model m) {

		m.addAttribute("msg","IllegalStateException occured");
		return "exception_handle";
	}
	

	@ExceptionHandler(value=ArrayIndexOutOfBoundsException.class)
	public String handlingArrayException(Model m) {
		m.addAttribute("msg","ArrayIndexOutOfBoundsException occured");
		return "exception_handle";
	}

	
	
	
}
