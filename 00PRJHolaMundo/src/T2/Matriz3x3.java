package T2;
import java.util.Random;
public class Matriz3x3 {

	/*
	 * MATRIZ3x3
	 * 
	 * Rellena con "X" en todas las posiciones menos en 1
	 * Conseguir rellenar el hueco con un 0
	 * */
		private String[][] tres; 
		private Random ran;
		private int row; 
		private int col;
		
		public Matriz3x3() {
			tres = new String[3][3];
			ran = new Random();
			row = ran.nextInt(3);
			col = ran.nextInt(3);
			rellenarMatriz();
		}
		
		public void rellenarMatriz() {
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					if(i == row && j == col) {
						tres[i][j] = "0";
					}else {
						tres[i][j] = "X";
					}
				}
			}
		}
		
		public void imprimir() {
			for(int i = 0; i < 3; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					System.out.print("" + tres[i][j] + "");
				}		
				System.out.println();
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz3x3 m = new Matriz3x3();
		
		m.imprimir();
	}

}
