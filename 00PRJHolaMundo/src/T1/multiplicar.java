import java.util.Scanner;

public class multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		
		
		/** BUCLEFOR
		* Programa que pide por pantalla un número
		* y a continuación escribe la tabla de multiplicar de
		* dicho número.
		* formato: 3 * 1 = 3
		* */

		int num, i;
		System.out.println("Numero: ");
		num = teclado.nextInt();
		
		for (i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
		
		/** BUCLEFOREJER
		 * Programa que solicita por teclado un número
		 * y indica si este es primo o no lo es.
		 * */
		
		int num1;
		System.out.println("Numero(primo): ");
		num1 = teclado.nextInt();
		
		boolean esPrimo = true;
		
		for(int x = 2; x < num1; x++) {
			if(num1 <= 1) {
			esPrimo = false;
			break;
			}
		}
			
		
		
		
		/** BUCLEFOREJER2
		* Solicite dos numeros (inicio y fin) e imprima por
		* pantalla la cantidad de numeros impares entre ellos
		* */
		int numi1, numi2, contador = 0;
		System.out.println("Numero Inicio: ");
		numi1 = teclado.nextInt();
		System.out.println("Numero Fin: ");
		numi2 = teclado.nextInt();
		
		numi1++;
		for(int j = numi1; j < numi2; j++) {
            if (j % 2 != 0) {
                contador++;
            }
        }
		System.out.println(contador);

		
		/** BUCLEFOREJER3
		/**
		 * Dibuja un cuadrado en pantalla solo haciendo uso de: System.out.println("*");
		 * System.out.print("*"); Ejemplo : * * * * * * * * *
		 */
		int tama;
		System.out.println("Tamano del cuadrado: ");
		tama = teclado.nextInt();
		 for(int a = 0; a < tama; a++) {
	            for(int b = 0; b < tama; b++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		
		 
		 
}
}