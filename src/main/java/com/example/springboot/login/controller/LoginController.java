package main.java.com.example.springboot.login.controller;

import main.java.com.example.springboot.login.model.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import main.java.com.example.springboot.login.constant.LoginConstant;

@Controller
public class LoginController {

	@GetMapping(LoginConstant.LOGIN_LINK)
	@ResponseBody
	public Login sayHello() {
		return new Login("Tung Anh", "login", "BKAV");
	}
}