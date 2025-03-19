package T2;

import java.util.Scanner;

public class ClubClases {
    public static void main(String[] args) {
        Club miClub = new Club();
        
        miClub.imprimirSocioMasAntiguo();
    }
}

class Socio {
    private String nombre;
    private int antiguedad;
    
    public Socio(String nombre, int antiguedad) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }
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
    
    public Club() {
        scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los datos del primer socio:");
        socio1 = crearSocio();
        System.out.println("Ingrese los datos del segundo socio:");
        socio2 = crearSocio();
        System.out.println("Ingrese los datos del tercer socio:");
        socio3 = crearSocio();
    }
    private Socio crearSocio() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Antigüedad (años): ");
        int antiguedad = Integer.parseInt(scanner.nextLine());
        
        return new Socio(nombre, antiguedad);
    }

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