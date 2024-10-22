import java.util.Scanner;

public class Ahorcado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String palabraSecreta;
		System.out.println("Introduce una palabra: ");
		palabraSecreta = teclado.next();
		char[] palabraGuiones = new char[palabraSecreta.length()];
		int intentos = 3;
		
		for (int i = 0; i < palabraGuiones.length; i++) {
			palabraGuiones[i] = '_';
		}
		
		while (intentos > 0) {
		    // Palabra con guiones
		    System.out.println(palabraGuiones);
		    
		    // Pedir letra
		    System.out.println("Introduce una letra:");
		    char letra = teclado.next().charAt(0);
		    
		    // Comprobar la letra si esta
		    boolean acierto = false;
		    for (int i = 0; i < palabraSecreta.length(); i++) {
		        if (palabraSecreta.charAt(i) == letra) {
		            palabraGuiones[i] = letra;
		            acierto = true;
		        }
		    }
		    
		    // Error -1 intento
		    if (!acierto) {
		        intentos--;
		        System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
		    }
		    
		    // Si ha ganado 
		    if (String.valueOf(palabraGuiones).equals(palabraSecreta)) {
		        System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
		        break;
		    }
		}

		// Fin de los intentos
		if (intentos == 0) {
		    System.out.println("Te has quedado sin intentos. La palabra era: " + palabraSecreta);
		}
	}

}
