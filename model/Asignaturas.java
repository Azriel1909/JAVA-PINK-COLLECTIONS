package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asignaturas implements Comparable<Asignaturas> {
	private String nombre;
	private int tiempo;
//	Interface - Polymorphism - change class depending on implementations
	private List<Clase> claseLista = new ArrayList<>();
//									 new LinkedList<>();
	
	public Asignaturas(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public Asignaturas(String nombre, int tiempo, List<Clase> claseLista) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.claseLista = claseLista;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public List<Clase> getClaseLista() {
//		Unmodifiable Lists
		return Collections.unmodifiableList(claseLista);
	}

	public void setClaseLista(List<Clase> claseLista) {
		this.claseLista = claseLista;
	}
	
//	to add classes
	public void addClase(Clase clase){
		this.claseLista.add(clase);
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Asignaturas o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
}
