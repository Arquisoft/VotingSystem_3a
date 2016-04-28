package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement;


import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;

public interface AddPhisicalVote {

	boolean add(String dniVoter, long idElection, ConfirmedVoteRepository cvRep,
			VoterRepository voterRep, VotingRepository vRep);


}
