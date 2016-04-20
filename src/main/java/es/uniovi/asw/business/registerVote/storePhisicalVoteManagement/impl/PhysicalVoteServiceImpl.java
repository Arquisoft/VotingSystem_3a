package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl;

import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.PhysicalVoteService;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.AddPhysicalVoteImpl;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.CheckVoteImpl;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.GetActiveVotingsImpl;
import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl.GetVotersImpl;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.repository.EleccionRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;

import java.util.List;


public class PhysicalVoteServiceImpl implements PhysicalVoteService{
    private static PhysicalVoteServiceImpl ourInstance = new PhysicalVoteServiceImpl();

    public static PhysicalVoteServiceImpl getInstance() {
        return ourInstance;
    }

    private PhysicalVoteServiceImpl() {
    }

    @Override
    public boolean add(String dniVoter, long idElection,
                                  ConfirmedVoteRepository cvRep,
                                  VoterRepository voterRep,
                                  EleccionRepository eRep) {
        return new AddPhysicalVoteImpl().add(dniVoter, idElection, cvRep, voterRep, eRep);
    }

    @Override
    public boolean checkVote(String dniVoter, long idElection, ConfirmedVoteRepository cvRep, VoterRepository voterRep) {
        return new CheckVoteImpl().checkVote(dniVoter, idElection, cvRep, voterRep);
    }

    @Override
    public List<Voter> getVoters(VoterRepository voterRep) {
        return new GetVotersImpl().getVoters(voterRep);
    }

    @Override
    public Iterable<Eleccion> getActiveVoter(EleccionRepository eRep) {
        return new GetActiveVotingsImpl().getActiveVoter(eRep);
    }
}
