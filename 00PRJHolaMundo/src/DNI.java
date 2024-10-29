import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		/**
		* Programa que recibe por teclado un nif Ej:55555555K
		* y envia un mensaje en caso de que el Nif no sea Correcto
		* resto de la división ->    0    1    2    3    4    5    6    7    8    9    10    11    12    13    14    15    16    17    18    19    20    21    22
		* código de control ->    T    R    W    A    G    M    Y    F    P    D    X    B    N    J    Z    S    Q    V    H    L    C    K    E
		* */
		
		String dni = "";
		String tabla ="TRWAGMYFPDXBNJZSQVHLCKE";

		dni = teclado.next();

		if(dni.length() == 9) {
			numeroCadena = dni.substring(0, 8);
			
			int numeroInt = Integer.parseInt(numeroCadena);
			
			int resto = numeroInt % 23;
		}
		
	}

}
