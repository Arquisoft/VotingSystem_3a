package es.uniovi.asw.business.systemConfiguration.votingParamsManagement.voting;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.AddVotingTypeImpl;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.OptionRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class ConfVotingType {
	
	public void saveEleccion(VotingRepository vr, OptionRepository oRep, Eleccion e){
		AddVotingTypeImpl votingType = new AddVotingTypeImpl();
		votingType.addVotingType(vr, oRep, e);
	}
	
	public void updateEleccion(VotingRepository vr, Long id){
		AddVotingTypeImpl votingType = new AddVotingTypeImpl();
		votingType.setActivation(vr,id);
	}

}
