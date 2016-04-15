package es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.impl;

import java.util.List;

import es.uniovi.asw.business.registerVote.storePhisicalVoteManagement.CheckVote;
import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.ConfirmedVoteRepository;

public class CheckVoteImpl implements CheckVote{

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
