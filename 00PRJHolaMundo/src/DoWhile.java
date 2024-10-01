import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int opcion = 0, num = 0;
		
		do {
			System.out.println("1 ) Comprobar par");
			System.out.println("2 ) Multiplo de 7");
			System.out.println("3 ) Mayor de 10");
			System.out.println("4 ) Salir");
			
			System.out.println("Introduce una opcion: ");
			opcion = teclado.nextInt();
			
			if(opcion != 4) {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				if((num % 2) == 0) {
					System.out.println("Es par");
				}else {
					System.out.println("Es impar");
				}
				break;
			case 2:
				if((num % 7) == 0) {
					System.out.println("Es multiplo de 7");
				}else {
					System.out.println("No es multiplo de 7");
				}
				break;
			case 3:
				if(num > 10) {
					System.out.println("Es mayor de 10");
				}else {
					System.out.println("Es menor de 10");
				}
				break;
			case 4:
				System.out.println("Has salido");
				break;
			}
			}
		}while(opcion != 4);
		
		
		
		
		
	}

}
