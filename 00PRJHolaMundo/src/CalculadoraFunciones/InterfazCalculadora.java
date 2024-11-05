package CalculadoraFunciones;
public class InterfazCalculadora {
    private Calculadoraa calculadoraa;
    private LectorDatos lector;
    
    public InterfazCalculadora() {
        calculadoraa = new Calculadoraa();
        lector = new LectorDatos();
    }
    
    public void iniciar() {
        System.out.println("=== CALCULADORA ===");
        
        // Leer datos
        double num1 = lector.leerNumero("Ingrese el primer número: ");
        double num2 = lector.leerNumero("Ingrese el segundo número: ");
        int operacion = lector.leerOperacion();
        
        // Crear objeto operación
        Operacion op = new Operacion(num1, num2, operacion);
        
        // Realizar cálculo y mostrar resultado
        realizarCalculo(op);
        
        // Cerrar scanner
        lector.cerrar();
    }
    
    private void realizarCalculo(Operacion op) {
        try {
            double resultado = 0;
            String operador = "";
            
            switch (op.getTipoOperacion()) {
                case 1:
                    resultado = calculadoraa.suma(op.getNumero1(), op.getNumero2());
                    operador = "+";
                    break;
                case 2:
                    resultado = calculadoraa.resta(op.getNumero1(), op.getNumero2());
                    operador = "-";
                    break;
                case 3:
                    resultado = calculadoraa.multiplicacion(op.getNumero1(), op.getNumero2());
                    operador = "*";
                    break;
                case 4:
                    resultado = calculadoraa.division(op.getNumero1(), op.getNumero2());
                    operador = "/";
                    break;
                default:
                    System.out.println("\nOperación no válida");
                    return;
            }
            
            System.out.printf("\nOperación: %.2f %s %.2f = %.2f\n", 
                op.getNumero1(), operador, op.getNumero2(), resultado);
                
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}