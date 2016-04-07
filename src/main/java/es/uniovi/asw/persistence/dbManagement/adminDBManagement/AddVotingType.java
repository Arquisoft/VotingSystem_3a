package es.uniovi.asw.persistence.dbManagement.adminDBManagement;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.repository.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.repository.VotingRepository;

public interface AddVotingType {
	
	void addVotingType(VotingRepository vr, CandidacyRepository oRep, Eleccion e);
	
	void setActivation(VotingRepository vr, Long id);

}
