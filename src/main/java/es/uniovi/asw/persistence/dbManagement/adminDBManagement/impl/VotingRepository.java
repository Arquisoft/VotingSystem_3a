package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Eleccion;

public interface VotingRepository extends CrudRepository<Eleccion, Long> {
	
	@SuppressWarnings("unchecked")
	Eleccion save(Eleccion eleccion);
	
	List<Eleccion> findAll();

}
