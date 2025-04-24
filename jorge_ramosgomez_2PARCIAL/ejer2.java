import java.util.Scanner;

public class ejer2 {
	private Scanner sc;
	
	public ejer2(){
		
	}
	
	public void aleatorios() {
		int[][] matriz = new int[4][4];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
			matriz[i][j] = (int)(Math.random()*9)+1;
			}
		}
		for(int i = 0; i < matriz.length; i++) {
			System.out.println();
			for(int j = 0; j < matriz.length; j++) {
			System.out.print(matriz[i][j] + " ");
			}
		}
		sc = new Scanner(System.in);
		int num = 0;
		System.out.println("\nDime un número: ");
		num = sc.nextInt();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				
			}
		}
		
	}
		
	
	public static void main(String[] args) {

		ejer2 e = new ejer2();
		e.aleatorios();
	}

}
