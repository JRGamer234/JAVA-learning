
public class ejer3 {

	public void mat5() {
		int[] matriz = new int[25];
		
		for(int i = 0; i<25 ; i++) {
			System.out.println(matriz[i<5] + "\n" + matriz[i<10]+ "\n" + matriz[i<15] +"\n" + matriz[i<20] "\n" + matriz[i<25]);
		}
		
	}
	
	public static void main(String[] args) {
		
		ejer3 e = new ejer3();
		e.mat5();
	}

}
