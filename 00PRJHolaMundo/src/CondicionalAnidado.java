import java.util.Scanner;

public class CondicionalAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Confeccionar un programa que permita cargar un número entero positivo de
		 * hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
		 * Mostrar un mensaje de error si el número de cifras es mayor.
		 **/

		Scanner teclado = new Scanner(System.in);

		/*
		 * int numero;
		 * 
		 * System.out.println("Introduce un numero: "); numero = teclado.nextInt();
		 * 
		 * if (numero < 10) { System.out.println("Tiene 1 cifra"); }else { if(numero <
		 * 100) { System.out.println("Tiene 2 cifras"); }else if(numero < 1000) {
		 * System.out.println("Tiene 3 cifras"); }else { System.err.println("ERROR"); }
		 * }
		 */

		/**
		 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
		 * siguiente información: cantidad total de preguntas que se le realizaron y la
		 * cantidad de preguntas que contestó correctamente. Se pide confeccionar un
		 * programa que ingrese los dos datos por teclado e informe el nivel del mismo
		 * según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
		 * Nivel máximo: Porcentaje>=90%. Nivel medio: Porcentaje>=75% y <90%. Nivel
		 * regular: Porcentaje>=50% y <75%. Fuera de nivel: Porcentaje<50%.
		 **/

		int npreguntas;
		int correctas;
		double media;

		System.out.println("Introduce el total de preguntas: ");
		npreguntas = teclado.nextInt();
		System.out.println("Introduce el total de preguntas correctas: ");
		correctas = teclado.nextInt();

		media = (correctas * 100) / npreguntas;

		if (media > 50) {
			if (media >= 90) {
				System.out.println("Nivel maximo");
			} else if (media >= 75 && media < 90) {
				System.out.println("Nivel medio");
			} else if (media >= 50 && media < 75) {
				System.out.println("Nivel regular");
			}
		} else {
			System.out.println("Fuera de nivel ");
		}
		System.out.println("Nota: " + media + "%");

	}

}
