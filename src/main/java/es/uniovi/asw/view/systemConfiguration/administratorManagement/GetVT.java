package es.uniovi.asw.view.systemConfiguration.administratorManagement;

import java.util.List;

import es.uniovi.asw.business.systemConfiguration.votingParamsManagement.voting.GetVotingTypes;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class GetVT {
	
	private VotingRepository vRep;
	private CandidacyRepository cRep;
	private Long id;
	
	public GetVT(VotingRepository vRep) {
		this.vRep = vRep;
	}
	
	public GetVT(VotingRepository vRep, CandidacyRepository cRep, Long id) {
		this.vRep = vRep;
		this.cRep = cRep;
		this.id = id;
	}
	
	public Eleccion getById(){
		GetVotingTypes gvt = new GetVotingTypes();
		return gvt.getEleccionById(vRep, cRep, id);
	}
	
	public List<Eleccion> getActiveVotings(){
		GetVotingTypes gvt = new GetVotingTypes();
		return gvt.getActiveVotings(vRep);
	}

}
