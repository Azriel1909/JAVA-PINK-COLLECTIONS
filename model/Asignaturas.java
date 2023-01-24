package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Asignaturas implements Comparable<Asignaturas> {
	private String nombre;
	private int tiempo;
//	Interface - Polymorphism - change class depending on implementations
	private List<Clase> claseLista = new ArrayList<>();
//									 new LinkedList<>();

	private Collection<Alumno> alumnos = new HashSet<>();
//	private Collection<Alumno> alumnos = new LinkedHashSet<>(); // Order
	
	private Map<String, Alumno> alumnoMap = new HashMap<>();
	
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
	
	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
		this.alumnoMap.put(alumno.getPassword(), alumno);
	}
	
	public boolean existeAlumno (Alumno alumno){
		return this.alumnos.contains(alumno);
	}
	
	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}

	public Map<String, Alumno> getAlumnoMap() {
		return alumnoMap;
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
