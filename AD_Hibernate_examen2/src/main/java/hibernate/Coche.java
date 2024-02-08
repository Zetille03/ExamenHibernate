package hibernate;

public class Coche {
	private int id;
	private String marca;
	private int antiguedad;
	private int precio;
	private Concesionario concesionario;
	private Deportivo deportivo;
	
	public Coche() {
		
	}
	
	public Coche(String marca, int antiguedad, int precio, Concesionario concesionario, Deportivo deportivo) {
		this.marca = marca;
		this.antiguedad = antiguedad;
		this.precio = precio;
		this.concesionario = concesionario;
		this.deportivo = deportivo;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", antiguedad=" + antiguedad + ", precio=" + precio
				+ ", concesionario=" + concesionario.getId() + ", deportivo=" + (deportivo!=null?deportivo.getId():"NULL") + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Concesionario getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}

	public Deportivo getDeportivo() {
		return deportivo;
	}

	public void setDeportivo(Deportivo deportivo) {
		this.deportivo = deportivo;
	}
	
	
}
