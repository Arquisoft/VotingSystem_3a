package es.uniovi.asw.view.pollingStationPresidentManagement;

import java.util.List;

import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.PhysicalVoteService;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.PhysicalVoteServiceImpl;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;

public class GetV {

	private VoterRepository voterRep;

	public GetV(VoterRepository voterRep) {
		super();
		this.voterRep = voterRep;
	}
	public List<Voter> getV(VoterRepository voterRep) {

		PhysicalVoteService physicalVoteService = PhysicalVoteServiceImpl.getInstance();
		return physicalVoteService.getVoters(voterRep);
	}
}
