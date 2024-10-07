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

		int num;
		System.out.println("Numero: ");
		num = teclado.nextInt();
		
		for(num; num >= 10;num++) {
			System.out.println(num);
		}
		
		/** BUCLEFOREJER
		 * Programa que solicita por teclado un número
		 * y indica si este es primo o no lo es.
		 * */

		/** BUCLEFOREJER2
		* Solicite dos numeros (inicio y fin) e imprima por
		* pantalla la cantidad de numeros impares entre ellos
		* */

		/** BUCLEFOREJER3
		/**
		 * Dibuja un cuadrado en pantalla solo haciendo uso de: System.out.println("*");
		 * System.out.print("*"); Ejemplo : * * * * * * * * *
		 */

}
}