package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Opcion;

public interface OptionRepository extends CrudRepository<Opcion, Long> {
	
	@SuppressWarnings("unchecked")
	Opcion save(Opcion opcion);
	
	List<Opcion> findAll();

}
