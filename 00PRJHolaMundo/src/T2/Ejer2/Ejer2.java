package T2.Ejer2;

public class Ejer2 {

	
	
	public void Sueldos() {
		
java.util.Scanner sc = new java.util.Scanner(System.in);
	    
	    float[] sueldosm = new float[4];
	    float[] sueldost = new float[4];
	    float sumam = 0;
	    float sumat = 0;
		
		System.out.println("#####################\n");
	    System.out.println("# Sueldos de mañana #\n");
	    System.out.println("#####################\n");
	    for(int i = 0; i < 4; i++) {
	        System.out.println("Sueldo persona " + (i+1) + ":");
	        sueldosm[i] = sc.nextFloat();
	        sumam += sueldosm[i];
	    }
	    
	    System.out.println("####################\n");
	    System.out.println("# Sueldos de tarde #\n");
	    System.out.println("####################\n");
	    for(int i = 0; i < 4; i++) {
	        System.out.println("Sueldo persona " + (i+1) + ":");
	        sueldost[i] = sc.nextFloat();
	        sumat += sueldost[i];
	    }
	    
	    System.out.println("El total de sueldos de mañanas es: "+ sumam);
	    System.out.println("El total de sueldos de tardes es: "+ sumat);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Una empresa tiene dos turnos (mañana y tarde)
		// en los que trabajan 8 empleados (4 por la mañana
		// y 4 por la tarde)
		// Confeccionar un programa que permita almacenar
		// los sueldos de los empleados agrupados por turno.
		// Imprimir los gastos en sueldos de cada turno.
		
		Sueldos();
	    
	    
	}

}
