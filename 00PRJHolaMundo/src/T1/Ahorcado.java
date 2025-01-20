import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		String palabraSecreta = getPalabraSecreta();
		char[] palabrasGuiones = getGuionesFromPalabra(palabraSecreta);
		boolean juegoTerminado = false;
		Scanner teclado = new Scanner(System.in);
		int intentos = 5;

		do {
			boolean algunaLetraAcertada = false;
			System.out.println("Te quedan " + intentos + " intentos");
			System.out.println(palabrasGuiones);
			System.out.println("Introduce una letra:");
			char letra = teclado.next().charAt(0);

			// Recorrer palabra
			for (int i = 0; i < palabraSecreta.length(); i++) {
				if (palabraSecreta.charAt(i) == letra) {
					palabrasGuiones[i] = letra;
					algunaLetraAcertada = true;
				}
			}

			// Fallar letras
			if (!algunaLetraAcertada) {
				System.out.println("No has acertado ninguna letra");
				--intentos;
				if (intentos == 0) {
					System.out.println("¡Has perdido! Se acabaron los intentos.");
					juegoTerminado = true;
				}
			} else {
				// Ver si he ganado
				boolean juegoGanado = !hayGuiones(palabrasGuiones);
				if (juegoGanado) {
					System.out.println("¡Has ganado el juego!");
					juegoTerminado = true;
				}
			}
		} while (!juegoTerminado);

		teclado.close();
		System.out.println(palabrasGuiones);
	}

	// Palabras
	static String getPalabraSecreta() {
		String[] palabras = { "casa", "perro", "coche" };
		Random r = new Random();
		int n = r.nextInt(palabras.length);
		return palabras[n];
	}

	// Guiones en las letras
	static char[] getGuionesFromPalabra(String palabra) {
		int nLetrasPalabrasSecreta = palabra.length();
		char[] palabraGuiones = new char[nLetrasPalabrasSecreta];

		for (int i = 0; i < palabraGuiones.length; i++) {
			palabraGuiones[i] = '_';
		}
		return palabraGuiones;
	}

	// Verificar guiones
	static boolean hayGuiones(char[] array) {
		for (char ch : array) {
			if (ch == '_')
				return true;
		}
		return false;
	}
}
