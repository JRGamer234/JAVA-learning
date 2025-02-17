package T2;
import java.util.Scanner;

public class TresEnRaya {

	private char[][] tablero;
	private int pos_f, pos_c;
	
	public TresEnRaya() {
		tablero = new char[3][3];
		for (int i = 0; i < tablero.length ;i++) {
			for(int j = 0; j < tablero.length; j++) {
				tablero[i][j] = '_';
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < tablero.length ;i++) {
			for(int j = 0; j < tablero.length; j++) {
				System.out.println("|" + tablero[i][j]);
			}
			System.out.println("|");
		}
	}
	
	public void colocar_ficha() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce posicion de la fila: ");
		pos_f = teclado.nextInt();
		System.out.println("Introduce posicion de la columna: ");
		pos_c = teclado.nextInt();
		tablero[pos_f][pos_c] = "X";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TresEnRaya tres = new TresEnRaya();
		tres.imprimir();
		tres.colocar_ficha();
		tres.imprimir();
	}

}
