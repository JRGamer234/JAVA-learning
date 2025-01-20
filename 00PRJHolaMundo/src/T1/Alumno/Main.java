package Alumno;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Registro del primer alumno
		System.out.println("Registro del primer alumno");
		System.out.print("Ingrese el nombre: ");
		String nombre1 = scanner.nextLine();
		System.out.print("Ingrese la edad: ");
		int edad1 = scanner.nextInt();
		scanner.nextLine(); // Limpiar el buffer

		// Crear primer alumno
		Alumno alumno1 = new Alumno(nombre1, edad1);

		// Registro del segundo alumno
		System.out.println("\nRegistro del segundo alumno");
		System.out.print("Ingrese el nombre: ");
		String nombre2 = scanner.nextLine();
		System.out.print("Ingrese la edad: ");
		int edad2 = scanner.nextInt();

		// Crear segundo alumno
		Alumno alumno2 = new Alumno(nombre2, edad2);

		// Mostrar información de ambos alumnos
		System.out.println("\nInformación de los alumnos:");
		System.out.println("Primer alumno:");
		alumno1.mostrarInformacion();
		System.out.println("Segundo alumno:");
		alumno2.mostrarInformacion();

		// Comparar edades
		System.out.println("\nComparación de edades:");
		Alumno.compararEdades(alumno1, alumno2);

		scanner.close();
	}

}
