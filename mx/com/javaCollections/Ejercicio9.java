package mx.com.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import model.Asignaturas;
 
public class Ejercicio9 {
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
		
		ArrayList<Asignaturas> listaAsignaturas = new ArrayList<>();
		listaAsignaturas.add(asignatura1);
		listaAsignaturas.add(asignatura2);
		listaAsignaturas.add(asignatura3);
		listaAsignaturas.add(asignatura4);
		
		System.out.println(listaAsignaturas);
		
		Collections.sort(listaAsignaturas, Comparator.comparing(Asignaturas::getNombre));
		System.out.println(listaAsignaturas);
		
		int tiempo = 0;
		for(Asignaturas asignatura: listaAsignaturas) {
			tiempo += asignatura.getTiempo();
		}
		System.out.println("El tiempo total: " + tiempo);
		
//		Strings method (only methods)
		System.out.println("El tiempo total: " + listaAsignaturas.stream().mapToInt(Asignaturas::getTiempo).sum());
		System.out.println("El tiempo máximo: " + listaAsignaturas.stream().mapToInt(Asignaturas::getTiempo).max().getAsInt());		
		System.out.println("El tiempo total (sin contar asignatura 4): " + listaAsignaturas.stream().filter(Asignaturas -> !Asignaturas.getNombre().equalsIgnoreCase("Compiladores")).mapToInt(Asignaturas::getTiempo).sum());
		
		
	}
}
