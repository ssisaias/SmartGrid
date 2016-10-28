package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.qxd.smartgrid.model.Endereco_usuario;
import br.qxd.smartgrid.repository.Endereco_usuarioRepository;

public class Endereco_usuarioService {
	
	@Autowired
	private Endereco_usuarioRepository enderUsrRepo;
	


	public List<Endereco_usuario> findAll() {
		List<Endereco_usuario> result = enderUsrRepo.findAll();
		return result;
	}

	public void flush() {
		enderUsrRepo.flush();
	}

	public Endereco_usuario getOne(Long arg0) {
		Endereco_usuario usr = enderUsrRepo.getOne(arg0);
		return usr;
	}

	public <S extends Endereco_usuario> List<S> save(Iterable<S> arg0) {
		List<S> result = enderUsrRepo.save(arg0);
		return result;
	}

	public <S extends Endereco_usuario> S saveAndFlush(S arg0) {
		S result = enderUsrRepo.saveAndFlush(arg0);
		return result;
	}

	public long count() {
		return enderUsrRepo.count();
	}

	public void delete(Long arg0) {
		enderUsrRepo.delete(arg0);
	}

	public boolean exists(Long arg0) {
		return enderUsrRepo.exists(arg0);
	}

	public Endereco_usuario findOne(Long arg0) {
		return enderUsrRepo.findOne(arg0);
	}

}
