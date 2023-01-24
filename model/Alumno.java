package model;

public class Alumno  {
	private String nombre;
	private String password;
	
	public Alumno(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		Alumno alumno = (Alumno) obj;
		return this.nombre.equals(alumno.getNombre());
	}
	
	@Override
	public int hashCode() {
		return this.nombre.hashCode();
	}
}
