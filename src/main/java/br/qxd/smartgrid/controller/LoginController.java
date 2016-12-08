package br.qxd.smartgrid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	
	@RequestMapping(value={"/","/login"})
	public String login(){
		return "login/login";
	}
	@RequestMapping(value={"/create_account"})
	public String create_account(){
		return "login/create_account";
	}
	@RequestMapping(value={"/home"})
	public String home(){
		return "tabs/home";
	}
	@RequestMapping(value={"/search"})
	public String search(){
		return "tabs/search";
	}
	@RequestMapping(value={"/notification"})
	public String notification(){
		return "tabs/notification";
	}
	@RequestMapping(value={"/account"})
	public String account(){
		return "tabs/account";
	}
}
