package br.qxd.smartgrid.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import br.qxd.smartgrid.repository.Historico_consumoRepository;
import br.qxd.smartgrid.model.Historico_consumo;

public class Historico_consumoService implements Historico_consumoRepository {
	@Override
	public void deleteAllInBatch() {
		deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Historico_consumo> arg0) {
		deleteInBatch(arg0);
	}

	@Override
	public List<Historico_consumo> findAll() {
		List<Historico_consumo> result = findAll();
		return result;
	}

	@Override
	public List<Historico_consumo> findAll(Sort arg0) {
		List<Historico_consumo> result = findAll(arg0);
		return result;
	}

	@Override
	public List<Historico_consumo> findAll(Iterable<Long> arg0) {
		List<Historico_consumo> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Historico_consumo> List<S> findAll(Example<S> arg0) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public <S extends Historico_consumo> List<S> findAll(Example<S> arg0, Sort arg1) {
		List<S> result = findAll(arg0);
		return result;
	}

	@Override
	public void flush() {
		flush();
	}

	@Override
	public Historico_consumo getOne(Long arg0) {
		Historico_consumo usr = getOne(arg0);
		return usr;
	}

	@Override
	public <S extends Historico_consumo> List<S> save(Iterable<S> arg0) {
		List<S> result = save(arg0);
		return result;
	}

	@Override
	public <S extends Historico_consumo> S saveAndFlush(S arg0) {
		S result = saveAndFlush(arg0);
		return result;
	}

	@Override
	public Page<Historico_consumo> findAll(Pageable arg0) {
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
	public void delete(Historico_consumo arg0) {
		delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Historico_consumo> arg0) {
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
	public Historico_consumo findOne(Long arg0) {
		return findOne(arg0);
	}

	@Override
	public <S extends Historico_consumo> S save(S arg0) {
		S result = save(arg0);
		return result;
	}

	@Override
	public <S extends Historico_consumo> long count(Example<S> arg0) {
		return count(arg0);
	}

	@Override
	public <S extends Historico_consumo> boolean exists(Example<S> arg0) {
		return exists(arg0);
	}

	@Override
	public <S extends Historico_consumo> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return findAll(arg0, arg1);
	}

	@Override
	public <S extends Historico_consumo> S findOne(Example<S> arg0) {
		return findOne(arg0);
	}
}
