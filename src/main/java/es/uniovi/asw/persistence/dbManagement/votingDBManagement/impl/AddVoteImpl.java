package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl;

import es.uniovi.asw.model.Voto;
import es.uniovi.asw.persistence.dbManagement.repository.VoteRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.AddVote;

class AddVoteImpl implements AddVote{

	
	public void añadirVoto(VoteRepository voRep, Voto voto) {
		voRep.save(voto);
	}
}
