package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.repository.EleccionRepository;

public interface GetActiveVotings {

	Iterable<Eleccion> getActiveVoter(EleccionRepository eRep);

}
