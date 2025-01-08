package src;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		Ejercicio5 esMult7y5 = new Ejercicio5();
		
		if((num % 5 == 0)&& (num % 7 == 0)) {
			System.out.println("El número "+ num + " es múltiplo de 5 y 7.");
		}else {
			System.out.println("No es multiplo.");
		}
		
	}
	public boolean esMult7y5(int num) {
		return ((num%5 == 0) && (num%7 == 0));
	}
}
