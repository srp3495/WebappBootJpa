package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Employee;
import com.example.demo.dao.LoginDao;

@Controller
public class LoginController {
	@Autowired
	LoginDao dao;
	
	@RequestMapping("login")
	public String login() {
		return "Login.jsp";
	}
	@RequestMapping("addEntry")
	public String add(Employee emp) {
		dao.save(emp);
		return "Login.jsp";
		
	}
	
	}
