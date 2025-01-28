package T2.Ejer2;
import java.util.Scanner;

public class Ejer3 {

	public void Vectores() {
			Scanner sc = new Scanner(System.in);
	        int[] vector1 = new int[4];
	        int[] vector2 = new int[4];
	        int[] vectorSuma = new int[4];
	        
	        System.out.println("Ingrese los valores para el primer vector:");
	        for (int i = 0; i < vector1.length; i++) {
	            System.out.print("Ingrese el valor " + (i+1) + ": ");
	            vector1[i] = sc.nextInt();
	        }
	        
	        System.out.println("\nIngrese los valores para el segundo vector:");
	        for (int i = 0; i < vector2.length; i++) {
	            System.out.print("Ingrese el valor " + (i+1) + ": ");
	            vector2[i] = sc.nextInt();
	        }
	        
	        for (int i = 0; i < vector1.length; i++) {
	            vectorSuma[i] = vector1[i] + vector2[i];
	        }
	        
	        System.out.println("\nVector suma:");
	        for (int i = 0; i < vectorSuma.length; i++) {
	            System.out.print(vectorSuma[i] + " ");
	        }

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que pida la carga de dos vectores numéricos
		//enteros de 4 elementos. Obtener la suma de los dos vectores,
		//dicho resultado guardarlo en un tercer vector del mismo tamaño.
		//Sumar componente a componente.
		
		Ejer3 a = new Ejer3();
		
		a.Vectores();
		        
		   
		
	}

}
