package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.List;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.AddCandidacyC;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.GetCandidacyS;

public class AddCandidacyCImpl implements AddCandidacyC{
	
	@Override
	public void saveCandidacys(VotingRepository vRep,CandidacyRepository cRep, List<Candidatura> candidaturas, Long id) {
		GetCandidacyS gc = new GetCandidacySImpl();
		List<Candidatura> cand = gc.getCandidacys(vRep, cRep, id);
		for(int i=0; i<cand.size(); i++){
			cand.get(i).setDescripcion(candidaturas.get(i).getDescripcion());
			cand.get(i).setProgramaElectoral(candidaturas.get(i).getProgramaElectoral());
			cRep.save(cand);
		}
	}

}
