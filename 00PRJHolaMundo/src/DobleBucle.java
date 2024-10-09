import java.util.Scanner;

public class DobleBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		/**
		 * Dibuja un cuadrado Ejemplo : * * * * * * * * * * * * * * * * * * * * * * * *
		 * *
		 **/

		int tama;
		System.out.println("Tamano del cuadrado: ");
		tama = teclado.nextInt();
		for (int a = 0; a < tama; a++) {
			for (int b = 0; b < tama; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		/**
		 * Dibuja un cuadrado vacío Ejemplo : * * * * * * * * * * * * * * * * * *
		 */
		int tamano;
		System.out.println("Tamano del cuadrado: ");
		tamano = teclado.nextInt();
		for (int c = 1; c <= tamano; c++) {
			for (int d = 1; d <= tamano; d++) {
				if (c == 1 || c == tamano || d == 1 || d == tamano) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		/**
		 * Dibuja un medio triangulo que mida la altura que pedimos por teclado Ejemplo
		 * : altura = 5 * * * * * * * * * * * * * * *
		 */

		int alt;
		System.out.println("Altura: ");
		alt = teclado.nextInt();
		for (int i = 1; i <= alt; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		/**
		 * Dibuja un medio triangulo que mida la altura que pedimos por teclado Ejemplo
		 * : altura = 5 * * * * * * * * * * * * * * * * ****************
		 */
		
	}
	
	public static void printRombo() {
		int alt1;
		System.out.println("Altura: ");
		alt1 = teclado.nextInt();
		for (int i = 1; i <= alt1; i++) {
			for (int j = alt1; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i1 = alt1 - 1; i1 >= 1; i1--) {	// parte inferior del rombo igual que arriba solo que cambiando parametros
			for (int j = alt1; j > i1; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * i1 - 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
