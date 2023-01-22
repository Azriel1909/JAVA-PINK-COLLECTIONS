package mx.com.javaCollections;

import java.util.ArrayList;

public class Ejercicio1 {
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
		
//		Remove elements
		lista.remove(2);
		System.out.println(lista);
		
//		Update the value
		lista.set(2, "Ejercicio Alterado");
		System.out.println(lista);
		
		System.out.println(lista.size());
		
	}
}
