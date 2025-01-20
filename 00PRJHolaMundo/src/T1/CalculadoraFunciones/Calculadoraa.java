package CalculadoraFunciones;
public class Calculadoraa {
    // Método para suma
    public double suma(double num1, double num2) {
        return num1 + num2;
    }
    
    // Método para resta
    public double resta(double num1, double num2) {
        return num1 - num2;
    }
    
    // Método para multiplicación
    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    
    // Método para división
    public double division(double num1, double num2) throws ArithmeticException {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}