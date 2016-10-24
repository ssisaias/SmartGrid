package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import br.qxd.smartgrid.model.Usuario;
import br.qxd.smartgrid.repository.UsuarioRepository;

public class UsuarioService implements UsuarioRepository{

	@Override
	public void deleteAllInBatch() {
		deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Usuario> arg0) {
		deleteInBatch(arg0);
	}

	@Override
	public List<Usuario> findAll() {
		List<Usuario> result = findAll();
		return result;
	}

	@Override
	public List<Usuario> findAll(Sort arg0) {
		List<Usuario> result = findAll(arg0);
		return result;
	}

	@Override
	public List<Usuario> findAll(Iterable<Long> arg0) {
		List<Usuario> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Usuario> List<S> findAll(Example<S> arg0) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Usuario> List<S> findAll(Example<S> arg0, Sort arg1) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public void flush() {
		flush();
	}

	@Override
	public Usuario getOne(Long arg0) {
		Usuario usr = getOne(arg0);
		return usr;
	}

	@Override
	public <S extends Usuario> List<S> save(Iterable<S> arg0) {
		List<S> result = save(arg0);
		return result;
	}

	@Override
	public <S extends Usuario> S saveAndFlush(S arg0) {
		S result = saveAndFlush(arg0);
		return result;
	}

	@Override
	public Page<Usuario> findAll(Pageable arg0) {
		return findAll(arg0);
	}

	@Override
	public long count() {
		return count();
	}

	@Override
	public void delete(Long arg0) {
		delete(arg0);
	}

	@Override
	public void delete(Usuario arg0) {
		delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Usuario> arg0) {
		delete(arg0);
	}

	@Override
	public void deleteAll() {
		deleteAll();
	}

	@Override
	public boolean exists(Long arg0) {
		return exists(arg0);
	}

	@Override
	public Usuario findOne(Long arg0) {
		return findOne(arg0);
	}

	@Override
	public <S extends Usuario> S save(S arg0) {
		S result = save(arg0);
		return result;
	}

	@Override
	public <S extends Usuario> long count(Example<S> arg0) {
		return count(arg0);
	}

	@Override
	public <S extends Usuario> boolean exists(Example<S> arg0) {
		return exists(arg0);
	}

	@Override
	public <S extends Usuario> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return findAll(arg0, arg1);
	}

	@Override
	public <S extends Usuario> S findOne(Example<S> arg0) {
		return findOne(arg0);
	}
	
}
