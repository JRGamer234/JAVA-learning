import java.util.Scanner;

public class CondicionalSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int num = 1;
		
		if(num == 0) {
			//si
		System.out.println("El numero es igual a 0");
		}else {
			//no
		System.out.println("El numero No es igual a 0");
		}
		*/
		
		int edad;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		teclado.close();
	}

}
