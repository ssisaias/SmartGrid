package br.qxd.smartgrid.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.qxd.smartgrid.model.Usuario;
import br.qxd.smartgrid.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService userservice;
	
	@RequestMapping(value={"/create_account"}, method=RequestMethod.GET)
	public String create_account(Model model){
		Usuario user= new Usuario();
		model.addAttribute("usuario", user);
		return "login/create_account";
	}
	@RequestMapping(value={"/create_account"}, method=RequestMethod.POST)
	public String create_account_post(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes){
		
		if (result.hasErrors()){
			attributes.addAttribute("erro",result.getAllErrors().get(0));
			return "redirect:/create_account";
		}
		userservice.save(usuario);
		attributes.addFlashAttribute("mensagemSucesso", "Usuário cadastrado com sucesso!");
		return "redirect:/login";
	}
}
