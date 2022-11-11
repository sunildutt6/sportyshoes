package com.ecommerce.ss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.ss.entities.User;
import com.ecommerce.ss.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userservice;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createUser";
	}

	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user, ModelMap m) {

		User saveUser = userservice.saveUser(user);
		String msg = "User saved with Id: " + saveUser.getId();
		m.addAttribute("msg", msg);
		return "createUser";
	}

	@RequestMapping("/displayUsers")
	public String displayUsers(ModelMap m) {
		List<User> allUsers = userservice.getAllUsers();
		m.addAttribute("allUsers", allUsers);
		return "displayUsers";
	}

	@RequestMapping("/showUser")
	public String findUser(@RequestParam("firstname") String firstname, ModelMap m) {
		User user = userservice.getUserByFirstname(firstname);
		m.addAttribute("user", user);
		return "showUser";

	}
}
