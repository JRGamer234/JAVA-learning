import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		//Pedir numeros
		System.out.println("Introduce el primer numero: ");
		double numero1 = teclado.nextDouble();
		
		System.out.println("Introduce el segundo número:");
	    double numero2 = teclado.nextDouble();
	    
	    //Tipo de operacion
	    System.out.println("Introduce la operación que quieres hacer (+, -, *, /):");
        char operacion = teclado.next().charAt(0);
        
        double resultado;
        
        //Switch para la operacion
        switch (operacion) {
        case '+':
            resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
            break;
        case '-':
            resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
            break;
        case '*':
            resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
            break;
        case '/':
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
            break;
        default:
            System.out.println("Operación no válida. Por favor, elige una operación válida (+, -, *, /).");
            break;
    }
        teclado.close();

	}

}
