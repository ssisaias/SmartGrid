package br.qxd.smartgrid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	
	@RequestMapping(value={"/","/login"})
	public String login(){
		return "login";
	}
	
	@RequestMapping(value={"/home"})
	public String home(){
		return "home";
	}
}