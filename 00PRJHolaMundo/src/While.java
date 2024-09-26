import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		/*int i = 0;
		
		while(i <= 100) {
			//mierntras se cumpla la condicion ejecuto esto
			if(i % 2 == 0) {
				System.out.println(i + ",");
			}
			
			//incremento
			i++;
			//i = i + 1;
			//i += 1;
		}*/
		
		
		/**
		* Programa que pide por pantalla un número
		* y a continuación escribe la tabla de multiplicar de
		* dicho número.
		* formato: 3 * 1 = 3
		* */

		int numx;
		int i = 0;
		
		System.out.println("Introduce un numero: ");
		numx = teclado.nextInt();
		
		while(i <= 10) {
			System.out.println(numx + "*" + i + "=" + (numx*i));
		i++;
		}
		
		
		
		/*
		* Desarrollar un programa que permita la carga de 10 valores
		* por teclado y nos muestre posteriormente la suma de los
		* valores ingresados y su promedio.
		*/
		
		int suma = 0;
        double promedio;
        int veces = 0;
        
        while(veces <= 9) {
            System.out.println("Introduce un numero " + (veces + 1) + ": ");
            int numero = teclado.nextInt();
            suma += numero;
            veces++;
        }
        
        promedio = (double) suma / 10;
        
        System.out.println("Promedio = " + promedio);
		
		
		
		
		
		
		
	}

}
