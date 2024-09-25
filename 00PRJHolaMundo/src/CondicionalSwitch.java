import java.lang.reflect.Array;
import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Introduzca un número e indique por pantalla el mes del año correspondiente a
		 * ese número. Si terminas rápido incluye la estación del año (Primavera,
		 * Verano....)
		 */
		Scanner teclado = new Scanner(System.in);

		String[] meses = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto","Septiembre", "Octubre", "Noviembre", "Diciembre"};

	        
	        System.out.print("Introduce el número del mes (1-12): ");
	        int numeroMes = teclado.nextInt();

	        String mes;
	        switch (numeroMes) {
	            case 1:
	                mes = meses[0];
	                break;
	            case 2:
	                mes = meses[1];
	                break;
	            case 3:
	                mes = meses[2];
	                break;
	            case 4:
	                mes = meses[3];
	                break;
	            case 5:
	                mes = meses[4];
	                break;
	            case 6:
	                mes = meses[5];
	                break;
	            case 7:
	                mes = meses[6];
	                break;
	            case 8:
	                mes = meses[7];
	                break;
	            case 9:
	                mes = meses[8];
	                break;
	            case 10:
	                mes = meses[9];
	                break;
	            case 11:
	                mes = meses[10];
	                break;
	            case 12:
	                mes = meses[11];
	                break;
	            default:
	                mes = "Número de mes no válido. Debe ser entre 1 y 12.";
	        }

	        System.out.println("El mes correspondiente es: " + mes);
	        
		
	        
		//Switch nota de alumno sobresaliente, notable, bien, suficiente o insuficiente
		
		int nota;
		
		System.out.println("Nota: ");
		nota = teclado.nextInt();
		
		switch(nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Insuficiente");
		break;
		case 5:
			System.out.println("Suficiente");
		break;
		case 6:
			System.out.println("Bien");
		break;
		case 7, 8:
			System.out.println("Notable");
		break;
		case 9, 10:
			System.out.println("Sobresaliente");
		break;
		default:
			System.err.println("ERROR");
		break;
		}
		
		
	}

}
