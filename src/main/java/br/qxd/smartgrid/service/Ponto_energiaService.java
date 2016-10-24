package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import br.qxd.smartgrid.model.Ponto_energia;
import br.qxd.smartgrid.repository.Ponto_energiaRepository;

public class Ponto_energiaService implements Ponto_energiaRepository {

	@Override
	public void deleteAllInBatch() {
		deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Ponto_energia> arg0) {
		deleteInBatch(arg0);
	}

	@Override
	public List<Ponto_energia> findAll() {
		List<Ponto_energia> result = findAll();
		return result;
	}

	@Override
	public List<Ponto_energia> findAll(Sort arg0) {
		List<Ponto_energia> result = findAll(arg0);
		return result;
	}

	@Override
	public List<Ponto_energia> findAll(Iterable<String> arg0) {
		List<Ponto_energia> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Ponto_energia> List<S> findAll(Example<S> arg0) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Ponto_energia> List<S> findAll(Example<S> arg0, Sort arg1) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public void flush() {
		flush();
	}

	@Override
	public Ponto_energia getOne(String arg0) {
		Ponto_energia usr = getOne(arg0);
		return usr;
	}

	@Override
	public <S extends Ponto_energia> List<S> save(Iterable<S> arg0) {
		List<S> result = save(arg0);
		return result;
	}

	@Override
	public <S extends Ponto_energia> S saveAndFlush(S arg0) {
		S result = saveAndFlush(arg0);
		return result;
	}

	@Override
	public Page<Ponto_energia> findAll(Pageable arg0) {
		return findAll(arg0);
	}

	@Override
	public long count() {
		return count();
	}

	@Override
	public void delete(String arg0) {
		delete(arg0);
	}

	@Override
	public void delete(Ponto_energia arg0) {
		delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Ponto_energia> arg0) {
		delete(arg0);
	}

	@Override
	public void deleteAll() {
		deleteAll();
	}

	@Override
	public boolean exists(String arg0) {
		return exists(arg0);
	}

	@Override
	public Ponto_energia findOne(String arg0) {
		return findOne(arg0);
	}

	@Override
	public <S extends Ponto_energia> S save(S arg0) {
		S result = save(arg0);
		return result;
	}

	@Override
	public <S extends Ponto_energia> long count(Example<S> arg0) {
		return count(arg0);
	}

	@Override
	public <S extends Ponto_energia> boolean exists(Example<S> arg0) {
		return exists(arg0);
	}

	@Override
	public <S extends Ponto_energia> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return findAll(arg0, arg1);
	}

	@Override
	public <S extends Ponto_energia> S findOne(Example<S> arg0) {
		return findOne(arg0);
	}

}
