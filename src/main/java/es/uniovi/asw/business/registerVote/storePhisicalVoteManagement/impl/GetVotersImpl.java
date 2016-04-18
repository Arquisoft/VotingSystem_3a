package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl;

import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.PersistenceFactory;

import java.util.List;

public class GetVotersImpl {

    public List<Voter> getVoters( VoterRepository voterRep) {
        return PersistenceFactory.newGetVoters().findAll(voterRep);
    }

}

