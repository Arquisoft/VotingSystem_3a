package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.List;

import es.uniovi.asw.model.Circunscripcion;
import es.uniovi.asw.model.ColegioElectoral;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.GetPollingStationsP;

public class GetPollingStationsPImpl implements GetPollingStationsP{

	@Override
	public List<ColegioElectoral> getPollingSttaion(PollingStationRepository pRep) {
		return pRep.findAll();
	}
	
	@Override
	public List<Circunscripcion> getCircunscripciones(CircunscripcionRepository cRep) {
		return cRep.findAll();
	}

	@Override
	public ColegioElectoral getById(PollingStationRepository pRep, Long id) {
		return pRep.findOne(id);
	}
	
	

}
