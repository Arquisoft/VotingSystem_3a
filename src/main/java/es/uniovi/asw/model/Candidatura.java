package es.uniovi.asw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Candidatura {
	
	@Id @GeneratedValue 
	private Long id;
	
	@ManyToOne
	private Eleccion eleccion;
	private String nombre;
	private String descripcion;
	private String programaElectoral;
	
	Candidatura() {}
	
	public Candidatura(Eleccion eleccion){
		Asociacion.EleccionCandidatura.link(eleccion, this);
	}

	public Eleccion getEleccion() {
		return eleccion;
	}

	public void setEleccion(Eleccion eleccion) {
		this.eleccion = eleccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProgramaElectoral() {
		return programaElectoral;
	}

	public void setProgramaElectoral(String programaElectoral) {
		this.programaElectoral = programaElectoral;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((programaElectoral == null) ? 0 : programaElectoral.hashCode());
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
		Candidatura other = (Candidatura) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (programaElectoral == null) {
			if (other.programaElectoral != null)
				return false;
		} else if (!programaElectoral.equals(other.programaElectoral))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candidatura [id=" + id + ", eleccion=" + eleccion + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", programaElectoral=" + programaElectoral + "]";
	}

}
