package Examen1;

import java.util.Scanner;

public class ExamenPractica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1

		Scanner sc = new Scanner(System.in);
		/*
		 * int hora = 0;
		 * 
		 * System.out.println("Introduce la hora: (horas desde 1 hasta las 24)"); hora =
		 * sc.nextInt();
		 * 
		 * if(hora >= 7 && hora <=11) { System.out.println("Buenos días"); }else if(hora
		 * >=12 && hora <= 19) { System.out.println("Buenas tardes"); }else if((hora >=
		 * 20 && hora <= 24) || (hora >= 1 && hora <= 6)) {
		 * System.out.println("Buenas noches"); }
		 * 
		 */

		// 2

		/*
		 * int cantidad, disco = 100, des;
		 * 
		 * System.out.println("Cuantos discos quieres? "); cantidad = sc.nextInt(); int
		 * precio = cantidad * disco; float desc5 = (precio*5)/100; float desc10 =
		 * (precio*10)/100; if(cantidad > 5 && cantidad < 10) {
		 * System.out.println("Precio con 5% de descuento: "+ (precio - desc5)); des =
		 * 5; }else if( cantidad > 10){
		 * System.out.println("Precio con 10% de descuento: "+ (precio - desc10)); des =
		 * 10; }else { System.out.println("Precio: "+ precio); des = 0; }
		 * 
		 * System.out.println("Numero de discos: "+ cantidad);
		 * System.out.println("		"); System.out.println("Descuento: "+ des +"%");
		 * System.out.println("		"); System.out.println("Importe: "+ precio);
		 */

		// 3

		/*
		 * int num;
		 * 
		 * System.out.println("Introduce un número: "); num = sc.nextInt();
		 * 
		 * Ejer3 Pares = new Ejer3();
		 * 
		 * 
		 * if(Pares.esPar(num)) { System.out.println("El número "+ num + " es par.");
		 * }else { System.out.println("El número "+ num + " es impar."); }
		 */

		// 4
		
		/*
		int alt = 10;
		// Cuadrado
		for (int i = 0; i < alt; i++) {
			for (int j = 0; j < alt; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Rombo

		for (int i = 1; i <= alt; i++) {
			for (int j = 0; j < alt - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < (i * 2) - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= alt - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < ((alt - i) * 2) - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Abeto
		
		for (int i = 1; i <= alt; i++) {
			for (int j = 0; j < alt - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < alt - 2 ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Triangulo
		 
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		// Triangulo invertido vacio
		
		for (int i = 1; i < 6; i++) {
			for (int j = 5 - i; j > 0 ; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				if (i == 4 && (j == 1 || j == 2)) {
					System.out.print("  ");
				}
				else if (i == 3 && j == 1) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
		// Reloj de arena
		 
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= ((7 - i) * 2) - 2; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i <= 6; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (i * 2) - 2; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		 
		*/
		
		// 5
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		frase = frase.replace(" ", "@");
		
		String reves = "";
		
		for(int i = frase.length()-1; i >= 0; i--) {
			System.out.println(frase.charAt(i));
			reves += frase.charAt(i);
		}
		
		System.out.println(reves);
	}

}
