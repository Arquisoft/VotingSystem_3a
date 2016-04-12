package es.uniovi.asw.persistence.dbManagement.votingDBManagement;

import es.uniovi.asw.model.Voto;
import es.uniovi.asw.persistence.dbManagement.repository.VoteRepository;

public interface AddVote {
	
	public void añadirVoto(VoteRepository voRep, Voto voto);

}
