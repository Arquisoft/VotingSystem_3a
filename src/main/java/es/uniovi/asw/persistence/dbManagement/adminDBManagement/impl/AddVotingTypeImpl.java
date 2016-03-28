package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Opcion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.AddVotingType;

public class AddVotingTypeImpl implements AddVotingType{

	@Override
	public void addVotingType(VotingRepository vRep, OptionRepository oRep, Eleccion e) {
		vRep.save(e);
		List<Opcion> opciones = e.getOpciones();
		for(Opcion o: opciones){
			o.setEleccion(e);
			oRep.save(o);
		}
	}

	@Override
	public void setActivation(VotingRepository vr, Long id) {
		Eleccion e = vr.findOne(id);
		e.setActiva(! e.isActiva());
		vr.save(e);
	}
}
