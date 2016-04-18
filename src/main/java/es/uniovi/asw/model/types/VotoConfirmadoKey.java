package es.uniovi.asw.model.types;

import java.io.Serializable;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Voter;

public class VotoConfirmadoKey implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Voter votante;
	private Eleccion eleccion;
	
	public VotoConfirmadoKey(){
		
	}
	
	public VotoConfirmadoKey(Long id, Eleccion e, Voter v){
		this.id = id;
		votante = v;
		eleccion = e;
	}	
	
	public Voter getVotante() {
		return votante;
	}

	public Eleccion getEleccion() {
		return eleccion;
	}
	

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eleccion == null) ? 0 : eleccion.hashCode());
		result = prime * result + ((votante == null) ? 0 : votante.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VotoConfirmadoKey other = (VotoConfirmadoKey) obj;
		if (eleccion == null) {
			if (other.eleccion != null)
				return false;
		} else if (!eleccion.equals(other.eleccion))
			return false;
		if (votante == null) {
			if (other.votante != null)
				return false;
		} else if (!votante.equals(other.votante))
			return false;
		return true;
	}


	
	

}
