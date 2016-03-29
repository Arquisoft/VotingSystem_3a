package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Candidatura;

public interface CandidacyRepository extends CrudRepository<Candidatura, Long> {
	
	@SuppressWarnings("unchecked")
	Candidatura save(Candidatura opcion);
	
	List<Candidatura> findAll();

}
