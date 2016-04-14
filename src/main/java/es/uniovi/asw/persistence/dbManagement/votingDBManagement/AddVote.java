package es.uniovi.asw.persistence.dbManagement.votingDBManagement;

import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;

public interface AddVote {
	
	public void storeVote(ConfirmedVoteRepository cvRep, VotoConfirmado vc);
	
}
