package alumno.hql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.*;

public class HqlEsqueleto {
	private static SessionFactory sf = Hibernateconexion.getSessionFactory();
	// Mapeo:
	public void imprimirProveedores() {
		Session session = sf.openSession();
		String hql = "FROM Proveedor";
		
		Query<Proveedor> query = session.createQuery(hql,Proveedor.class);
		List<Proveedor> list = query.getResultList();
		for(Proveedor p: list) {
			System.out.println("----------"+p);
		}
		session.close();
	}

	public void imprimirConcesionario() {
		Session session = sf.openSession();
		String hql = "FROM Concesionario";
		
		Query<Concesionario> query = session.createQuery(hql,Concesionario.class);
		List<Concesionario> list = query.getResultList();
		for(Concesionario c: list) {
			System.out.println("----------"+c);
		}
		session.close();
	}

	public void imprimirCoche() {
		Session session = sf.openSession();
		String hql = "FROM Coche";
		
		Query<Coche> query = session.createQuery(hql,Coche.class);
		List<Coche> list = query.getResultList();
		for(Coche c: list) {
			System.out.println("----------"+c);
		}
		session.close();
	}

	public void imprimirDeportivo() {
		Session session = sf.openSession();
		String hql = "FROM Deportivo";
		
		Query<Deportivo> query = session.createQuery(hql,Deportivo.class);
		List<Deportivo> list = query.getResultList();
		for(Deportivo d: list) {
			System.out.println("----------"+d);
		}
		session.close();
	}

	// Persistencia
	public void nuevoCoche(Coche c, int concesionarioPertenece) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		c.getConcesionario().setId(concesionarioPertenece);
		session.persist(c);
		trans.commit();
		session.close();
	}

	public void nuevoConcesionarioConNuevosCoches(Concesionario concesionario, ArrayList<Coche> coches) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		for(Coche c: coches) {
			concesionario.getCoches().add(c);
		}
		session.persist(concesionario);
		trans.commit();
		session.close();
	}

	public void eliminarConcesionario(int id) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Concesionario c = session.get(Concesionario.class, id);
		session.remove(c);
		trans.commit();
		session.close();
	}

	// HQL
	public void cochePrecioAntiguad(int precio, int antiguedad) {
		Session session = sf.openSession();
		String hql = "FROM Coche c WHERE c.precio >= :precio AND c.antiguedad <= :antiguedad";
		Query<Coche> query = session.createQuery(hql,Coche.class);
		query.setParameter("precio", precio);
		query.setParameter("antiguedad", precio);
		
		List<Coche> coches=query.getResultList();
		
		for(Coche c: coches) {
			System.out.println(c);
		}
		session.close();
	}

	public void cochePrecioMedioPorMarca() {
		Session session = sf.openSession();
		
		String hql = "SELECT c.marca,AVG(c.precio) FROM Coche c GROUP BY c.marca";
		
		Query<Object[]> query = session.createQuery(hql,Object[].class);
		List<Object[]> list = query.getResultList();
		for(Object[] registro: list) {
			String marca = String.valueOf(registro[0]);
			String precioMedio = String.valueOf(registro[1]);
			System.out.println("Para la marca: "+marca+" el precio medio es: "+precioMedio);
		}
		session.close();
	}

}
