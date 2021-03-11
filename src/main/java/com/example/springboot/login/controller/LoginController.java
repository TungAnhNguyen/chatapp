package main.java.com.example.springboot.login.controller;

import main.java.com.example.springboot.login.model.LoginOutbound;
import main.java.com.example.springboot.login.model.message.inbound.LoginInbound;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.*;

import main.java.com.example.springboot.login.constant.LoginConstant;

@Controller
public class LoginController {

	@RequestMapping(value = LoginConstant.LOGIN_LINK, method = RequestMethod.GET)
	public String getLogin(Model model) {
		System.out.println("anhnt className: " + LoginInbound.class.getSimpleName());
		model.addAttribute(LoginInbound.class.getSimpleName(), new LoginInbound());
		return LoginConstant.LOGIN_TEMPLATE_PATH;
	}

	@RequestMapping(value = LoginConstant.LOGIN_LINK, method = RequestMethod.POST)
	public String greeting(@ModelAttribute LoginInbound loginInbound, Model model) {
		System.out.println("anhnt login name: " + loginInbound.getUserName() + "; password: " + loginInbound.getPassword());
		
		return LoginConstant.LOGIN_RESULT_TEMPLATE_PATH;
	}
}