package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.VotoConfirmado;

public interface ConfirmedVoteRespository extends CrudRepository<VotoConfirmado, Long>{

	
	List<VotoConfirmado>findAll();
	
	VotoConfirmado findOne(Long id);
	
}
