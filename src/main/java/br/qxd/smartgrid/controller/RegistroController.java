package br.qxd.smartgrid.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.qxd.smartgrid.model.Registro;

@Controller()
public class RegistroController {

	@RequestMapping(value = { "/consumo/get","/search" }, method = RequestMethod.GET)
	public String getConsumo() {
		return "tabs/search";
	}
	
	@RequestMapping(value = { "/consumo/get", }, method = RequestMethod.POST)
	public String buscarConsumo() {
		return "tabs/search";
	}
}
