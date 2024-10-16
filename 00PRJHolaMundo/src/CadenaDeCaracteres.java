import java.util.Scanner;

public class CadenaDeCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String cadena = "";
		/** CADENAS EJER 1
		* Solicitar al usuario que ingrese una cadena de texto.
		* El programa debe seguir solicitando cadenas al usuario en un bucle indefinido.
		* El bucle debe finalizar cuando el usuario ingrese la palabra "Fin", sin importar si las letras están en mayúsculas o minúsculas.
		* */
		do {
			System.out.println("Introduce una cadena de texto: ");
			cadena = teclado.nextLine();
		}while(!cadena.equalsIgnoreCase("Fin"));
		
		System.out.println("fin");

		/** CADENAS EJER 2 * Igual al anterior, pero que termine la aplicación sin contemplar
		* mayúsculas ni minúsculas. 
		* Es decir que para salir se pueda teclear fin,
		Fin o FIN.
		* */
		

		/** CADENAS EJER 3 Realizar la búsqueda de un string clave en un string fuente. 
		Se deberá ingresar una frase o texto (fuente) y luego la clave a buscar.
		En caso de encontrarla, imprimir la posición, de lo contrario una leyenda. 
		* */

		String fuente = "", clave= "";
		System.out.println("Ingrese el texto fuente: ");
		fuente = teclado.nextLine();
		System.out.println("Ingrese la clave a buscar: ");
		clave = teclado.nextLine();
		
		int index = fuente.indexOf(clave);
		if(index != -1) {
			System.out.println("La posicion es: "+ index);
		}else {
			System.out.println("No se ha encontrado.");
		}

		/** CADENAS EJER 4 * Ingresar una palabra o texto por teclado y determinar si es o no una
		palabra palíndromo. 
		(Palabra que se lee de igual manera de adelante
		hacia atrás, que de atrás hacia delante)
		* */
		System.out.println("Introduce una palabra: ");
		String palabra = teclado.next();
		
		int longitud = palabra.length() - 1;
		
		for (int i = 0; i <= longitud; i++) {
			System.out.println(palabra.charAt(i));
		}
		for(int j = longitud; j >= 0; j--) {
			System.out.println(palabra.charAt(j));
		}
		for(int i = 0, j = longitud; i <= longitud; i++, j--) {
			if(palabra.charAt(i) == palabra.charAt(j)) {
				System.out.println("Iguales "+ palabra.charAt(i) + " y " + palabra.charAt(j));
			}else {
				System.out.println("No iguales "+ palabra.charAt(i) + " y " + palabra.charAt(j));
			}
		}
		/** CADENAS EJER 5
		* Realizar la búsqueda de un string clave en un string fuente.
		* Se deberá ingresar una frase o texto (fuente) y luego la clave a buscar.
		* En caso de encontrarla, imprimir la posición, de lo contrario una leyenda.
		* */
		  	System.out.print("Ingresa una frase: ");
	        String fuente1 = teclado.nextLine();

	        System.out.print("Ingresa la clave: ");
	        String clave1 = teclado.nextLine();
	        int posicion = fuente1.indexOf(clave1);

	        if (posicion != -1) {
	            System.out.println("La clave fue encontrada en la posición: " + posicion);
	        } else {
	            System.out.println("La clave no fue encontrada en el texto");
	        }

		/** CADENAS EJER 6
		* Programa que pide una cadena y sustituye las "a" por "@";
		* */
	        System.out.print("Ingresa una frase: ");
	        String frase = teclado.nextLine();
	        
	        String frasemod = frase.replace('a', '@');
	        
	        System.out.println("La frase es: " + frasemod);

	        /** CADENAS EJER 7
	        * Ejercicio que a partir de una cadena dada, pone en Mayuscula la primera
	        * letra detras de un Punto "." 
	          Ejemplo: En un luga de la mancha. De .....
	        * */
	        
	        String text = teclado.nextLine();
	        String nuevoTexto = "";
	        
	        for(int i = 0; i < text.length(); i++) {
	        	if(text.charAt(i) == 46) {
	        		nuevoTexto += text.charAt(i);
	        		String letra = text.substring(i+2, i+2);
	        		letra.toUpperCase();
	        		
	        		nuevoTexto += text.charAt(i);
	        		nuevoTexto += text.charAt(i+1);
	        		nuevoTexto += letra;
	        	}else {
	        		nuevoTexto += text.charAt(i);
	        	}
	        }

	        /** CADENAS EJER 8
	          Algoritmo que coloca las vocales delante y las consonantes
	        * despues y elimina los espacios en blanco. * */


	        /** CADENAS EJER 9
	        Cargar un String por teclado e implementar las siguientes funciones:     
	        a) Imprimir la primera mitad de los caracteres de la cadena.  
	        b) Imprimir el último carácter.    
	        c) Imprimirlo en forma inversa.    
	        d) Imprimir cada carácter del String separado con un guión.    
	        e) Imprimir la cantidad de vocales almacenadas.
	        * */


	        /** CADENAS EJER 10
	        Codifique un programa que permita cargar una oración por teclado, luego mostrar cada palabra ingresada en una línea distinta.

	        Por ejemplo si cargo:
	            La mañana está fría.
	        Debe aparecer:
	        La
	        mañana
	        está
	        fría.
	        * */
	}

}
