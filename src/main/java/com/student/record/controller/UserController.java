package com.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping("/register")
	public String register(Model model){
		return "user-register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String doRegister(@ModelAttribute("user") User user, Model model){
		userService.save(user);
		return "user-register";
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
	public String editUser(@PathVariable long id,Model model){
		model.addAttribute("user", userService.findById(id));
		return "user-register";
	}
	

}
