package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.qxd.smartgrid.model.Ponto_energia;
import br.qxd.smartgrid.repository.Ponto_energiaRepository;

public class Ponto_energiaService {

	@Autowired
	private Ponto_energiaRepository pontoEnergiaRepo;
	


	public List<Ponto_energia> findAll() {
		List<Ponto_energia> result = pontoEnergiaRepo.findAll();
		return result;
	}

	public void flush() {
		pontoEnergiaRepo.flush();
	}

	public Ponto_energia getOne(String arg0) {
		Ponto_energia usr = pontoEnergiaRepo.getOne(arg0);
		return usr;
	}

	public <S extends Ponto_energia> List<S> save(Iterable<S> arg0) {
		List<S> result = pontoEnergiaRepo.save(arg0);
		return result;
	}

	public <S extends Ponto_energia> S saveAndFlush(S arg0) {
		S result = pontoEnergiaRepo.saveAndFlush(arg0);
		return result;
	}

	public long count() {
		return pontoEnergiaRepo.count();
	}

	public void delete(String arg0) {
		pontoEnergiaRepo.delete(arg0);
	}

	public boolean exists(String arg0) {
		return pontoEnergiaRepo.exists(arg0);
	}

	public Ponto_energia findOne(String arg0) {
		return pontoEnergiaRepo.findOne(arg0);
	}


}
