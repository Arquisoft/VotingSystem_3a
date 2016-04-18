package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl;


import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.PersistenceFactory;

public class CheckVoteImpl {

    public boolean checkVote(String dniVoter, long idElection, ConfirmedVoteRepository cvRep, VoterRepository voterRep) {

        Long idVoter=voterRep.findOneByNif(dniVoter).getId();
        return PersistenceFactory.newHasVoted().alreadyVoted(cvRep,idVoter,idElection);

    }

}
