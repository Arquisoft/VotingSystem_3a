package es.uniovi.asw.view.pollingStationPresidentManagement;

import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.PhysicalVoteService;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.PhysicalVoteServiceImpl;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;

public class GetAV {

	private VotingRepository vRep;

	public GetAV(VotingRepository vRep) {
		super();
		this.vRep = vRep;
	}
	public Iterable<Eleccion> getAV(VotingRepository vRep) {

		PhysicalVoteService physicalVoteService = PhysicalVoteServiceImpl.getInstance();
		return physicalVoteService.getActiveVoter(vRep);
	}
}
