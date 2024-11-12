package Triangulo;

public class TestTriangulo {

	public static void main(String[] args) {
		// Crear un triángulo equilátero
		triangulo triangulo1 = new triangulo(5, 5, 5);
		System.out.println("Triángulo 1 es: " + triangulo1.getTipo());

		// Crear un triángulo isósceles
		triangulo triangulo2 = new triangulo(5, 5, 3);
		System.out.println("Triángulo 2 es: " + triangulo2.getTipo());

		// Crear un triángulo escaleno
		triangulo triangulo3 = new triangulo(3, 4, 5);
		System.out.println("Triángulo 3 es: " + triangulo3.getTipo());

		// Probar valor inválido en constructor
		triangulo triangulo4 = new triangulo(-1, 2, 3);
		System.out.println("Lado 1 del triángulo 4: " + triangulo4.getLado1()); // Debería ser 1 (valor por defecto)

		// Probar cambio de tipo al modificar un lado
		triangulo1.setLado3(3);
		System.out.println("Triángulo 1 después de modificar es: " + triangulo1.getTipo()); // Debería cambiar a
																				// Isósceles

	}

}
