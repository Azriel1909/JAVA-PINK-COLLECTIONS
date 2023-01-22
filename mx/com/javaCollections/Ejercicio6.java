package mx.com.javaCollections;

import java.util.ArrayList;

import model.Asignaturas;
import model.Clase;

public class Ejercicio6 {
	public static void main(String[] args) {
//		variables List
		Asignaturas asignatura1 = new Asignaturas("POO", 30);
		asignatura1.addClase(new Clase("Polimorfismo e Interfaces"));
		asignatura1.addClase(new Clase("Clases y Objetos"));
		asignatura1.addClase(new Clase("Javadoc"));
		
		ArrayList<Asignaturas> listaAsignaturas = new ArrayList<>();
		listaAsignaturas.add(asignatura1);
		
		System.out.println(listaAsignaturas.get(0).getClaseLista());
		
	}
}
