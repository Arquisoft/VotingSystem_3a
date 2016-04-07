package es.uniovi.asw.business.login;

public class Authenticate {
	
	public static String authenticate(String user, String password){
		if(user.equals("voter") && password.equals("voter")){
			return "voter";
		}else if(user.equals("admin") && password.equals("admin")){
			return "admin";
		}else if(user.equals("president") && password.equals("president")){
			return "president";
		}else{
			return "incorrecto";
		}
	}

}
