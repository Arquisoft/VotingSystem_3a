package es.uniovi.asw.view.pollingStationPresidentManagement;


import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.PhysicalVoteService;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.PhysicalVoteServiceImpl;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;

public class AddPV {
	
	private ConfirmedVoteRepository cvRep;
	private VoterRepository vRep;
	private VotingRepository voRep;

	public AddPV(ConfirmedVoteRepository cvRep, VoterRepository vRep,
			VotingRepository voRep) {
		super();
		this.cvRep = cvRep;
		this.vRep = vRep;
		this.voRep = voRep;
	}

	public boolean addPV(String dniVoter, long idElection) {
		
		PhysicalVoteService physicalVoteService = PhysicalVoteServiceImpl.getInstance();
		return physicalVoteService.add(dniVoter, idElection,
				cvRep, vRep, voRep);
	}

}
