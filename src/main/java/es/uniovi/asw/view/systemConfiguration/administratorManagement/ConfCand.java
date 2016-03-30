package es.uniovi.asw.view.systemConfiguration.administratorManagement;

import java.util.List;

import es.uniovi.asw.business.systemConfiguration.votingParamsManagement.candidacyManagement.ConfCandidacy;
import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class ConfCand {
	
	private VotingRepository vRep;
	private CandidacyRepository cRep;
	private List<Candidatura> candidaturas;
	private Long id;
	
	public ConfCand(VotingRepository vRep, CandidacyRepository cRep, List<Candidatura> candidaturas, Long id){
		this.vRep = vRep;
		this.cRep = cRep;
		this.candidaturas = candidaturas;
		this.id = id;
	}
	
	public void saveCandidaturas(){
		ConfCandidacy cc = new ConfCandidacy();
		cc.saveCandidacys(vRep, cRep, candidaturas, id);
	}

}
