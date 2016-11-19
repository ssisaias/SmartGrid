package br.qxd.smartgrid.api.controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

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
//	//setta o consumo no banco de dados
//	@RequestMapping(value = {"/setconsumo"}, method=RequestMethod.GET)
//	public @ResponseBody String setConsumo(@RequestParam("watts") String watts, @RequestParam(required=true,name="devid") String id, HttpServletResponse response){
//		//Esse id sera subtituido por um hash menor
//		if (id.equals("smartgriddevicetard20160000000000000000000000000000000000100000001")) {
//			System.out.println("recebido watts: " + watts);
//			Registro reg = new Registro();
//			reg.setData(new Timestamp(new Date().getTime()));
//			reg.setTotalWatts(Float.valueOf(watts));
//			regServ.save(reg);
//			return "OK";
//		}
//		else{
//			response.setStatus(403);
//			return "Nao autorizado";
//		}
//	}


	@RequestMapping(value = {"/setconsumo"}, method=RequestMethod.GET)
	public @ResponseBody String setConsumov1(@RequestParam("watts") String watts, HttpServletResponse response){
		//Esse id sera subtituido por um hash menor
		System.out.println("recebido watts: " + watts);
		Registro reg = new Registro();
		reg.setData(new Timestamp(new Date().getTime()));
		reg.setTotalWatts(Float.valueOf(watts));
		regServ.save(reg);
		return "OK";

	}
}
