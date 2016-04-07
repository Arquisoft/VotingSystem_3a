package es.uniovi.asw.persistence.dbManagement.adminDBManagement;

import java.util.List;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.repository.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.repository.VotingRepository;

public interface AddCandidacyC {
	
	public void saveCandidacys(VotingRepository vRep, CandidacyRepository cRep, List<Candidatura> candidaturas, Long id);

}
