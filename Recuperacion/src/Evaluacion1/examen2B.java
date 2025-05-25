package Evaluacion1;

import java.util.Scanner;

public class examen2B {
	
	private	Scanner sc = new Scanner(System.in);
	
	public void ejer1() {
		String horos;
		System.out.println("Cuál es tu horocopo?");
		horos = sc.nextLine();
		
		if(horos.equals("aries")) {
			System.out.println("Tu cumpleaños es del 21 de marzo al 19 de Abril.");
		}else if(horos.equals("tauro")) {
			System.out.println("Tu cumpleaños es del 20 de abril al 20 de mayo.");
		}else if(horos.equals("geminis")) {
			System.out.println("Tu cumpleaños es del 21 de mayo al 20 de junio.");
		}
		
	}
	
	
	public boolean esBestial(int num){
		String numero = String.valueOf(num);
		int suma = 0;
		
		for(int i = 0; i < numero.length() ; i++) {
			suma += Integer.parseInt(numero.substring(i, i+1)); //va uno por uno sumando y lo pasa a int
		}
		System.out.print("Sus cifras suman "+ suma +" y ");
		
		return (suma % 6 == 0);
	}
	public void ejer2() {
		int num = 0;
		
		System.out.println("Introduce un numero:");
		num = sc.nextInt();
		
		if(esBestial(num)) {
			System.out.print("es múltiplo de 6 por lo que es un número BESTIAL.");
		}else {
			System.out.print("no es múltiplo de 6 por lo que no es un número BESTIAL.");
		}
		
	}
	
	public void ejer3() {
		for (int i = 1; i <= 5; i++) {
			// Espacios
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("  ");
			}
			// Asteriscos
			for (int j = 1; j <= (i * 2) - 1; j++) {
				if (i == 5) {
					System.out.print("* ");
				}
				else if (j == 1 || j == (i * 2) - 1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	
	public void ejer4() {
		String frase;
		char letra;
		int cont = 0;
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		System.out.println("Introduce una letra: ");
		letra = sc.next().charAt(0);
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == letra) {
				cont = i;
			}
		}
		
		System.out.println(frase.substring(0, cont));
	}
	
	public void ejer5() {
		int maxNum = 36;
		int num1 = (int) (Math.random()*maxNum) , num2 = 0;
		
		System.out.println("Introduce un numero: ");
		num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Has ganado");
		}else {
			System.out.println("Has perdido, el numero era el " + num1);
		}
		
	}
	
	
	public static void main(String[] args) {
		examen2B e = new examen2B();
		
		e.ejer5();

	}

}
