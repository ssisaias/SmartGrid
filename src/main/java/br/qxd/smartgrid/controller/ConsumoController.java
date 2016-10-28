package br.qxd.smartgrid.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.qxd.smartgrid.model.Registro;
import br.qxd.smartgrid.service.RegistroService;


@RestController
public class ConsumoController {
	
	@Autowired
	private RegistroService regServ;
	
	//retorna uma lista exemplo de data/watt
	@RequestMapping(value = {"/"}, method=RequestMethod.GET)
	public @ResponseBody List<Registro> getConsumoTotal(){
		return regServ.findAll();
		
	}
	
	//retorna uma lista exemplo de data/watt
		@RequestMapping(value = {"/setconsumo"}, method=RequestMethod.GET)
		public @ResponseBody String setConsumo(@RequestParam("watts") String watts){
			System.out.println("recebido watts: " + watts);
			Registro reg = new Registro();
			reg.setData(new Timestamp(new Date().getTime()));
			reg.setTotalWatts(Float.valueOf(watts));
			regServ.save(reg);
			return "OK";
			
		}
	
}
