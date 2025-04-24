
import java.util.Arrays;
import java.util.Comparator;

public class ejer1 {

	public void cargarValores() {
		int[] array = new int[7];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*20)+1;
		}
		System.out.print("Array desordenado = | ");
		for(int i=0; i<7;i++) {
			System.out.print(array[i]+" | ");
		}
		int aux = 0;
		aux = array[1];
		array[1] = array[5];
		array[5] = aux;
		
		System.out.print("\nArray Ordenado = | ");
		for(int i=0; i<7;i++) {
			System.out.print(array[i]+" | ");
		}
	}
	
	
	public static void main(String[] args) {
		
		ejer1 e = new ejer1();
		e.cargarValores();
		

	}

}
