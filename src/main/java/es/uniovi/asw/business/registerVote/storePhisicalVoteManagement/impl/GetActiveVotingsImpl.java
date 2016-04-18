package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl;

import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.EleccionRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;

import java.util.List;

public class GetActiveVotingsImpl {

    public List<VotoConfirmado> getActiveVoter(String dniVoter, long idElection,
                                               ConfirmedVoteRepository cvRep,
                                               VoterRepository voterRep,
                                               EleccionRepository eRep){

        //De donde coÃ±o saco el voting Repository ???
        //PersistenceFactory.newGetActiveVotings().getActiveVotings(voterRep);
        return null; //TODO

    }

}
