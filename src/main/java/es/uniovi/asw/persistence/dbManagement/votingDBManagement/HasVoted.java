package es.uniovi.asw.persistence.dbManagement.votingDBManagement;

import java.util.List;

import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;

public interface HasVoted {
	
	public List<VotoConfirmado> haVotado(ConfirmedVoteRepository cvRep);

	public boolean alreadyVoted(ConfirmedVoteRepository cvRep, Long idVotante, Long idEleccion);
	
}
