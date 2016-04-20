package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl;

import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.GetActiveVotings;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.EleccionRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;

import java.util.List;

public class GetActiveVotingsImpl implements GetActiveVotings {

	@Override
    public Iterable<Eleccion> getActiveVoter(EleccionRepository eRep){

        return eRep.findAll(); //TODO

    }

}
