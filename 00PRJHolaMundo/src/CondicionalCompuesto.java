import java.util.Scanner;

public class CondicionalCompuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		/*
		int num = 0;
		
		System.out.println("Introduce tu numero: ");
		num = teclado.nextInt();

		// Tenemos que poner si el numero es menor a 10 y par o mayor a 10 e impar
		if(num % 2 == 0 && num < 10) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		*/
		
		/*Se ingresan tres notas de un alumno, si el promedio es mayor o igual 
		 * a cinco y igual a 10 mostrar un mensaje "Aprobado con matricula"
		 * Si no, si es solo mayor de 5 mostrar "Aprobado" y si no "Suspenso"
		**/
		
		int nota1;
		int nota2;
		int nota3;
		double media;
		
		System.out.println("Introduce tu nota-1: ");
		nota1 = teclado.nextInt();
		System.out.println("Introduce tu nota-2: ");
		nota2 = teclado.nextInt();
		System.out.println("Introduce tu nota-3: ");
		nota3 = teclado.nextInt();
		
		media = ((nota1 + nota2 + nota3) / 3);
		
		if(media >= 5 && media == 10) {
			System.out.println("Aprobado con matricula");
		}else if(media > 5) {
			System.out.println("Aprobado");
		}else {
			System.err.println("Suspenso");
		}
	}

}
