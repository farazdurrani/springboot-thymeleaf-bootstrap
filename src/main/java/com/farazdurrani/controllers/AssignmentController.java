package com.farazdurrani.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AssignmentController {
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
