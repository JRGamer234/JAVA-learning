import java.util.Scanner;

public class SUMA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("Introduce un número para sumar: ");
		numero1 = teclado.next();
		System.out.println("Introduce otro número para sumar al anterior: ");
		numero2 = teclado.next();
		
		System.out.println("El resultado es: " + numero1 + numero2);
	}

}
