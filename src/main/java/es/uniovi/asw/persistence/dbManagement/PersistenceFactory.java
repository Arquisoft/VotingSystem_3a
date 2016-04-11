package es.uniovi.asw.persistence.dbManagement;

import es.uniovi.asw.persistence.dbManagement.votingDBManagement.AddVote;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.GetActiveVotings;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.GetVOptions;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.HasVoted;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.AddVoteImpl;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.GetActiveVotingsImpl;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.GetVOptionsImpl;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.HasVotedImpl;

public class PersistenceFactory {

	
	public AddVote newAddVote(){
		return new AddVoteImpl();
	}
	
	public GetActiveVotings newGetActiveVotings(){
		return new GetActiveVotingsImpl();
	}
	
	public GetVOptions newGetVOptions(){
		return new GetVOptionsImpl();
	}
	
	public HasVoted newHasVoted(){
		return new HasVotedImpl();
	}
}
