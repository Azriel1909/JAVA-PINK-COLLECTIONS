package mx.com.javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 
public class Ejercicio8 {
	 public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
		private static final long serialVersionUID = 1L;

		{
			add(new LinkedList<Integer>());
			add(new ArrayList<Integer>());
		}
	};
	public static void main(String[] args) {
		
		for(List<Integer> lista : listas) {
			final String implementationName = lista.getClass().getSimpleName();
			// add method
			long inicio = System.currentTimeMillis();
			for(int i = 0; i < 100000; i++) {
				lista.add(i);
			}
			long fin = System.currentTimeMillis();
			long duration = fin - inicio;
			System.out.println(implementationName + " add: " + duration);
			
			// get method
			inicio = System.currentTimeMillis();
			for(int i = 0; i < 100000; i++) {
				lista.get(i);
			}
			fin = System.currentTimeMillis();
			duration = fin - inicio;
			System.out.println(implementationName + " get: " + duration);
			
			// get remove
			inicio = System.currentTimeMillis();
			for(int i = 99999; i >= 0; i--) {
				lista.remove(i);
			}
			fin = System.currentTimeMillis();
			duration = fin - inicio;
			System.out.println(implementationName + " remove: " + duration);
			
//			LinkedList A <-> B <-> C <-> D (relation)
//			ArrayList A -> B -> C -> D
		}
	}
}
