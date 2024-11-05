package CalculadoraFunciones;

import java.util.Scanner;

public class LectorDatos {
	private Scanner scanner;

	public LectorDatos() {
		scanner = new Scanner(System.in);
	}

	public double leerNumero(String mensaje) {
		System.out.print(mensaje);
		return scanner.nextDouble();
	}

	public int leerOperacion() {
		mostrarMenu();
		return scanner.nextInt();
	}

	private void mostrarMenu() {
		System.out.println("\nOperaciones disponibles:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.print("Seleccione la operación (1-4): ");
	}

	public void cerrar() {
		scanner.close();
	}
}
