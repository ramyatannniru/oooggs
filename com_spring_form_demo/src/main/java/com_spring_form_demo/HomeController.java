package com_spring_form_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
@GetMapping("/")
public String go()
{
	return "main_menu";
}
  @GetMapping("/processForm")
  public String processPage()
  {
	  return "studentdetails";
  }
}
