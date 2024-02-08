package hibernate;

import java.util.HashSet;
import java.util.Set;

public class Proveedor {
	private int id;
	private String nombre;
	private Set<Concesionario> concesionarios = new HashSet<Concesionario>(0);
	
	public Proveedor() {
		
	}

	public Proveedor(int id, String nombre, Set<Concesionario> concesionarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.concesionarios = concesionarios;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + ", concesionarios=" + concesionarios.size() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Concesionario> getConcesionarios() {
		return concesionarios;
	}

	public void setConcesionarios(Set<Concesionario> concesionarios) {
		this.concesionarios = concesionarios;
	}
	
	
}
