package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.GetVotings;

public class GetVotingsImpl implements GetVotings{

	@Override
	public List<Eleccion> getVotings(VotingRepository vr) {
		return vr.findAll();
	}
	
	

}
