package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import br.qxd.smartgrid.model.Endereco_usuario;
import br.qxd.smartgrid.repository.Endereco_usuarioRepository;

public class Endereco_usuarioService implements Endereco_usuarioRepository {
	
	@Override
	public void deleteAllInBatch() {
		deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Endereco_usuario> arg0) {
		deleteInBatch(arg0);
	}

	@Override
	public List<Endereco_usuario> findAll() {
		List<Endereco_usuario> result = findAll();
		return result;
	}

	@Override
	public List<Endereco_usuario> findAll(Sort arg0) {
		List<Endereco_usuario> result = findAll(arg0);
		return result;
	}

	@Override
	public List<Endereco_usuario> findAll(Iterable<Long> arg0) {
		List<Endereco_usuario> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Endereco_usuario> List<S> findAll(Example<S> arg0) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Endereco_usuario> List<S> findAll(Example<S> arg0, Sort arg1) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public void flush() {
		flush();
	}

	@Override
	public Endereco_usuario getOne(Long arg0) {
		Endereco_usuario usr = getOne(arg0);
		return usr;
	}

	@Override
	public <S extends Endereco_usuario> List<S> save(Iterable<S> arg0) {
		List<S> result = save(arg0);
		return result;
	}

	@Override
	public <S extends Endereco_usuario> S saveAndFlush(S arg0) {
		S result = saveAndFlush(arg0);
		return result;
	}

	@Override
	public Page<Endereco_usuario> findAll(Pageable arg0) {
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
	public void delete(Endereco_usuario arg0) {
		delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Endereco_usuario> arg0) {
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
	public Endereco_usuario findOne(Long arg0) {
		return findOne(arg0);
	}

	@Override
	public <S extends Endereco_usuario> S save(S arg0) {
		S result = save(arg0);
		return result;
	}

	@Override
	public <S extends Endereco_usuario> long count(Example<S> arg0) {
		return count(arg0);
	}

	@Override
	public <S extends Endereco_usuario> boolean exists(Example<S> arg0) {
		return exists(arg0);
	}

	@Override
	public <S extends Endereco_usuario> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return findAll(arg0, arg1);
	}

	@Override
	public <S extends Endereco_usuario> S findOne(Example<S> arg0) {
		return findOne(arg0);
	}
}
