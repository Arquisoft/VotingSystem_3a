package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl;


import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.CheckVote;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.PersistenceFactory;

public class CheckVoteImpl implements CheckVote{

    public boolean alreadyVoted(ConfirmedVoteRepository cvRep, Long idVotante, Long idEleccion) {

        return PersistenceFactory.newHasVoted().alreadyVoted(cvRep,idVotante,idEleccion);

    }

}
