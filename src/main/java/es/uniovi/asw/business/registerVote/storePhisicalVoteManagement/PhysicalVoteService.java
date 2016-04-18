package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement;

import es.uniovi.asw.model.Voter;
import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.EleccionRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;

import java.util.List;

public interface PhysicalVoteService {

	boolean add(String dniVoter, long idElection, ConfirmedVoteRepository cvRep,
			VoterRepository voterRep, EleccionRepository eRep);

	boolean checkVote(String dniVoter, long idElection, ConfirmedVoteRepository cvRep,
				VoterRepository voterRep);

    public List<Voter> getVoters(VoterRepository voterRep);

    List<VotoConfirmado> getActiveVoter(String dniVoter, long idElection,
                                        ConfirmedVoteRepository cvRep,
                                        VoterRepository voterRep,
                                        EleccionRepository eRep);

}

