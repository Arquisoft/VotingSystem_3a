package es.uniovi.asw.business.votingSystem.votingManagement;

import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;

public interface AlreadyVoted {

	public List<Eleccion> haVotado(List<Eleccion> activas, Voter votante, ConfirmedVoteRepository cvRep);
}
