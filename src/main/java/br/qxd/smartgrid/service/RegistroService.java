package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import br.qxd.smartgrid.model.Registro;
import br.qxd.smartgrid.repository.RegistroRepository;

public class RegistroService implements RegistroRepository {

	@Override
	public void deleteAllInBatch() {
		deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Registro> arg0) {
		deleteInBatch(arg0);
	}

	@Override
	public List<Registro> findAll() {
		List<Registro> result = findAll();
		return result;
	}

	@Override
	public List<Registro> findAll(Sort arg0) {
		List<Registro> result = findAll(arg0);
		return result;
	}

	@Override
	public List<Registro> findAll(Iterable<Long> arg0) {
		List<Registro> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Registro> List<S> findAll(Example<S> arg0) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Registro> List<S> findAll(Example<S> arg0, Sort arg1) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public void flush() {
		flush();
	}

	@Override
	public Registro getOne(Long arg0) {
		Registro usr = getOne(arg0);
		return usr;
	}

	@Override
	public <S extends Registro> List<S> save(Iterable<S> arg0) {
		List<S> result = save(arg0);
		return result;
	}

	@Override
	public <S extends Registro> S saveAndFlush(S arg0) {
		S result = saveAndFlush(arg0);
		return result;
	}

	@Override
	public Page<Registro> findAll(Pageable arg0) {
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
	public void delete(Registro arg0) {
		delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Registro> arg0) {
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
	public Registro findOne(Long arg0) {
		return findOne(arg0);
	}

	@Override
	public <S extends Registro> S save(S arg0) {
		S result = save(arg0);
		return result;
	}

	@Override
	public <S extends Registro> long count(Example<S> arg0) {
		return count(arg0);
	}

	@Override
	public <S extends Registro> boolean exists(Example<S> arg0) {
		return exists(arg0);
	}

	@Override
	public <S extends Registro> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return findAll(arg0, arg1);
	}

	@Override
	public <S extends Registro> S findOne(Example<S> arg0) {
		return findOne(arg0);
	}

}