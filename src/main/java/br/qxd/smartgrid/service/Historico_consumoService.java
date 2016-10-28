package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.qxd.smartgrid.model.Historico_consumo;
import br.qxd.smartgrid.repository.Historico_consumoRepository;

public class Historico_consumoService {
	
	@Autowired
	private Historico_consumoRepository histConsRepo;
	


	public List<Historico_consumo> findAll() {
		List<Historico_consumo> result = histConsRepo.findAll();
		return result;
	}

	public void flush() {
		histConsRepo.flush();
	}

	public Historico_consumo getOne(Long arg0) {
		Historico_consumo usr = histConsRepo.getOne(arg0);
		return usr;
	}

	public <S extends Historico_consumo> List<S> save(Iterable<S> arg0) {
		List<S> result = histConsRepo.save(arg0);
		return result;
	}

	public <S extends Historico_consumo> S saveAndFlush(S arg0) {
		S result = histConsRepo.saveAndFlush(arg0);
		return result;
	}

	public long count() {
		return histConsRepo.count();
	}

	public void delete(Long arg0) {
		histConsRepo.delete(arg0);
	}

	public boolean exists(Long arg0) {
		return histConsRepo.exists(arg0);
	}

	public Historico_consumo findOne(Long arg0) {
		return histConsRepo.findOne(arg0);
	}

	
}
