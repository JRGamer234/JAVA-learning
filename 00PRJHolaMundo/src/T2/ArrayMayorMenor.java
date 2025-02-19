package T2;

// Pedir el numero de hermanos que tienen 10 alumnos,
// Mostrar el que tiene mas, el que tiene menos y la media.

import java.util.Scanner;

public class ArrayMayorMenor {
    
	public ArrayMayorMenor() {
		
	}
	
	public void funcion() {
		Scanner scanner = new Scanner(System.in);
        int[] hermanos = new int[10];
        
        for (int i = 0; i < hermanos.length; i++) {
            System.out.print("Introduce el número de hermanos del alumno " + (i + 1) + ": ");
            hermanos[i] = scanner.nextInt();
        }
        
        int mayor = hermanos[0];
        int menor = hermanos[0];
        double suma = hermanos[0];
        
        for (int i = 1; i < hermanos.length; i++) {
            if (hermanos[i] > mayor) {
                mayor = hermanos[i];
            }
            if (hermanos[i] < menor) {
                menor = hermanos[i];
            }
            suma += hermanos[i];
        }
        
        double media = suma / hermanos.length;
        
        System.out.println("El alumno con mas hermanos tiene: " + mayor + " hermanos");
        System.out.println("El alumno con menos hermanos tiene: " + menor + " hermanos");
        System.out.println("La media de hermanos es: " + media);
	}
	
	
    public static void main(String[] args) {
        
        
    }
}