package es.uniovi.asw.persistence.dbManagement;

import es.uniovi.asw.persistence.dbManagement.votingDBManagement.AddVote;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.GetActiveVotings;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.GetVOptions;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.HasVoted;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.AddVoteImpl;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.GetActiveVotingsImpl;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.GetVOptionsImpl;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.HasVotedImpl;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.VoterService;

public class PersistenceFactory {

	
	public static AddVote newAddVote(){
		return new AddVoteImpl();
	}
	
	public static GetActiveVotings newGetActiveVotings(){
		return new GetActiveVotingsImpl();
	}
	
	public static GetVOptions newGetVOptions(){
		return new GetVOptionsImpl();
	}
	
	public static HasVoted newHasVoted(){
		return new HasVotedImpl();
	}
	
	public static VoterService newVoterService(){
		return new VoterService();
	}
}
