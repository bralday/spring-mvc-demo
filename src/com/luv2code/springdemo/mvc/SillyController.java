package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	//this is to demonstrate how controller level request mapping works
	
	@RequestMapping("/showForm") // we already have "/showForm" from HelloWorldController
	public String showForm() {
		return "silly";
	}

}
