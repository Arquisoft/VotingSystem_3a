package es.uniovi.asw.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ColegioElectoral {
	
	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne
	private Circunscripcion circunscripcion;
	
	@OneToMany(mappedBy = "colegio")
	private Set<Voto> votos;
	
	@OneToMany(mappedBy = "colegio")
	private Set<Voter> votantes;
	
	private String nombre;
	private String poblacion;
	
	ColegioElectoral() {}
	
	public ColegioElectoral(Circunscripcion c){
		Asociacion.CircunscripcionColegio.link(c, this);
	}
	
	public Set<Voto> getVotos() {
		return votos;
	}
	
	public void setVotos(Set<Voto> votos) {
		this.votos = votos;
	}
	
	public Set<Voter> getVotantes() {
		return votantes;
	}
	
	public void setVotantes(Set<Voter> votantes) {
		this.votantes = votantes;
	}
	
	public String getPoblacion() {
		return poblacion;
	}
	
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	public Circunscripcion getCircunscripcion() {
		return circunscripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCircunscripcion(Circunscripcion circunscripcion) {
		this.circunscripcion = circunscripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((circunscripcion == null) ? 0 : circunscripcion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((poblacion == null) ? 0 : poblacion.hashCode());
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
		ColegioElectoral other = (ColegioElectoral) obj;
		if (circunscripcion == null) {
			if (other.circunscripcion != null)
				return false;
		} else if (!circunscripcion.equals(other.circunscripcion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (poblacion == null) {
			if (other.poblacion != null)
				return false;
		} else if (!poblacion.equals(other.poblacion))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ColegioElectoral [circunscripcion=" + circunscripcion + ", votos=" + votos + ", votantes=" + votantes
				+ ", nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}
	
	

}
