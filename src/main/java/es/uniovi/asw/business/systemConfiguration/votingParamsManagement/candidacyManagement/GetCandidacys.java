package es.uniovi.asw.business.systemConfiguration.votingParamsManagement.candidacyManagement;

import java.util.List;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.GetCandidacyS;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.GetCandidacySImpl;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class GetCandidacys {
	
	public List<Candidatura> getCandidacys(VotingRepository vRep, CandidacyRepository cRep, Long id) {
		GetCandidacyS gc = new GetCandidacySImpl();
		return gc.getCandidacys(vRep, cRep, id);
	}

}
