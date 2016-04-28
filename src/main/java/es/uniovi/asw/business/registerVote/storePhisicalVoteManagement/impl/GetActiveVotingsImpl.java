package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl;

import java.util.Date;

import java.util.ArrayList;

import java.util.List;

import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.GetActiveVotings;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.PersistenceFactory;

public class GetActiveVotingsImpl implements GetActiveVotings {
	@Override
	public List<Eleccion> getActiveVoter(VotingRepository vRep) {
		List<Eleccion> activas = PersistenceFactory.newGetActiveVotings().getActiveVotings(vRep);
		List<Eleccion> resultado = new ArrayList<Eleccion>();
		for (Eleccion e : activas) {
			if (e.getFechaFin().after(new Date()))
				resultado.add(e);
		}
		return resultado; // TODO

	}

}
