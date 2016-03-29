package es.uniovi.asw.business.systemConfiguration.votingParamsManagement.voting;

import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.GetVotingsImpl;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class GetVotingTypes {
	
	public List<Eleccion> getActiveVotings(VotingRepository vRep){
		GetVotingsImpl vi = new GetVotingsImpl();
		return vi.getVotings(vRep);
	}
	
	public Eleccion getEleccionById(VotingRepository vRep, CandidacyRepository cRep, Long id){
		GetVotingsImpl vi = new GetVotingsImpl();
		return vi.getEleccionById(vRep, cRep, id);
	}

}
