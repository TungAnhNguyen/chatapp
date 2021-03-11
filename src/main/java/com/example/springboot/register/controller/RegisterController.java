package main.java.com.example.springboot.login.controller;

import main.java.com.example.springboot.login.model.Register;
import main.java.com.example.springboot.login.model.message.inbound.LoginInbound;
import main.java.com.example.springboot.register.constant.RegisterConstant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.*;

@Controller
public class RegisterController {

	@RequestMapping(value = RegisterConstant.REGISTER_LINK, method = RequestMethod.GET)
	public String getLogin(Model model) {
		System.out.println("anhnt className: " + LoginInbound.class.getSimpleName());
		model.addAttribute(LoginInbound.class.getSimpleName(), new LoginInbound());
		return RegisterConstant.REGISTER_TEMPLATE_PATH;
	}

	@RequestMapping(value = RegisterConstant.REGISTER_LINK, method = RequestMethod.POST)
	public String greeting(@ModelAttribute LoginInbound loginInbound, Model model) {
		System.out.println("anhnt register name: " + loginInbound.getUserName() + "; password: " + loginInbound.getPassword());
		
		return RegisterConstant.REGISTER_RESULT_TEMPLATE_PATH;
	}
}