package es.uniovi.asw.view.systemConfiguration.administratorManagement;

import java.util.List;

import es.uniovi.asw.business.systemConfiguration.votingParamsManagement.voting.GetVotingTypes;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class GetVT {
	
	private VotingRepository vRep;
	
	public GetVT(VotingRepository vRep) {
		this.vRep = vRep;
	}
	
	public List<Eleccion> getActiveVotings(){
		GetVotingTypes gvt = new GetVotingTypes();
		return gvt.getActiveVotings(vRep);
	}

}
