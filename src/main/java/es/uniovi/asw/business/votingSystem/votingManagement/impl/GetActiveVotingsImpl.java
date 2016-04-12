package es.uniovi.asw.business.votingSystem.votingManagement.impl;

import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.PersistenceFactory;

class GetActiveVotingsImpl {

	
	public List<Eleccion> eleccionesActivas(VotingRepository vRep){
		return PersistenceFactory.newGetActiveVotings().eleccionesActivas(vRep);
	}
	
}
