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


		/** CADENAS EJER 5
		* Realizar la búsqueda de un string clave en un string fuente.
		* Se deberá ingresar una frase o texto (fuente) y luego la clave a buscar.
		* En caso de encontrarla, imprimir la posición, de lo contrario una leyenda.
		* */


		/** CADENAS EJER 6
		* Programa que pide una cadena y sustituye las "a" por "@";
		* */


		/** CADENAS EJER 7
		* Ejercicio que a partir de una cadena dada, pone en Mayuscula la primera
		* letra detras de un Punto "." 
		  Ejemplo: En un luga de la mancha. De .....
		* */


		/** CADENAS EJER 8

		  Algoritmo que coloca las vocales delante y las consonantes
		* despues y elimina los espacios en blanco. * */
	}

}
