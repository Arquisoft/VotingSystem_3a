package es.uniovi.asw.view.votingSystem.voterManagement;

import es.uniovi.asw.business.votingSystem.votingManagement.impl.ServicesFactory;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;

public class AlreadyV {
	
	ConfirmedVoteRepository cvRep;
	VotingRepository vRep;
	
	
	public AlreadyV(ConfirmedVoteRepository cvRep, VotingRepository vRep){
		this.cvRep = cvRep;
		this.vRep = vRep;
	}
	
	public boolean yaHaVotado(Long id, Voter votante){
		return ServicesFactory.newAlreadyVoted().haVotado(id, votante, cvRep, vRep);
	}

}
