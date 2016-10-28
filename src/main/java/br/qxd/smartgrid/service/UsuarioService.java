package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.qxd.smartgrid.model.Usuario;
import br.qxd.smartgrid.repository.UsuarioRepository;

@Service
public class UsuarioService{

	@Autowired
	private UsuarioRepository userRepo;
	
	public void deleteAllInBatch() {
		userRepo.deleteAllInBatch();
	}

	public List<Usuario> findAll() {
		List<Usuario> result = userRepo.findAll();
		return result;
	}

	public List<Usuario> findAll(Sort arg0) {
		List<Usuario> result = userRepo.findAll(arg0);
		return result;
	}

	public List<Usuario> findAll(Iterable<Long> arg0) {
		List<Usuario> result = userRepo.findAll(arg0);
		return result;
	}

	public <S extends Usuario> List<S> findAll(Example<S> arg0) {
		List<S> result = userRepo.findAll(arg0);
		return result;
	}

	public <S extends Usuario> List<S> findAll(Example<S> arg0, Sort arg1) {
		List<S> result = userRepo.findAll(arg0);
		return result;
	}

	public void flush() {
		userRepo.flush();
	}

	public Usuario getOne(Long arg0) {
		Usuario usr = userRepo.getOne(arg0);
		return usr;
	}

	public <S extends Usuario> List<S> save(Iterable<S> arg0) {
		List<S> result = userRepo.save(arg0);
		return result;
	}

	public <S extends Usuario> S saveAndFlush(S arg0) {
		S result = userRepo.saveAndFlush(arg0);
		return result;
	}

	public Page<Usuario> findAll(Pageable arg0) {
		return userRepo.findAll(arg0);
	}

	public long count() {
		return userRepo.count();
	}

	public void delete(Long arg0) {
		userRepo.delete(arg0);
	}

	public void delete(Usuario arg0) {
		userRepo.delete(arg0);
	}

	public void delete(Iterable<? extends Usuario> arg0) {
		userRepo.delete(arg0);
	}

	public void deleteAll() {
		userRepo.deleteAll();
	}

	public boolean exists(Long arg0) {
		return userRepo.exists(arg0);
	}

	public Usuario findOne(Long arg0) {
		return userRepo.findOne(arg0);
	}

	public <S extends Usuario> S save(S arg0) {
		S result = userRepo.save(arg0);
		return result;
	}

	public <S extends Usuario> long count(Example<S> arg0) {
		return userRepo.count(arg0);
	}

	public <S extends Usuario> boolean exists(Example<S> arg0) {
		return userRepo.exists(arg0);
	}

	public <S extends Usuario> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return userRepo.findAll(arg0, arg1);
	}

	public <S extends Usuario> S findOne(Example<S> arg0) {
		return userRepo.findOne(arg0);
	}
	
}
