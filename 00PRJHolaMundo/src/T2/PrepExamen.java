package T2;

import java.util.Scanner;

public class PrepExamen {
	private Scanner sc;
	private int[] array;
		
	public PrepExamen() {
		sc = Scanner(System.in);
		array = new int[10];
		for(int i=0; i < array.length;i++) {
			System.out.println("Introduce el valor " + (i+1) + " del Array: ");
			array[i] = sc.nextInt();
		}
	}
	
	public void Imprimir() {
		for(int i = 0; i < array.length - 1; i++) {
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrepExamen p = new PrepExamen();
		p.Imprimir();
	}

}
