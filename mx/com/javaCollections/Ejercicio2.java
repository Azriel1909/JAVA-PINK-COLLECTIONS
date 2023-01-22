package mx.com.javaCollections;

import java.util.ArrayList;

public class Ejercicio2 {
	public static void main(String[] args) {
//		variables List
		String var1 = "Ejercicio 1";
		String var2 = "Ejercicio 2";
		String var3 = "Ejercicio 3";
		String var4 = "Ejercicio 4";
		
//		Empty Array List
		ArrayList<String> lista = new ArrayList<>();
//		Adding all the variables in the list
		lista.add(var1);
		lista.add(var2);
		lista.add(var3);
		lista.add(var4);		
		System.out.println(lista);
		
//		How to read an ArrayList
//		way 1 traditional for
		System.out.println("FOR");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
//		way 2 for Each
		System.out.println("FOR EACH");
		for(String ejercicio : lista ) {
			System.out.println(ejercicio);
		}
		
//		way 2 Lambda
		System.out.println("LAMBDA");
		lista.forEach(ejercicio -> {
			System.out.println(ejercicio);
		});
		
	}
}
