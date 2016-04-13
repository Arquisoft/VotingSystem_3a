package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl;

import java.util.List;

import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.HasVoted;

class HasVotedImpl implements HasVoted {
	
	public List<VotoConfirmado> haVotado(ConfirmedVoteRepository cvRep){
		return cvRep.findByHaVotadoTrue();
	}

}
