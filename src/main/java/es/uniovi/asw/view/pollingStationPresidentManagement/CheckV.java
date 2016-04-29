package es.uniovi.asw.view.pollingStationPresidentManagement;

import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.PhysicalVoteService;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.PhysicalVoteServiceImpl;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;

public class CheckV {

	private ConfirmedVoteRepository cvRep;

	public CheckV(ConfirmedVoteRepository cvRep) {
		super();
		this.cvRep = cvRep;
	}

	public boolean checkV(long idVotante, long idEleccion) {

		PhysicalVoteService physicalVoteService = PhysicalVoteServiceImpl.getInstance();
		return physicalVoteService.checkVote(idVotante, idEleccion, cvRep);
	}

}
