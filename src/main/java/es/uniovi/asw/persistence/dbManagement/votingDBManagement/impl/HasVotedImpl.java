package es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl;

import java.util.List;

import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.HasVoted;

class HasVotedImpl implements HasVoted {
	
	public List<VotoConfirmado> haVotado(ConfirmedVoteRepository cvRep){
		return cvRep.findByHaVotadoTrue();
	}

	@Override
	public boolean alreadyVoted(ConfirmedVoteRepository cvRep, Long idVotante, Long idEleccion) {
		List<VotoConfirmado> confirmados = cvRep.findAll();
		for(VotoConfirmado vc : confirmados){
			if(vc.getEleccion().getId().equals(idEleccion) && vc.getVotante().getId().equals(idVotante)){
				return vc.isHaVotado();
			}
		}
		return false;
	}

}
