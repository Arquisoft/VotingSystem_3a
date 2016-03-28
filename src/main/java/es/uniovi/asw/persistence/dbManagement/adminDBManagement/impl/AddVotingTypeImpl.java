package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.AddVotingType;

public class AddVotingTypeImpl implements AddVotingType{

	@Override
	public void addVotingType(VotingRepository vr, Eleccion e) {
		vr.save(e);
	}
}
