package br.qxd.smartgrid.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumoController {
	
	
	//retorna uma lista exemplo de data/watt
	@RequestMapping(value = {"/"}, method=RequestMethod.GET)
	public @ResponseBody String getConsumoTotal(){
		String consumo = "{\"consumo\":{"
				+ "\"watts\" : 12,"
				+ "\"timestamp\" : \"2016-10-22T18:59:43.511Z\"}"
				+ "}";
		return consumo;
		
	}
	
	//retorna uma lista exemplo de data/watt
		@RequestMapping(value = {"/setconsumo"}, method=RequestMethod.GET)
		public @ResponseBody String setConsumo(@RequestParam("watts") String watts){
			System.out.println("recebido watts: " + watts);
			return "OK";
			
		}
	
}
