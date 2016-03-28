package es.uniovi.asw.persistence.dbManagement.adminDBManagement;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public interface AddVotingType {
	
	public void addVotingType(VotingRepository vr, Eleccion e);

}
