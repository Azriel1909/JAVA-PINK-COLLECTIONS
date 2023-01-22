package mx.com.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Asignaturas;

public class Ejercicio5 {
	public static void main(String[] args) {
//		variables List
		Asignaturas asignatura1 = new Asignaturas("POO", 30);
		Asignaturas asignatura2 = new Asignaturas("Desarrollo de Software", 20);
		Asignaturas asignatura3 = new Asignaturas("Metodología", 35);
		Asignaturas asignatura4 = new Asignaturas("Redes", 60);
		
		ArrayList<Asignaturas> listaAsignaturas = new ArrayList<>();
		listaAsignaturas.add(asignatura1);
		listaAsignaturas.add(asignatura2);
		listaAsignaturas.add(asignatura3);
		listaAsignaturas.add(asignatura4);
		
//		Override the method toString
		System.out.println(listaAsignaturas);
		
//		Collections
		System.out.println("COLLECTIONS");
		Collections.sort(listaAsignaturas);
		System.out.println(listaAsignaturas);
		
		System.out.println("REVERSE");
		Collections.sort(listaAsignaturas, Collections.reverseOrder());
		System.out.println(listaAsignaturas);
		
//		If you do not want to use collections
		System.out.println("METHOD 1");
		listaAsignaturas.sort(Comparator.comparing(Asignaturas::getNombre));
		System.out.println(listaAsignaturas);
		
		System.out.println("METHOD 2");
		Collections.sort(listaAsignaturas, Comparator.comparing(Asignaturas::getNombre));
		Collections.sort(listaAsignaturas, Comparator.comparing(Asignaturas::getNombre).reversed());	
		
//		Stream		
		System.out.println("STREAM");
		List<Asignaturas> listaAsignaturas2 = listaAsignaturas.stream().sorted(Comparator.comparing(Asignaturas::getTiempo)).collect(Collectors.toList());
		System.out.println(listaAsignaturas2);
		
//		Lambdas
		System.out.println("LAMBDAS");
		List<Asignaturas> listaAsignaturas3 = listaAsignaturas.stream().filter(Asignaturas -> !Asignaturas.getNombre().equalsIgnoreCase("Metodología")).sorted(Comparator.comparing(Asignaturas::getTiempo)).collect(Collectors.toList());
		System.out.println(listaAsignaturas3);
		
	}
}
