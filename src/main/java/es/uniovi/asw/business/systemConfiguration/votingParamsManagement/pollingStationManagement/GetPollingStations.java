package es.uniovi.asw.business.systemConfiguration.votingParamsManagement.pollingStationManagement;

import java.util.List;

import es.uniovi.asw.model.Circunscripcion;
import es.uniovi.asw.model.ColegioElectoral;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.GetPollingStationsP;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CircunscripcionRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.GetPollingStationsPImpl;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.PollingStationRepository;

public class GetPollingStations {
	
	public List<ColegioElectoral> getPollingStatons(PollingStationRepository pRep){
		GetPollingStationsP gp = new GetPollingStationsPImpl();
		return gp.getPollingSttaion(pRep);
	}
	
	public List<Circunscripcion> getCircunscripciones(CircunscripcionRepository cRep){
		GetPollingStationsP gp = new GetPollingStationsPImpl();
		return gp.getCircunscripciones(cRep);
	}
	
	public ColegioElectoral getById(PollingStationRepository pRep, Long id){
		GetPollingStationsP gp = new GetPollingStationsPImpl();
		return gp.getById(pRep, id);
	}

}
