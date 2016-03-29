package es.uniovi.asw.persistence.dbManagement.adminDBManagement;

import java.util.List;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public interface AddCandidacyC {
	
	void saveCandidacys(VotingRepository vRep, CandidacyRepository cRep, List<Candidatura> candidaturas, Long id);

}
