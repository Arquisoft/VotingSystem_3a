package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl;

import java.util.ArrayList;
import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.GetActiveVotings;

class GetActiveVotingsImpl implements GetActiveVotings {

	@Override
	public List<Eleccion> getActiveVotings(VotingRepository vr) {
		List<Eleccion> resultado = new ArrayList<Eleccion>();
		for(Eleccion e : vr.findAll()){
			if(e.isActiva())
				resultado.add(e);
		}
		return resultado;
	}
	
	

}
