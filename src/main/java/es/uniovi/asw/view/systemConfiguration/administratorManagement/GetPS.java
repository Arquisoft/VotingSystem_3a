package es.uniovi.asw.view.systemConfiguration.administratorManagement;

import java.util.List;

import es.uniovi.asw.business.systemConfiguration.votingParamsManagement.pollingStationManagement.GetPollingStations;
import es.uniovi.asw.model.Circunscripcion;
import es.uniovi.asw.model.ColegioElectoral;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CircunscripcionRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.PollingStationRepository;

public class GetPS {
	
	private PollingStationRepository pRep;
	private CircunscripcionRepository cRep;
	
	public GetPS(PollingStationRepository pRep){
		this.pRep = pRep;
	}
	
	public GetPS(CircunscripcionRepository cRep){
		this.cRep = cRep;
	}
	
	public List<ColegioElectoral> getPollingStations(){
		GetPollingStations gp = new GetPollingStations();
		return gp.getPollingStatons(pRep);
	}
	
	public List<Circunscripcion> getCircunscripciones(){
		GetPollingStations gp = new GetPollingStations();
		return gp.getCircunscripciones(cRep);
	}
	
	public ColegioElectoral getPollingStation(Long id){
		GetPollingStations gp = new GetPollingStations();
		return gp.getById(pRep, id);
	}

}
