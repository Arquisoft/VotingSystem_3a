package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement;

import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;

public interface CheckVote {

	public boolean alreadyVoted(ConfirmedVoteRepository cvRep, Long idVotante, Long idEleccion);
}
