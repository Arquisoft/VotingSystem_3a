package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl;

import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.GetActiveVotings;

class GetActiveVotingsImpl implements GetActiveVotings {
	
	public List<Eleccion> eleccionesActivas(VotingRepository vRep){
		return vRep.findByActivaTrue();
	}

}
