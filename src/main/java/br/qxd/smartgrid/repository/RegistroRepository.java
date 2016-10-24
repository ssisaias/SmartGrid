package br.qxd.smartgrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.qxd.smartgrid.model.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long>{

}
