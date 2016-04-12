package es.uniovi.asw.business.login;



import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.PersistenceFactory;

public class Authenticate {

	public static String authenticate(String user, String password) {
		Voter votante = PersistenceFactory.newVoterService().findByEmail(user);
		if (votante != null) {
			if (votante.getPassword().equals(password)) {
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
