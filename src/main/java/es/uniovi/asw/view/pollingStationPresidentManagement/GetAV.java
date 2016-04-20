package es.uniovi.asw.view.pollingStationPresidentManagement;

import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.PhysicalVoteService;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.PhysicalVoteServiceImpl;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.repository.EleccionRepository;

public class GetAV {

	private EleccionRepository eRep;

	public GetAV(EleccionRepository eRep) {
		super();
		this.eRep = eRep;
	}
	public Iterable<Eleccion> getAV(EleccionRepository eRep) {

		PhysicalVoteService physicalVoteService = PhysicalVoteServiceImpl.getInstance();
		return physicalVoteService.getActiveVoter(eRep);
	}
}
