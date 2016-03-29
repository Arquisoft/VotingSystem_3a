package es.uniovi.asw.persistence.dbManagement.adminDBManagement;

import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public interface GetVotings {
	
	List<Eleccion> getVotings(VotingRepository vr);
	
	Eleccion getEleccionById(VotingRepository vr, CandidacyRepository cRep, Long id);

}
