package mx.com.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
	public static void main(String[] args) {
//		variables List
		String var1 = "Fresa";
		String var2 = "Limón";
		String var3 = "Piña";
		String var4 = "Naranja";
		
//		Empty Array List
		ArrayList<String> lista = new ArrayList<>();
//		Adding all the variables in the list
		lista.add(var1);
		lista.add(var2);
		lista.add(var3);
		lista.add(var4);		
		System.out.println(lista);
		
//		COLLECTIONS
//		How to order an Array 
		Collections.sort(lista);
		System.out.println(lista);
		
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println(lista);
		
//		ARRAYLIST
//		How to order an Array 
		lista.sort(Comparator.reverseOrder());
		System.out.println(lista);
		
		lista.sort(Comparator.naturalOrder());
		System.out.println(lista);
		
//		STREAMS
//		How to order an Array
		System.out.println("STREAM");
		List<String> frutaLista = lista.stream().sorted().collect(Collectors.toList());
		System.out.println(frutaLista);

	}
}
