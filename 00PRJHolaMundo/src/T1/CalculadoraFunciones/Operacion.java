package CalculadoraFunciones;
public class Operacion {
    private double numero1;
    private double numero2;
    private int tipoOperacion;
    
    public Operacion(double numero1, double numero2, int tipoOperacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.tipoOperacion = tipoOperacion;
    }
    
    public double getNumero1() {
        return numero1;
    }
    
    public double getNumero2() {
        return numero2;
    }
    
    public int getTipoOperacion() {
        return tipoOperacion;
    }
}