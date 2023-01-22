package mx.com.javaCollections;

import java.util.ArrayList;

import model.Asignaturas;


public class Ejercicio4 {
	public static void main(String[] args) {
//		variables List
		Asignaturas asignatura1 = new Asignaturas("Física", 24);
		Asignaturas asignatura2 = new Asignaturas("Álgebra", 20);
		Asignaturas asignatura3 = new Asignaturas("Matemáticas Discretas", 30);
		Asignaturas asignatura4 = new Asignaturas("Autómatas", 60);
		
		ArrayList<Asignaturas> listaAsignaturas = new ArrayList<>();
		listaAsignaturas.add(asignatura1);
		listaAsignaturas.add(asignatura2);
		listaAsignaturas.add(asignatura3);
		listaAsignaturas.add(asignatura4);
		
//		Override the method toString
		System.out.println(listaAsignaturas);
	}
}
