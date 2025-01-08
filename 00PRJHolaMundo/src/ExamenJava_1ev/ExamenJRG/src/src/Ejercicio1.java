package src;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		System.out.println("Cuál es tu horóscopo?(Válidas: 1)Aries, 2)Tauro, 3)Geminis) ");
		opcion = sc.nextInt();
		
		if(opcion == 1) {
			System.out.println("21 de marzo al 19 de abril.");
		}else if(opcion == 2) {
			System.out.println("20 de abril al 20 de mayo.");
		}else if(opcion == 3) {
			System.out.println("21 de junio al 22 de julio.");
		}else {
			System.out.println("ERROR, no has puesto bien el horóscopo.");
		}
	}

}
