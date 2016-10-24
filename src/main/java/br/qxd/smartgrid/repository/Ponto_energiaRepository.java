package br.qxd.smartgrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.qxd.smartgrid.model.Ponto_energia;

public interface Ponto_energiaRepository extends JpaRepository<Ponto_energia, String> {

}
