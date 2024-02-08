package hibernate;

import java.util.HashSet;
import java.util.Set;

public class Concesionario {
	private int id;
	private String nombre;
	private Set<Coche> coches = new HashSet<Coche>(0);
	private Set<Proveedor> proveedores = new HashSet<Proveedor>(0);

	
	public Concesionario() {
		
	}
	
	
	public Concesionario(String nombre, Set<Coche> coches, Set<Proveedor> proveedores) {
		this.nombre = nombre;
		this.coches = coches;
		this.proveedores = proveedores;
	}


	@Override
	public String toString() {
		return "Concesionario [id=" + id + ", nombre=" + nombre + ", coches=" + coches.size() + ", proveedores=" + proveedores.size()
				+ "]";
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

	public Set<Coche> getCoches() {
		return coches;
	}

	public void setCoches(Set<Coche> coches) {
		this.coches = coches;
	}

	public Set<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(Set<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}
	
	
}
