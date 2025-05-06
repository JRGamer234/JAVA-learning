package Evaluacion1;

import java.util.Scanner;

public class ejer2 {
	private Scanner sc;
	private String[] nombres = new String[5];
	private int[] edades = new int[5];
	
	public void nombredad() {
		sc = new Scanner(System.in);
		System.out.println("Debes introducir los nombres y edades de 5 personas");
		for (int i = 0; i < 5; i++) {
            System.out.print("Nombre de la persona " + (i + 1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Edad de la persona " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }
		
		
	}
	
	public void imprimir() {
		for(int i = 0; i < 5; i++) {
			if (edades[i] >= 18) {
                System.out.println("Nombre: " + nombres[i] + ", Edad: " + edades[i]);
            }
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas. 
 * Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas 
 * mayores de edad (mayores o iguales a 18 años)*/
		ejer2 e = new ejer2();
		e.nombredad();
		e.imprimir();
		
	}

}
