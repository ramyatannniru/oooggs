package com_spring_form_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com_spring_form_demo.*;


/*@Controller
@RequestMapping("/student")
public class StudentController {

	public StudentController() {
		// TODO Auto-generated constructor stub
	}
@GetMapping("/studentForm")
public String showform(Model theModel)
{
	Student student=new Student();
	theModel.addAttribute("student",student);
	return "studentform";
	

	
}
@PostMapping("/processForm")
public String processPage(@ModelAttribute("student")Student student,Model theModel)
{
	theModel.addAttribute("temp",student);
	return "studentdetails";
	
}
} */
@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/studentForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "studentform";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent,Model theModel) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
		theModel.addAttribute("student", theStudent);
		 ClassPathXmlApplicationContext context=
	        		new ClassPathXmlApplicationContext("com_spring_form_demo.xml");
	          StudentDao dao=context.getBean("eDao",StudentDao.class);
	        dao.createStudent(new Student(theStudent.getFirstName(),theStudent.getLastName(),theStudent.getCountry(),theStudent.getFavoriteLanguage(),theStudent.getOperatingsystem() ));
		return "studentdetails";
	}
	
	
}