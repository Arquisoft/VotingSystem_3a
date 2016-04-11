package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.repository.VoterRepository;

@Service
public class VoterService{

	@Autowired
	VoterRepository vtRep;

	public Voter findByEmail(String email) {
		return vtRep.findOneByEmail(email);
	}
}
