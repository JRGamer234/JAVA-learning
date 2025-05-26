package Evaluacion2;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class ejerc1 {
	private Scanner sc = new Scanner(System.in);
	
	public void ejer1() {
		float[] vector = new float[5];
		float suma = 0;
		int mayor = 0, menor = 0;
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Introduce " + (i+1) + ": ");
			vector[i] = sc.nextFloat();
			suma += vector[i];
		}
		float promedio = suma/5;
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] > promedio) {
				mayor++;
			}else {
				menor++;
			}
		}
		System.out.println("El promedio es " + promedio);
		System.out.println("Por encima del promedio hay " + mayor);
		System.out.println("Por debajo del promedio hay " + menor);
	}
	
	public void ejer2() {
		int[] am = new int[4];
		int[] pm = new int[4];
		
		for(int i = 0; i < am.length; i++) {
			System.out.println("Introduce sueldo " + (i+1) + " de mañana: ");
			am[i] = sc.nextInt();
		}
		for(int i = 0; i < pm.length; i++) {
			System.out.println("Introduce sueldo " + (i+1) + " de tarde: ");
			pm[i] = sc.nextInt();
		}
		for(int i = 0; i < 4; i++) {
			System.out.println("Sueldo " + (i+1) + " de mañana es: " + am[i]);
			System.out.println("Sueldo " + (i+1) + " de tarde es: " + pm[i]);
		}
	}
	
	public void ejer3() {
		int[] v1 = new int[4];
		int[] v2 = new int[4];
		int[] v3 = new int[4];
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Introduce para el v1: ");
			v1[i] = sc.nextInt();
			System.out.println("Introduce para el v2: ");
			v2[i] = sc.nextInt();
			
			v3[i] = v1[i] + v2[i];
		}
		for(int i = 0; i < 4; i++) {
			System.out.print(v3[i] + " | ");
		}
	}
	
	public void ejer4() {
		int tam = (int) (Math.random()*50)+1;
		int[] arr = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			arr[i] = (int) (Math.random()*101)+100;
		}
		System.out.println("El tamaño es de " + tam);
		for(int i = 0; i < tam; i++) {
			System.out.print(arr[i] + " | ");
		}
		
	}
	
	public void ejer5() {
		System.out.println("Ordenar paises"); //import java.util.Arrays;
											  //import java.util.Comparator;
		String[] paises = new String[5];	  // Para enteros hay que poner INTEGER
		for(int i = 0; i < paises.length; i++) {
			System.out.println("Pais "+ (i+1) + ": ");
			paises[i] = sc.next();
		}
		// A --> Z
		Arrays.sort(paises);						
		System.out.println(Arrays.toString(paises));
		
		// Z --> A
		Arrays.sort(paises, Comparator.reverseOrder());
		System.out.println(Arrays.toString(paises));
	}
	
	public static void main(String[] args) {
		ejerc1 e = new ejerc1();
		
		e.ejer5();

	}

}
