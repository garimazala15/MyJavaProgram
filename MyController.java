package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("home")
	@ResponseBody
	public String home() {
		return " This is home page..........."
				+ "<ul> "
				+ "<li><a href=\"home\"><u>Home</u> </a></li>"
				+ "<li><a href=\"about\">About </a></li>"
				+ "<li><a href=\"gallery\">Gallery </a></li>"
				+ "<li><a href=\"help\">Help </a></li>"
				+ "<li><a href=\"contact\">Contact </a></li>"
				+ "</ul>";
		
	}
	
	
	@RequestMapping("about")
	@ResponseBody
	public String about() {
		
		return "This is about page";
		
	}
	
	@RequestMapping("gallery")
	@ResponseBody
	public String gallery() {
		
		return "This is gallery page";
		
	}
	
	@RequestMapping("help")
	@ResponseBody
	public String help() {
		
		return "This is help page";
		
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contact() {
		
		return "<h2>This is contact page</h2>"
				+ "<a href=\"home\">Home </a>";
		
		
	}

}
