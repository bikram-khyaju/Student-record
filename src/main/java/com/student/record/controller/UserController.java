package com.student.record.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.student.record.domain.Student;
import com.student.record.domain.User;
import com.student.record.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//Biding object 
	@ModelAttribute("user")
	public User construct(){
		return new User();
	}
	
	@RequestMapping("/users")
	public String users(Model model){
		model.addAttribute("studentList", userService.allUser());
		return "studentList";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Model model){
		return "user-register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String doRegister(@Valid @ModelAttribute("user") User user,BindingResult result ,Model model){
		if(result.hasErrors()){
			return "user-register";
		}
		userService.save(user);
		return "userList";
	}

	
	@RequestMapping(value="/userList", method=RequestMethod.GET)
	public String userList( Model model){
		model.addAttribute("userList", userService.allUser());
		return "userList";
	}
	
	@RequestMapping(value="/deleteUser/{id}", method=RequestMethod.GET)
	public String deleteStudent(@PathVariable long id,Model model){
		userService.delete(id);
		// model.addAttribute("studentList", studentService.allStudentList());
		return "redirect:/userList";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public String edit(@PathVariable long id,Model model){
		model.addAttribute("user", userService.findById(id));
		return "user-register";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public String editUser(@ModelAttribute("student") User user, Model model){
		userService.save(user);
		return "redirect:/userList";
	}
	
}
