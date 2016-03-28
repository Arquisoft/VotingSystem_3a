package es.uniovi.asw.model;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Eleccion {
	
	@Id @GeneratedValue
	private Long id;
	private String nombre;
	private Date fechaInicio, fechaFin;
	private Time horaInicio, horaFin;
	
	@OneToMany(mappedBy = "eleccion")
	private Set<Opcion> opciones;
	
	@OneToMany(mappedBy = "eleccion")
	private Set<VotoConfirmado> votantes;
	
	@OneToMany(mappedBy = "eleccion")
	private Set<Candidatura> candidaturas;
	
	public Eleccion(String nombre, Date inicio, Date fin, Time hInicio, Time hFin){
		this.nombre = nombre;
		this.fechaInicio = inicio;
		this.fechaFin = fin;
		this.horaInicio = hInicio;
		this.horaFin = hFin;
	}
	
	Eleccion() {}
	
	public String getNombre() {
		return nombre;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public Time getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public Time getHoraFin() {
		return horaFin;
	}
	
	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}

	public Set<Opcion> getOpciones() {
		return opciones;
	}

	public void setOpciones(Set<Opcion> opciones) {
		this.opciones = opciones;
	}

	public Set<VotoConfirmado> getVotantes() {
		return votantes;
	}

	public void setVotantes(Set<VotoConfirmado> votantes) {
		this.votantes = votantes;
	}

	public Set<Candidatura> getCandidaturas() {
		return candidaturas;
	}

	public void setCandidaturas(Set<Candidatura> candidaturas) {
		this.candidaturas = candidaturas;
	}

	@Override
	public String toString() {
		return "Eleccion [id=" + id + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", opciones=" + opciones + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Eleccion other = (Eleccion) obj;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
