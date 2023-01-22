package mx.com.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Asignaturas;
 
public class Ejercicio10 {
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
		private static final long serialVersionUID = 1L;

		{
			add(new LinkedList<Integer>());
			add(new ArrayList<Integer>());
		}
	};
	public static void main(String[] args) {
//		variables List
		Asignaturas asignatura1 = new Asignaturas("Base de Datos", 30);
		Asignaturas asignatura2 = new Asignaturas("Ciberseguridad", 65);
		Asignaturas asignatura3 = new Asignaturas("Teoría de Control Digital", 45);
		Asignaturas asignatura4 = new Asignaturas("Compiladores", 70);
		Asignaturas asignatura5 = new Asignaturas("Circuitos lógicos", 60);
		Asignaturas asignatura6 = new Asignaturas("Variable Compleja", 45);
		Asignaturas asignatura7 = new Asignaturas("Aequitectura de Computadoras", 55);
		Asignaturas asignatura8 = new Asignaturas("Modulación DIgital", 50);
		Asignaturas asignatura9 = new Asignaturas("Base de Datos", 34);
		Asignaturas asignatura10 = new Asignaturas("Ciberseguridad", 63);
		Asignaturas asignatura11 = new Asignaturas("Teoría de Control Digital", 41);
		Asignaturas asignatura12 = new Asignaturas("Compiladores", 72);
		
		ArrayList<Asignaturas> listaAsignaturas = new ArrayList<>();
		listaAsignaturas.add(asignatura1);
		listaAsignaturas.add(asignatura2);
		listaAsignaturas.add(asignatura3);
		listaAsignaturas.add(asignatura4);
		listaAsignaturas.add(asignatura5);
		listaAsignaturas.add(asignatura6);
		listaAsignaturas.add(asignatura7);
		listaAsignaturas.add(asignatura8);
		listaAsignaturas.add(asignatura9);
		listaAsignaturas.add(asignatura10);
		listaAsignaturas.add(asignatura11);
		listaAsignaturas.add(asignatura12);
		
		System.out.println(listaAsignaturas);
		
		Collections.sort(listaAsignaturas, Comparator.comparing(Asignaturas::getNombre));
		System.out.println(listaAsignaturas);
		
		
//		Strings method (only methods)
		System.out.println("El tiempo total: " + listaAsignaturas.stream().mapToInt(Asignaturas::getTiempo).sum());
		System.out.println("El tiempo máximo: " + listaAsignaturas.stream().mapToInt(Asignaturas::getTiempo).max().getAsInt());
		System.out.println("El tiempo mínimo: " + listaAsignaturas.stream().mapToInt(Asignaturas::getTiempo).min().getAsInt());
		System.out.println("El tiempo promedio: " + listaAsignaturas.stream().mapToInt(Asignaturas::getTiempo).average().getAsDouble()); // Average 
		System.out.println("El tiempo total (sin contar asignatura 4): " + listaAsignaturas.stream().filter(Asignaturas -> !Asignaturas.getNombre().equalsIgnoreCase("Compiladores")).mapToInt(Asignaturas::getTiempo).sum());
		
//		Group same the signatures
		Map<String, List<Asignaturas>> grupoAsignaturas = listaAsignaturas.stream().collect(Collectors.groupingBy(Asignaturas::getNombre));
		grupoAsignaturas.forEach((key, value) -> System.out.println("Key: " + key + "Value: " + value.size()));
		
//		Parallel Stream - best search - but expensive
		System.out.println("El tiempo total: " + listaAsignaturas.parallelStream().mapToInt(Asignaturas::getTiempo).sum());
	}
}
