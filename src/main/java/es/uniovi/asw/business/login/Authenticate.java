package es.uniovi.asw.business.login;


import org.springframework.ui.Model;

import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.PersistenceFactory;

public class Authenticate {

	public static String authenticate(String user, String password, Model model) {
		Voter votante = PersistenceFactory.newVoterService().findByEmail(user);
		if (votante != null) {
			if (votante.getPassword().equals(password)) {
				model.addAttribute("voter",votante);
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
