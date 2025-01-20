package ExamenPractica1;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		/*1. Crea un programa que pida la época del año y diga de qué fecha a qué fecha es. (1 punto)

					Primavera 21 de Marzo
					Verano 21 de Junio
					Otoño 23 de Septiembre
					Invierno 22 de Diciembre
			Ejemplo entrada: ¿Cuál es la época? --&gt; Primavera.
			Ejemplo salida: La primavera inicia el 21 de Marzo hasta el 20 de Junio.
		*/
		Scanner sc = new Scanner(System.in);
		
		int dia, mes;
		System.out.println("Qué día es hoy?");
		dia = sc.nextInt();
		System.out.println("En qué mes estamos? (1-12)");
		mes = sc.nextInt();
		
		if ((mes > 3 && dia < 21) && (mes < 6 && dia < 22)) {
			System.out.println("La primavera inicia el 21 de Marzo hasta el 20 de Junio.");
		}else if((mes > 6 && dia < 21) && (mes < 9 && dia < 23)) {
			System.out.println("El verano inicia el 21 de Junio hasta el 22 de Septiembre.");
		}else if((mes > 9 && dia < 23)&&(mes < 12 && dia < 22)) {
			System.out.println("El otoño inicia el 23 de Septiembre hasta el 21 de Diciembre.");
		}else {
			System.out.println("El invierno inicia el 22 de Diciembre hasta el 20 de Marzo.");
		}
		
		/*2. Amazon pone de oferta unos botes de colores para pintar al óleo, la
			oferta consiste en que nos hace un 3x2, 5x3 y 7x10: Como aliciente si
			eres de Amazon Prime te descuenta un 5% adicional. El precio por
			bote es de 4€. (1 punto)
				Descuentos 
					a. De 0 a 2 botes no hay oferta.
					b. De 3 a 4 botes te regalan 1.
					c. De 5 a 6 botes te regalan 2.
					d. De 7 en adelante te regalan 3.
				Ejemplo entrada: Número de botes: 12 Cliente Prime: Sí
				Ejemplo salida:

						Te regalan 3 botes y un 5% de descuento
						Importe: 36€
						Descuento: 1.8€
						Total a Pagar: 34.2€
		*/
		
		
		 Scanner s = new Scanner(System.in);

	        int botes = 0;
	        boolean prime = false;
	        int sprime = 0;
	        int precio = 4;
	        
	       
	        
	        System.out.println("Cuantos botes deseas comprar?");
	        System.out.print("--> ");
	        botes = s.nextInt();
	        
	 
	        
	        while(sprime != 1 || sprime != 2) {
	        	
	        System.out.println("Cliente PRIME?");
	        System.out.println("1. SI");
	        System.out.println("2. NO");
	        sprime = s.nextInt();

	        
	        if (sprime == 1) {
	            prime = true;
	            break;
	        } else if (sprime == 2) {
	            prime = false;
	            break;
	        } else {
	            System.out.println("Opción inválida. Debes elegir 1 o 2.");
	        }
	      }
	        
	        
	       


	        if (prime) {
	            if (botes > 6) {
	            	
	                System.out.println("El precio total es: " + (precio * botes));
	                float nuevoprecio = precio * botes;
	                System.out.println("Botes totales añadiendo regalo por cortesía de Amazon: " + (botes + 3));
	                System.out.println("Descuento: " + (nuevoprecio * 0.05));
	                System.out.println("Aplicando descuento del prime: " + (nuevoprecio - (nuevoprecio * 0.05)));
	                
	            } else if (botes == 1 || botes == 2) {
	            	
	            	System.out.println("El precio total es: " + (precio * botes));
	                float nuevoprecio = precio * botes;
	                System.out.println("Botes totales: " + botes);
	                System.out.println("Descuento: " + (nuevoprecio * 0.05));
	                System.out.println("Aplicando descuento del prime: " + (nuevoprecio - (nuevoprecio * 0.05)));
	                
	            } else if (botes > 2 && botes < 5) {
	            	
	            	System.out.println("El precio total es: " + (precio * botes));
	                float nuevoprecio = precio * botes;
	                System.out.println("Botes totales añadiendo regalo por cortesía de Amazon: " + (botes + 1));
	                System.out.println("Descuento: " + (nuevoprecio * 0.05));
	                System.out.println("Aplicando descuento del prime: " + (nuevoprecio - (nuevoprecio * 0.05)));
	                
	            } else if (botes >= 5 && botes <= 6) {
	            	
	            	System.out.println("El precio total es: " + (precio * botes));
	                float nuevoprecio = precio * botes;
	                System.out.println("Botes totales añadiendo regalo por cortesía de Amazon: " + (botes + 2));
	                System.out.println("Descuento: " + (nuevoprecio * 0.05));
	                System.out.println("Aplicando descuento del prime: " + (nuevoprecio - (nuevoprecio * 0.05)));
	            }
	        } else {
	            if (botes > 6) {
	                System.out.println("El precio total es: " + precio * botes);
	                System.out.println("Botes totales añadiendo regalo por cortesía de Amazon: " + (botes + 3));
	            } else if (botes == 1 || botes == 2) {
	                System.out.println("El precio total es: " + precio * botes);
	            } else if (botes > 2 && botes < 5) {
	                System.out.println("El precio total es: " + precio * botes);
	                System.out.println("El precio total es: " + precio * botes);
	                System.out.println("Botes totales añadiendo regalo por cortesía de Amazon: " + (botes + 1));
	            } else if (botes >= 5 && botes <= 6) {
	                
	                System.out.println("El precio total es: " + precio * botes);
	                System.out.println("Botes totales añadiendo regalo por cortesía de Amazon: " + (botes + 2));
	            }
	        }

		
		
		
		
		
		
		
		
		
		
		

	}

}
