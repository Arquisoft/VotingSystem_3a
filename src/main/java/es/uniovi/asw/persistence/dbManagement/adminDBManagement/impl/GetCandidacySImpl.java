package es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl;

import java.util.ArrayList;
import java.util.List;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.GetCandidacyS;
import es.uniovi.asw.persistence.dbManagement.repository.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.repository.VotingRepository;

class GetCandidacySImpl implements GetCandidacyS{

	@Override
	public List<Candidatura> getCandidacys(VotingRepository vRep, CandidacyRepository cRep, Long id) {
		System.out.println("VRep: " + vRep);
		System.out.println("CRep: " + cRep);
		System.out.println("Long : " + id);
		List<Candidatura> candidaturas = new ArrayList<Candidatura>();
		for(Candidatura c : cRep.findAll()){
			if(c.getEleccion().getId() == id){
				candidaturas.add(c);
			}
		}
		return candidaturas; 
	}

	

}
