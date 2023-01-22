package mx.com.javaCollections;

import java.util.ArrayList;
import java.util.List;

import model.Asignaturas;
import model.Clase;

public class Ejercicio7 {
	public static void main(String[] args) {
//		variables List
		Asignaturas asignatura1 = new Asignaturas("POO", 30);
		asignatura1.addClase(new Clase("Polimorfismo e Interfaces"));
		asignatura1.addClase(new Clase("Clases y Objetos"));
		asignatura1.addClase(new Clase("Inmutabilidad"));

//		Unmodifiable Lists - Encapsulation
		List<Clase> claseLista1 =  asignatura1.getClaseLista();
		
		ArrayList<Asignaturas> listaAsignaturas = new ArrayList<>();
		listaAsignaturas.add(asignatura1);
		
		System.out.println(claseLista1);
		
	}
}
