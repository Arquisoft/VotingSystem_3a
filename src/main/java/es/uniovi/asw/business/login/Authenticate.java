package es.uniovi.asw.business.login;

public class Authenticate {
	
	public static String authenticate(String user, String password){
		return (user.equals("asw") && password.equals("admin")) ?  "correcto" :  "incorrecto";
	}

}
