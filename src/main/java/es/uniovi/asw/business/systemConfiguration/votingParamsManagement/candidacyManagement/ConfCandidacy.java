package es.uniovi.asw.business.systemConfiguration.votingParamsManagement.candidacyManagement;

import java.util.List;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.AddCandidacyC;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.AddCandidacyCImpl;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class ConfCandidacy {
	
	public void saveCandidacys(VotingRepository vRep,
			CandidacyRepository cRep, List<Candidatura> candidaturas, Long id) {
		AddCandidacyC c = new AddCandidacyCImpl();
		c.saveCandidacys(vRep, cRep, candidaturas, id);
	}

}
