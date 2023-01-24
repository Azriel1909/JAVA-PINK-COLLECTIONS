package mx.com.javaCollections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio13 {
	public static void main(String[] args) {
//		TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
//		variables List
		String alumno1 = "Juan Escamilla";
		String alumno2 = "Paola Rosal";
		String alumno3 = "Ximena Toledano";
		String alumno4 = "Gerardo Sanchez";
		String alumno5 = "Dante Muller";
		String alumno6 = "Martha Carrasco";
		String alumno7 = "Dante Muller";
		String alumno8 = "Martha Carrasco";

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
	
		
//		Lambdas
		System.out.println("---------");
		listaAlumnos.forEach(alumno -> {
			System.out.println(alumno);
		});
		
		System.out.println("---------");
		boolean existe = listaAlumnos.contains("Ximena");
		System.out.println(existe);
		
		System.out.println("---------");
		String valorMax = listaAlumnos.stream().max(Comparator.comparing(String::length)).get();
		System.out.println("El valor: " + valorMax + ", tiene " +valorMax.length() + " caracteres.");
		
		listaAlumnos.removeIf(alumno -> "Martha Carrasco".equalsIgnoreCase(alumno));
		System.out.println("---------");
		listaAlumnos.forEach(alumno -> {
			System.out.println(alumno);
		});
		
	}
}
