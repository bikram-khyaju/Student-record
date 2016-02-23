package com.student.record.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.student.record.domain.Student;
import com.student.record.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	

	@RequestMapping(value={"/","/home"},method=RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add(@ModelAttribute("student") Student student){
		return "student";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute("student") Student student, BindingResult result, HttpServletRequest request){
		if(result.hasErrors()) {
			return "student";
		}

   		try {
			studentService.add(student);
		} catch (Exception up) {
	      System.out.println("Transaction Failed!!!");
 
		}
		
	   	return "thankyou";
	}
	
	@RequestMapping(value={"/thankyou"})
	public String thankyou(Model model){
//		model.addAttribute("students", studentService.findAll());
		return "thankyou";
	}
	
	@RequestMapping(value="/studentList", method=RequestMethod.GET)
	public String allStudentList(Model model){
		model.addAttribute("studentList", studentService.allStudentList());
		return "studentList";
	}
	
	@RequestMapping(value="/editStudent/{id}", method=RequestMethod.GET)
	public String editStudent(@ModelAttribute("student") Student student,@PathVariable long id,Model model){
		model.addAttribute("studentEdit", studentService.edit(id));
		return "edit-student";
	}
	
	@RequestMapping(value="/editStudent/{id}", method=RequestMethod.POST)
	public String editStudent(@ModelAttribute("student") Student student,Model model){
		studentService.add(student);
		return "redirect:/studentList";
	}
	
	@RequestMapping(value="/deleteStudent/{id}", method=RequestMethod.GET)
	public String deleteStudent(@PathVariable int id,Model model){
		studentService.delete(id);
		return "redirect:/studentList";
	}

}
