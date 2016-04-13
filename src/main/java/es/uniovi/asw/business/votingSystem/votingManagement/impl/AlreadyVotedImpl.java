package es.uniovi.asw.business.votingSystem.votingManagement.impl;

import java.util.ArrayList;
import java.util.List;

import es.uniovi.asw.business.votingSystem.votingManagement.AlreadyVoted;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.PersistenceFactory;

class AlreadyVotedImpl implements AlreadyVoted{

	public List<Eleccion> haVotado(List<Eleccion> activas, Voter votante, ConfirmedVoteRepository cvRep) {
		List<Eleccion> resultado = new ArrayList<Eleccion>();
		List<VotoConfirmado> filtro = PersistenceFactory.newHasVoted().haVotado(cvRep);
		for (Eleccion eleccion : activas) {
			for (VotoConfirmado voto : filtro) {
				if (eleccion.getId().equals(voto.getEleccion().getId())) {
					if (voto.getVotante().getId().equals(votante.getId())) {
						eleccion.setActiva(false);
						resultado.add(eleccion);
					}
				} else {
					resultado.add(eleccion);
				}
			}
		}
		return resultado;
	}

}
