package src;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int precio = 3, cantidad = 0, desc5 = 5, desc10 = 10, cliente;
		float preciot = (cantidad*3), preciop5 = (preciot * desc5)/100,  preciop10 = (preciot * desc10)/100, pret5 = (preciot - preciop5), pret10 = (preciot - preciop10);
		float prime = (preciot * 5)/100, prime5 = (preciot * 10)/100, prime10 = (preciot *15)/100;
		System.out.println("Cuantos botes quieres? ");
		cantidad = sc.nextInt();
		System.out.println("Eres cliente Prime? 1)Sí, 2)No");
		cliente = sc.nextInt();
		
		if(cliente == 1) {
			System.out.println("Numero de botes: "+ cantidad + "." + "          Cliente Prime: Sí");
			if(cantidad < 5){
				System.out.println("Importe de los descuentos: "+ ((cantidad*3)*5)/100 + "€.      El descuento es de 5%.");
				System.out.println("Importe: "+ (cantidad*3) + "€.            Total a pagar: "+ ((cantidad*3)-((cantidad*3)*5)/100) + "€");
			}else if(cantidad > 5 && cantidad < 10) {
				System.out.println("Importe de los descuentos: "+ ((cantidad*3)*10)/100 + "€.      El descuento es de 10%.");
				System.out.println("Importe: "+ (cantidad*3) + "€.            Total a pagar: "+ ((cantidad*3)-((cantidad*3)*10)/100) + "€");
			}else if(cantidad > 10) {
				System.out.println("Importe de los descuentos: "+ ((cantidad*3)*15)/100 + "€.      El descuento es de 15%.");
				System.out.println("Importe: "+ (cantidad*3) + "€.            Total a pagar: "+ ((cantidad*3)-((cantidad*3)*15)/100) + "€");
			}
		}else if(cliente == 2) {
			System.out.println("Numero de botes: "+ cantidad + "." + "          Cliente Prime: Sí");
			if(cantidad < 5){
				System.out.println("Importe de los descuentos: 0€.      El descuento es de 0%.");
				System.out.println("Importe: "+ (cantidad*3) + "€.            Total a pagar: "+ (cantidad*3) + "€");
			}else if(cantidad > 5 && cantidad < 10) {
				System.out.println("Importe de los descuentos: "+ ((cantidad*3)*5)/100 + "€.      El descuento es de 5%.");
				System.out.println("Importe: "+ (cantidad*3) + "€.            Total a pagar: "+ ((cantidad*3)-((cantidad*3)*5)/100) + "€");
			}else if(cantidad > 10) {
				System.out.println("Importe de los descuentos: "+ ((cantidad*3)*10)/100 + "€.      El descuento es de 10%.");
				System.out.println("Importe: "+ (cantidad*3) + "€.            Total a pagar: "+ ((cantidad*3)-((cantidad*3)*10)/100) + "€");
		}
	}

	}}
