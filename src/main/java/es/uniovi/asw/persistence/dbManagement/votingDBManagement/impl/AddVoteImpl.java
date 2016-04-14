package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl;

import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.AddVote;

class AddVoteImpl implements AddVote{

	@Override
	public void storeVote(ConfirmedVoteRepository cvRep, VotoConfirmado vc) {
		cvRep.save(vc);
		
	}

	
	
}
