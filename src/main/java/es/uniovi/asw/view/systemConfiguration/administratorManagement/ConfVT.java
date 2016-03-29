package es.uniovi.asw.view.systemConfiguration.administratorManagement;

import es.uniovi.asw.business.systemConfiguration.votingParamsManagement.voting.ConfVotingType;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;

public class ConfVT {
	
	private VotingRepository vRep;
	private CandidacyRepository oRep;
	private Eleccion eleccion;
	private Long id;
	
	public ConfVT(VotingRepository vRep, CandidacyRepository oRep, Eleccion eleccion){
		this.vRep = vRep;
		this.oRep = oRep;
		this.eleccion = eleccion;
	}
	
	public ConfVT(VotingRepository vRep, Long id){
		this.vRep = vRep;
		this.id = id;
	}
	
	public void saveEleccion(){
		ConfVotingType conf = new ConfVotingType();
		conf.saveEleccion(vRep, oRep, eleccion);
	}
	
	public void updateEleccion(){
		ConfVotingType conf = new ConfVotingType();
		conf.updateEleccion(vRep, id);
	}

}
