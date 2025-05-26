package Evaluacion2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class arraysparalelos {
	private Scanner sc = new Scanner(System.in);
	
	public void ejer1() {
		String[] paises = new String[5];
		int[] poblacion = new int[5];
		Integer[] indice = {0, 1, 2, 3, 4};
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Introduce pais " + (i+1) + ": ");
			paises[i] = sc.next();
			System.out.println("Introduce poblacion " + (i+1) + ": ");
			poblacion[i] = sc.nextInt();
		}
		
		//Ordenar según paises
		Arrays.sort(indice, Comparator.comparing(i -> paises[i]));
		
		for(int i = 0; i < indice.length; i++) {
			System.out.println("pais: "+ paises[i] + " --> Poblacion: " + poblacion[i]);
		}
	}

	public static void main(String[] args) {
		arraysparalelos a = new arraysparalelos();
		
		a.ejer1();
		
	}

}
