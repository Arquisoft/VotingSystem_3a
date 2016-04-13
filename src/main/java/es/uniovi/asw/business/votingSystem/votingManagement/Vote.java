package es.uniovi.asw.business.votingSystem.votingManagement;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.repository.VoteRepository;

public interface Vote {

	public void votar(VoteRepository voRep, Voter votante, Candidatura candidatura);
	
}
