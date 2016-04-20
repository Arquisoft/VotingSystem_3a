package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement;

import java.util.List;

import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;

public interface GetVoters {

	List<Voter> getVoters(VoterRepository voterRep);

}
