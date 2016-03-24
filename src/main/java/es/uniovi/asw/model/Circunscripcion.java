package es.uniovi.asw.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Circunscripcion {
	
	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne
	private ComunidadAutonoma comunidad;
	
	@OneToMany(mappedBy = "circunscripcion")
	private Set<ColegioElectoral> colegios;
	
	Circunscripcion() {}
	
	public Circunscripcion(ComunidadAutonoma comunidad){
		Asociacion.ComunidadCircunscripcion.link(comunidad, this);
	}
	
	public ComunidadAutonoma getComunidad() {
		return comunidad;
	}

	public Set<ColegioElectoral> getColegios() {
		return colegios;
	}

	public void setColegios(Set<ColegioElectoral> colegios) {
		this.colegios = colegios;
	}

	public void setComunidad(ComunidadAutonoma comunidad) {
		this.comunidad = comunidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comunidad == null) ? 0 : comunidad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Circunscripcion other = (Circunscripcion) obj;
		if (comunidad == null) {
			if (other.comunidad != null)
				return false;
		} else if (!comunidad.equals(other.comunidad))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circunscripcion [id=" + id + ", comunidad=" + comunidad + "]";
	}

}
