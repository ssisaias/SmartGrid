package br.qxd.smartgrid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoutingController {

	
	@RequestMapping(value = "/login",  method = { RequestMethod.GET, RequestMethod.POST })
	public String login(){
		return "login";
	}
	
	@RequestMapping(value={"/create_address"})
	public String create_address(){
		return "login/create_address";
	}
	@RequestMapping(value={"/home"})
	public String home(){
		return "tabs/home";
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
