package Alumno;

public class Alumno {
	private String nombre;
	private int edad;

	// Constructor
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Método para mostrar información
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Estado: " + (esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
		System.out.println("--------------------");
	}

	// Método para verificar mayoría de edad
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}

	// Método estático para comparar edades
	public static void compararEdades(Alumno alumno1, Alumno alumno2) {
		if (alumno1.getEdad() > alumno2.getEdad()) {
			System.out.println(alumno1.getNombre() + " es mayor que " + alumno2.getNombre());
		} else if (alumno1.getEdad() < alumno2.getEdad()) {
			System.out.println(alumno2.getNombre() + " es mayor que " + alumno1.getNombre());
		} else {
			System.out.println(alumno1.getNombre() + " y " + alumno2.getNombre() + " tienen la misma edad");
		}
	}

}
