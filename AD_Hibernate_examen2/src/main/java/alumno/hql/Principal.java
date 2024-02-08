package alumno.hql;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import hibernate.*;


public class Principal {

	public static void main(String[] args) {
		System.out.println("Alumno");

		var hqlEsqueleto = new HqlEsqueleto();
		
		//MAPEO 1-4
//		System.out.println("Proveedores en la base de datos");
//		hqlEsqueleto.imprimirProveedores();
//		System.out.println("Concesionarios en la base de datos");
//		hqlEsqueleto.imprimirConcesionario();
//		System.out.println("Coches en la base de datos");
//		hqlEsqueleto.imprimirCoche();
//		System.out.println("Deportivos en la base de datos");
//		hqlEsqueleto.imprimirDeportivo();
		
		//Persistencia 5-7
		//5
//		Concesionario con = new Concesionario("Prueba",null,null);
//		Coche coche=new Coche("Marca10",10,100000,con,null);
//		hqlEsqueleto.nuevoCoche(coche, 1);
		//6
//		Concesionario concesionario=new Concesionario("Concesionario Z",new HashSet<Coche>(0),null);
//		Coche coche=new Coche("Marca11",11,11111,concesionario,null);
//		Coche coche1=new Coche("Marca11",11,11111,concesionario,null);
//		ArrayList<Coche> coches=new ArrayList<Coche>();
//		coches.add(coche1);
//		coches.add(coche);
//		hqlEsqueleto.nuevoConcesionarioConNuevosCoches(concesionario, coches);
		//7
//		hqlEsqueleto.eliminarConcesionario(9);
		//HQL 8-9
//		System.out.println("Seleccion por antiguedad y precio");
//		hqlEsqueleto.cochePrecioAntiguad(1, 1);
//		System.out.println("Precio promedio por marca");
//		hqlEsqueleto.cochePrecioMedioPorMarca();

	}

}
