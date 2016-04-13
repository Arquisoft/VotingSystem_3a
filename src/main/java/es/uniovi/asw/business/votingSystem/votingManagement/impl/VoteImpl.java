package es.uniovi.asw.business.votingSystem.votingManagement.impl;

import es.uniovi.asw.business.votingSystem.votingManagement.Vote;
import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.model.Voto;
import es.uniovi.asw.persistence.dbManagement.repository.VoteRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.PersistenceFactory;

class VoteImpl implements Vote{

	
	public void votar(VoteRepository voRep, Voter votante, Candidatura candidatura){
		Voto voto = new Voto();
		voto.setColegio(votante.getColegio());
		voto.setOpcion(candidatura);
		PersistenceFactory.newAddVote().añadirVoto(voRep, voto);
	}
}
