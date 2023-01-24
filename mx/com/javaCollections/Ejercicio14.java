package mx.com.javaCollections;

import java.util.HashSet;
import java.util.Set;

import model.Alumno;

public class Ejercicio14 {
	public static void main(String[] args) {
//		TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
//		variables List
		Alumno alumno1 = new Alumno("Xime Muller", "001");
		Alumno alumno2 = new Alumno("Gerard Schmidt", "002" );
		Alumno alumno3 = new Alumno("Dante Schneider", "003");
		Alumno alumno4 = new Alumno("Lisa Fischer", "004");
		Alumno alumno5 = new Alumno("Allan Weber", "005");
		Alumno alumno6 = new Alumno("Cristin Meyer", "006" );
		Alumno alumno7 = new Alumno("Luan Becker", "007");
		Alumno alumno8 = new Alumno("Carl Hoffmann", "008"); 
		
		Set<Alumno> listaAlumnos = new HashSet<>();

		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
	
//		Override methods
		System.out.println("---------");
		System.out.println(listaAlumnos.contains(alumno2));
		Alumno alumnoNuevo = new Alumno("Xime Muller", "001" );
		System.out.println("---------");
		System.out.println(alumno1.equals(alumnoNuevo));
		System.out.println("---------");
		System.out.println(listaAlumnos.contains(alumnoNuevo));
		
	}
}
