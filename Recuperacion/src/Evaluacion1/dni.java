package Evaluacion1;

import java.util.Scanner;

public class dni {
	private Scanner sc = new Scanner(System.in);
	
	public void comprobadordni() {
		String nif;
		
		System.out.println("Introduce el dni con letra en mayúscula: ");
		nif = sc.nextLine();
		
		if (validarNIF(nif)) {
            System.out.println("El NIF es correcto.");
        } else {
            System.out.println("El NIF no es válido.");
        }
	}
	 public static boolean validarNIF(String nif) {
	        if (nif.length() != 9 || !nif.substring(0, 8).matches("\\d+")) { //\\d+ sirve para confirmar que hay 8 numeros y 1 letra y este ordenado
	            return false;
	        }

	        int numero = Integer.parseInt(nif.substring(0, 8));
	        char letra = nif.charAt(8);
	        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 
	                         'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

	        return letra == letras[numero % 23];
	 }

	public static void main(String[] args) {
		dni d = new dni();
		
		d.comprobadordni();

	}

}
