package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.ArrayList;
import java.util.List;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.GetCandidacyS;

public class GetCandidacySImpl implements GetCandidacyS{

	@Override
	public List<Candidatura> getCandidacys(VotingRepository vRep, CandidacyRepository cRep, Long id) {
		List<Candidatura> candidaturas = new ArrayList<Candidatura>();
		for(Candidatura c : cRep.findAll()){
			if(c.getEleccion().getId() == id){
				candidaturas.add(c);
			}
		}
		return candidaturas; 
	}

	

}
