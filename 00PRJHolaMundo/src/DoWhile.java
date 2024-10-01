import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		/*
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
		
		*/
		
		/**
		 * Realizar un programa que acumule (sume) valores ingresados
		 * por teclado hasta ingresar el 9999 (no sumar dicho valor,
		 * indica que ha finalizado la carga).
		 *  - Imprimir el valor acumulado
		 *  - Informar si dicho valor es cero, mayor a cero o menor a cero.
		 *
		 * **/

		int nume = 0, suma = 0;
		
		do {
			
			System.out.println("Introduce un numero: ");
			nume = teclado.nextInt();
			
			if(nume != 9999) {
				suma += nume;				
			}
			
		}while(nume != 9999);
		
		System.out.println("Has acumulado: " + suma);
		
		if (suma > 0) {
            System.out.println("Es mayor a cero.");
        } else if (suma < 0) {
            System.out.println("Es menor a cero.");
        } else {
            System.out.println("Es igual a cero.");
        }
		
		/*
		* Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El proceso termina cuando ingresamos el valor 0. Se debe informar:
		* a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?
		* b) La cantidad total de piezas procesadas.
		*/
		double peso = 0;
		int PesoMedio = 0;
        int PesoMayor = 0;
        int PesoMenor = 0;
        int total = 0;
		do {
			
			System.out.print("Peso de la pieza: ");
            peso = teclado.nextDouble();

            if (peso != 0) {
                total++;

                if (peso >= 9.8 && peso <= 10.2) {
                    PesoMedio++;
                } else if (peso > 10.2) {
                    PesoMayor++;
                } else {
                    PesoMenor++;
                }
            }
			
		}while(peso != 0);
		
		System.out.println("Cantidad de piezas con peso entre 9.8 Kg y 10.2 Kg: " + PesoMedio);
        System.out.println("Cantidad de piezas con más de 10.2 Kg: " + PesoMayor);
        System.out.println("Cantidad de piezas con menos de 9.8 Kg: " + PesoMenor);
        System.out.println("Cantidad total de piezas procesadas: " + total);
		
	}

}
