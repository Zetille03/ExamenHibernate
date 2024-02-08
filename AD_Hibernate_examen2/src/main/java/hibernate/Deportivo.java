package hibernate;

public class Deportivo {
	private int id;
	private int cilindrada;
	private Coche coche;
	
	public Deportivo() {
		
	}
	

	public Deportivo(int id, int cilindrada, Coche coche) {
		super();
		this.id = id;
		this.cilindrada = cilindrada;
		this.coche = coche;
	}


	@Override
	public String toString() {
		return "Deportivo [id=" + id + ", cilindrada=" + cilindrada + ", coche=" + coche.getMarca() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	
}
