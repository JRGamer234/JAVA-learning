package T2.Ejer1;

public class Ejer1 {

	public static void main(String[] args) {
	    /*
	    -- Definir un array de 5 componentes de tipo float que representen las alturas de 5 personas (se piden por teclado).
	    -- Obtener promedio de las mismas.
	    -- Contar cuántas personas son más altas que el promedio y cuántas más bajas.
	    */
	    
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    
	    float[] altura = new float[5];
	    float suma = 0;
	    
	    for(int i = 0; i < 5; i++) {
	        System.out.println("Ingrese la altura de la persona " + (i+1) + ":");
	        altura[i] = scanner.nextFloat();
	        suma += altura[i];
	    }
	    
	    float promedio = suma / 5;
	    
	    int masAltas = 0;
	    int masBajas = 0;
	    
	    for(int i = 0; i < 5; i++) {
	        if(altura[i] > promedio) {
	            masAltas++;
	        } else if(altura[i] < promedio) {
	            masBajas++;
	        }
	    }
	    
	    System.out.println("Promedio de alturas: " + promedio);
	    System.out.println("Personas más altas que el promedio: " + masAltas);
	    System.out.println("Personas más bajas que el promedio: " + masBajas);
	    
	}
}
