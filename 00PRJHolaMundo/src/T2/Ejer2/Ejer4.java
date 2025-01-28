package T2.Ejer2;

public class Ejer4 {

	public void numAlea() {
		int tamano = (int)(Math.random() * 50) + 1;
        int[] numeros = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            numeros[i] = (int)(Math.random() * 101) + 100;
        }
        
        System.out.println("Array de tamaño " + tamano + ":");
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            System.out.print(numero + " ");
        }
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crea una array de tamaño random(max 50) y
		 // cargalo con número entre
		 // 100 y 200 incluidos.
		 
		 //  Ejemplo: 102,178,126,.......
		Ejer4 n = new Ejer4();
		n.numAlea();
	}

}
