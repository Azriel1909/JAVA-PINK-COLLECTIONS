package mx.com.javaCollections;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio12 {
	public static void main(String[] args) {
//		TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
//		variables List
		String alumno1 = "Juan";
		String alumno2 = "Paola";
		String alumno3 = "Ximena";
		String alumno4 = "Gerardo";
		String alumno5 = "Dante";
		String alumno6 = "Martha";
		String alumno7 = "Dante";
		String alumno8 = "Martha";

//									   Equivalent to ArrayList
		Set<String> listaAlumnos = new HashSet<>();
//									   No index position
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		
		System.out.println("---------");
		for (String alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		
//		Lambdas
		System.out.println("---------");
		listaAlumnos.forEach(alumno -> {
			System.out.println(alumno);
		});
		
	}
}
