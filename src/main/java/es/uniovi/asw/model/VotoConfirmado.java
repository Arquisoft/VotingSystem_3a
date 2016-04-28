package es.uniovi.asw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import es.uniovi.asw.model.types.VotoConfirmadoKey;

@Entity
@IdClass( VotoConfirmadoKey.class )
public class VotoConfirmado {
	
	@Id @GeneratedValue
	private Long identityId;
	
	@Id@ManyToOne
	@JoinColumn(name = "votante")
	private Voter votante;
	@Id@ManyToOne
	@JoinColumn(name = "eleccion")
	private Eleccion eleccion;

	private boolean haVotado;
	
	VotoConfirmado() {}
	
	public VotoConfirmado(Voter voter, Eleccion eleccion){
		Asociacion.EleccionVotoConfirmado.link(eleccion, this);
		Asociacion.VotanteVotoConfirmado.link(voter, this);
	}
	
	public Voter getVotante() {
		return votante;
	}
	public void setVotante(Voter votante) {
		this.votante = votante;
	}
	public Eleccion getEleccion() {
		return eleccion;
	}
	public void setEleccion(Eleccion eleccion) {
		this.eleccion = eleccion;
	}
	public boolean isHaVotado() {
		return haVotado;
	}
	public void setHaVotado(boolean haVotado) {
		this.haVotado = haVotado;
	}
	
	@Override
	public String toString() {
		return "VotoConfirmado [votante=" + votante + ", eleccion=" + eleccion + ", haVotado=" + haVotado + "]";
	}
}
