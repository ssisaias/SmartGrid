package br.qxd.smartgrid.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.qxd.smartgrid.model.Registro;

@Controller()
public class RegistroController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = { "/consumo/get","/search" }, method = RequestMethod.GET)
	public String getConsumo() {
		return "tabs/search";
	}
	
	@RequestMapping(value = { "/consumo/get", }, method = RequestMethod.POST)
	public String buscarConsumo(HttpServletRequest request) {

		try {
			String inicio = request.getParameter("inicio");
			String fim = request.getParameter("fim");
			SimpleDateFormat formatBra = new SimpleDateFormat("dd/MM/yyyy");

			Date dataIni = formatBra.parse(inicio);
			Date dataFim = formatBra.parse(fim);
			log.info(dataIni.toString() + " " + dataFim.toString());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "tabs/search";
	}
}
