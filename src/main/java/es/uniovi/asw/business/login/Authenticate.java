package es.uniovi.asw.business.login;

import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.repository.VoterRepository;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.PersistenceFactory;

public class Authenticate {

	public static String authenticate(String user, String password, VoterRepository vtRep, Voter voter) {
		Voter votante = PersistenceFactory.newGetVoters().findByEmail(user, vtRep);
		System.out.println(votante);
		if (votante != null) {
			if (votante.getPassword().equals(password)) {
				voter = votante;
				return "voter";

			}
		} else if (user.equals("admin") && password.equals("admin")) {
			return "admin";
		} else if (user.equals("president") && password.equals("president")) {
			return "president";
		}
		return "incorrecto";

	}

}
