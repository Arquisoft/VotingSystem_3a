package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl;

import java.util.List;

import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.GetVoters;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.repository.VoterRepository;

class GetVotersImpl implements GetVoters{
	
	public Voter findByEmail(String email, VoterRepository vtRep){
		return vtRep.findOneByEmail(email);
	}
	
	public List<Voter> findAll(VoterRepository vtRep){
		return vtRep.findAll();
	}

}
