package Evaluacion1;

import java.util.Scanner;

public class examen {

	public void ejer1() {
		Scanner sc = new Scanner(System.in);
		
		String epoca;
		System.out.println("Cual es la época del año? (introducir en minusculas)");
		epoca = sc.next();
		
		if(epoca.equals("primavera")) {
			System.out.println("La primavera inicia el 21 de Marzo hasta el 20 de Junio.");
		}else if(epoca.equals("verano")) {
			System.out.println("El verano inicia el 21 de Junio hasta el 22 de Septiembre.");
		}else if(epoca.equals("otoño")) {
			System.out.println("El otoño inicia el 23 de Septiembre hasta el 21 de Diciembre.");
		}else if(epoca.equals("invierno")) {
			System.out.println("El invierno inicia el 22 de Diciembre hasta el 20 de Marzo.");
		}
	}
	
	public void ejer2() {
		Scanner sc = new Scanner(System.in);
		
		float precio,preciototal = 0, preciodesc = 0, impdesc = 0 , totalpagar, unidades = 0, descuento = 0;
		
		System.out.println("Introduce las unidades: ");
		unidades = sc.nextInt();
		System.out.println("Introduce el precio: ");
		precio = sc.nextFloat();
		if(unidades < 5) {
			descuento = 0;
		}else if(unidades >= 5 && unidades < 10) {
			descuento = 5;
		}else if(unidades >= 10) {
			descuento = 10;
		}
		preciototal = unidades * precio;
		impdesc = (preciototal * (descuento/100));
		preciodesc = preciototal - impdesc;
		
		System.out.println("Numero discos: " + unidades + " ||  Precio unidad: " + precio + "\n");
		System.out.println("Descuento: " + descuento + "%  || Importe descuento: " + impdesc + "\n");
		System.out.println("Importe: " + preciototal + "  ||  Total a pagar: " + preciodesc + "");		
	}
	
	public boolean esPar(int num){
		return num % 2 == 0;
	}
	public void ejer3() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		if(esPar(num)) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
	}
	
	public void ejer4() {
		System.out.println("CUADRADO \n");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\nROMBO \n");
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j < 5 ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 5-1; i >= 1; i--) {
			for(int j = 5; j > i ; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (2* i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        
		System.out.println("\nABETO \n");
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j < 5 ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5-3; i++) {
			for(int j = 0; j < 2+1; j++) {
				System.out.print(" ");
			}
			System.out.println("***");
		}
	}
	
	public void ejer5() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String texto = sc.nextLine();

        System.out.print("Salida: ");
        for (int i = texto.length() - 1; i >= 0; i--) {
            char c = texto.charAt(i);
            if (c == ' ') {
                System.out.print('@');
            } else {
                System.out.print(c);
            }
        }
    }
	
	
	
	
	
	
	
	public static void main(String[] args) {
		examen e = new examen();
		
		e.ejer5();
		

	}

}
