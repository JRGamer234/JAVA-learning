package T2;

import java.util.Scanner;

public class ClubClases {
    public static void main(String[] args) {
        // Crear instancia del club
        Club miClub = new Club();
        
        // Imprimir el socio con mayor antigüedad
        miClub.imprimirSocioMasAntiguo();
    }
}

class Socio {
    private String nombre;
    private int antiguedad;
    
    // Constructor
    public Socio(String nombre, int antiguedad) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }
}

class Club {
    private Socio socio1;
    private Socio socio2;
    private Socio socio3;
    private Scanner scanner;
    
    // Constructor
    public Club() {
        scanner = new Scanner(System.in);
        
        // Pedir datos del primer socio
        System.out.println("Ingrese los datos del primer socio:");
        socio1 = crearSocio();
        
        // Pedir datos del segundo socio
        System.out.println("Ingrese los datos del segundo socio:");
        socio2 = crearSocio();
        
        // Pedir datos del tercer socio
        System.out.println("Ingrese los datos del tercer socio:");
        socio3 = crearSocio();
    }
    
    // Método para crear un socio con datos ingresados por el usuario
    private Socio crearSocio() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Antigüedad (años): ");
        int antiguedad = Integer.parseInt(scanner.nextLine());
        
        return new Socio(nombre, antiguedad);
    }
    
    // Método para imprimir el socio con mayor antigüedad
    public void imprimirSocioMasAntiguo() {
        Socio socioMasAntiguo = socio1;
        
        if (socio2.getAntiguedad() > socioMasAntiguo.getAntiguedad()) {
            socioMasAntiguo = socio2;
        }
        
        if (socio3.getAntiguedad() > socioMasAntiguo.getAntiguedad()) {
            socioMasAntiguo = socio3;
        }
        
        System.out.println("El socio con mayor antigüedad es: " + socioMasAntiguo.getNombre() + 
                           " con " + socioMasAntiguo.getAntiguedad() + " años de antigüedad.");
    }
}