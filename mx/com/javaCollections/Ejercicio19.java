package mx.com.javaCollections;

import java.util.HashSet;
import java.util.Set;

import model.Alumno;
import model.Asignaturas;

public class Ejercicio19 {
	public static void main(String[] args) {
		// Which collection use
		Asignaturas asignatura1 = new Asignaturas("Base de Datos", 30);

		Alumno alumno1 = new Alumno("Xime Muller", "001");
		Alumno alumno2 = new Alumno("Gerard Schmidt", "002" );
		Alumno alumno3 = new Alumno("Dante Schneider", "003");
		Alumno alumno4 = new Alumno("Lisa Fischer", "004");
		Alumno alumno5 = new Alumno("Allan Weber", "005");
		Alumno alumno6 = new Alumno("Cristin Meyer", "006" );
		Alumno alumno7 = new Alumno("Luan Becker", "007");
		Alumno alumno8 = new Alumno("Carl Hoffmann", "008"); 
		
		Set<Alumno> listaAlumnos = new HashSet<>();

		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		
		asignatura1.addAlumno(alumno1);
		asignatura1.addAlumno(alumno2);
		asignatura1.addAlumno(alumno3);
		asignatura1.addAlumno(alumno4);
		asignatura1.addAlumno(alumno5);
		asignatura1.addAlumno(alumno6);
		asignatura1.addAlumno(alumno7);
		asignatura1.addAlumno(alumno8);
		
//		MAP
		
		Alumno alumnoMap = asignatura1.getAlumnoMap().get("003");
		System.out.println("---------");
		asignatura1.getAlumnoMap().forEach((password, alumno) -> {
			System.out.println(alumno);
		});
		
		System.out.println("---------");
		System.out.println(alumnoMap);
		
	}
}
