package es.uniovi.asw.view.systemConfiguration.administratorManagement;

import java.util.List;

import es.uniovi.asw.business.systemConfiguration.votingParamsManagement.candidacyManagement.GetCandidacys;
import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class GetCand {
	
	private VotingRepository vRep;
	private CandidacyRepository cRep;
	private Long id;
	
	public GetCand(VotingRepository vRep, CandidacyRepository cRep, Long id) {
		this.vRep = vRep;
		this.cRep = cRep;
		this.id = id;
	}
	
	public List<Candidatura> getCandidacys(){
		GetCandidacys gc = new GetCandidacys();
		return gc.getCandidacys(vRep, cRep, id);
	}

}
