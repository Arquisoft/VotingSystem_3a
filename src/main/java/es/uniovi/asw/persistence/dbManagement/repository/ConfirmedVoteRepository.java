package es.uniovi.asw.persistence.dbManagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.VotoConfirmado;

public interface ConfirmedVoteRepository extends CrudRepository<VotoConfirmado, Long>{

	
	VotoConfirmado findOne(Long id);
	
	@SuppressWarnings("unchecked")
	VotoConfirmado save(VotoConfirmado vc);
	
	
	
}
