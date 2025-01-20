package Ejer1FUNCIONES;

import java.util.Scanner;

public class LectorDatos {
    private Scanner scanner;
    
    public LectorDatos() {
        scanner = new Scanner(System.in);
    }
    
    public String leerFrase() {
        System.out.print("Ingrese la frase: ");
        return scanner.nextLine();
    }
    
    public int leerOpcion() {
        mostrarMenu();
        while (true) {
            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                if (opcion == 1 || opcion == 2) {
                    return opcion;
                } else {
                    System.out.print("Por favor, ingrese 1 o 2: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Por favor, ingrese un número válido (1 o 2): ");
            }
        }
    }
    
    private void mostrarMenu() {
        System.out.println("\nOpciones disponibles:");
        System.out.println("1. Mostrar mensaje normal");
        System.out.println("2. Mostrar mensaje como error");
        System.out.print("Seleccione una opción (1-2): ");
    }
    
    public void cerrar() {
        scanner.close();
    }
}