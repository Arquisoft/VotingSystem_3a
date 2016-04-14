package es.uniovi.asw.view.votingSystem.voterManagement;

import es.uniovi.asw.model.Voter;
import es.uniovi.asw.model.VotoConfirmado;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;

public class HasVoted {

	private VoterRepository voterRepository;
	
	public HasVoted(VoterRepository voterRepository) {
		this.voterRepository = voterRepository;
	}
	
	public boolean checkVote(String email) {
		/*Voter voter = voterRepository.findByEmail(email);
		if (voter == null) {
			return false;
		}
		for (VotoConfirmado votoConfirmado: voter.getElecciones()) {
			// Comprobar la eleccion
			if (votoConfirmado.getEleccion().isActiva()) {
				return votoConfirmado.isHaVotado();
			}
		}*/
		return false;
	}
}
