package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Voter;

public interface VoterRepository extends CrudRepository<Voter,Serializable> {
	
	List<Voter> findOne(Long id);
	
	List<Voter> findOneByEmail(Long id);
}
