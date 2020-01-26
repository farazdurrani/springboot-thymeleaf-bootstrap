package com.farazdurrani.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AssignmentController {

	/*
	 * Using the example from class, https://spring.io/guides/gs/serving-web-content/ as a starting point, search on the
	 * bootstrap site and find a template you wish to use for this assignment. You may use the one we looked at in
	 * class, or another of your choice. Once you’ve found a template, create a new project that uses the template for
	 * your views. From the coding side, write controllers for each link on the template. For each link your program
	 * should take the user to a view. Your solution should include two views for each link, one that takes no
	 * parameters and displays a simple message telling the user what view they are seeing (e.g. “you are seeing the
	 * about view”), and the second that allows the user to type a data value in the URL that will then be displayed in
	 * the corresponding view. Please note that your views can be simple. The goal of this project is threefold – 1) set
	 * up a project from scratch; 2) write working controllers and views, and 3) use a bootstrap template to enhance the
	 * user’s “client-side” experience.
	 */
	@GetMapping("/")
	public String home(@RequestParam(required = false, value = "name") String name, Model m) {
		m.addAttribute("name", name);
		return "home.html";
	}
	
	@GetMapping("/about")
	public String about(@RequestParam(required = false, value = "name") String name, Model m) {
		m.addAttribute("name", name);
		return "about.html";
	}
}
