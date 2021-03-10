package main.java.com.example.springboot.login.controller;

import main.java.com.example.springboot.login.model.Register;
import main.java.com.example.springboot.register.constant.RegisterConstant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import main.java.com.example.springboot.login.constant.LoginConstant;

@Controller
public class RegisterController {

	@GetMapping(RegisterConstant.REGISTER_LINK)
	@ResponseBody
	public String register() {
		System.out.println("anhnt register");
		return "register.html";
	}
}