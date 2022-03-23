package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // removes ambiguity caused by silly controller due to having "/showForm" too.
							// this will be parent, path will become /hello/showForm
public class HelloWorldController {

	// need a controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need controller method to process html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// need controller method to read and add form data to model
	@RequestMapping("/processForm2")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// read request param from html
		String name = request.getParameter("studentName");
		String addy = request.getParameter("address");

		// create message
		String greet = "Yo " + name.toUpperCase() + ",";
		String stateAddy = "hows " + addy.toLowerCase();

		// add message to model jsp key - value
		model.addAttribute("message", greet);
		model.addAttribute("address", stateAddy);

		return "helloworld";
	}

	// need controller method to read and add form data to model Using @RequestParam
	@RequestMapping("/processForm3")
	public String wassupDude(@RequestParam("studentName") String theName, @RequestParam("address") String addy,
			Model model) {

		// create message
		String greet = "Hello " + theName.toUpperCase() + ",";
		String stateAddy = "you're from " + addy.toLowerCase() + " right?";

		// add message to model jsp key - value
		model.addAttribute("message", greet);
		model.addAttribute("address", stateAddy);

		return "helloworld";
	}
}
