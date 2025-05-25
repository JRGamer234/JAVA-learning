package Evaluacion1;

import java.util.Scanner;

public class examen2A {

	public void ejer1() {
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Que hora es?");
		hora = sc.nextInt();
		
		if(hora >= 7 && hora < 11) {
			System.out.println("Buenos dias");
		}else if(hora >= 12 && hora < 20) {
			System.out.println("Buenas tardes");
		}else {
			System.out.println("Buenas noches");
		}
		
	}
	
	public void ejer2() {
		Scanner sc = new Scanner(System.in);
		int precio = 4, unidades = 0, descpor = 0, prime;
		double preciototal = 0, descuento = 0, preciodes = 0, desprime =  0.05;
		
		System.out.println("Unidades a comprar:");
		unidades = sc.nextInt();
		System.out.println("Eres prime?\n1) SI\n2) NO\n");
		prime = sc.nextInt();
		
		if(unidades <= 1) {
			preciototal = unidades * precio;
			descuento = 0;
		}else if(unidades <= 4) {
			preciototal = (unidades - 1) * precio;
			descuento = 4;
		}else if(unidades <= 6) {
			preciototal = (unidades - 2) * precio;
			descuento = 8;
		}else {
			preciototal = (unidades - 3) * precio;
			descuento = 12;
		}
		
		if(prime == 1) {
			descuento = preciototal * desprime;
		}else {
			preciodes = preciototal;
		}
		
		preciodes = preciototal - descuento;
		
		System.out.println("Importe: "+ preciototal);
		System.out.println("Descuento: " + descuento);
		System.out.println("Total: "+ preciodes);
	}
	
	public boolean esMagico(int suma){
		return suma != 9;
	}
	public void ejer3() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, suma = num1 + num2 + num3;
		System.out.println("Introduce un numero de 3 cifras: (introducir numero por numero)");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if(esMagico(suma)) {
			System.out.println("Sus cifras suman 9 y es múltiplo de 3 por lo que es un número MÁGICO.");
		}else {
			System.out.println("No es mágico.");
		}
	}
	
	public void ejer4() {
		System.out.println("TRIANGULO\n");
		for(int i= 0; i<5;i++) {
			for(int j = 0; j< i; j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
		System.out.println("TRIANGULO 2\n");
		
		int n = 5;

		for (int i = 0; i < n; i++) {         // Filas
            for (int j = 0; j < n; j++) {     // Columnas
                if (i == n - 1 || j == 0 || i == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

		
		
		System.out.println("ROMBO\n");
		
		
	}
	
	public void ejer5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase = sc.nextLine();
		System.out.println("Introduce letra:");
		char letra = sc.next().charAt(0);
		
		int pos = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == letra) {
				pos = i;
			}
		}
		System.out.println(frase.substring(pos+1));
	}
	
	public static void main(String[] args) {
		examen2A e = new examen2A();
		
		e.ejer5();

	}

}
