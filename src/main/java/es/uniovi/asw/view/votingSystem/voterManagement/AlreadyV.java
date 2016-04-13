package es.uniovi.asw.view.votingSystem.voterManagement;

import java.util.List;

import es.uniovi.asw.business.votingSystem.votingManagement.impl.ServicesFactory;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;

public class AlreadyV {
	
	ConfirmedVoteRepository cvRep;
	
	List<Eleccion> votadas;
	
	public AlreadyV(ConfirmedVoteRepository cvRep){
		this.cvRep = cvRep;
	}
	
	public List<Eleccion> yaHaVotado(List<Eleccion> activas, Voter votante){
		votadas = ServicesFactory.newAlreadyVoted().haVotado(activas, votante, cvRep);
		return votadas;
	}

}
