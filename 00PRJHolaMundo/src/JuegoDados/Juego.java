package JuegoDados;

public class Juego {

	private static Juego mi_Juego;
	private static Dado dado1, dado2;
	private static int result;
	public Juego() {	//Constructor
		dado1 = new Dado();
		dado2 = new Dado();

	}
	
	public static void main(String[] args) {
		
		mi_Juego = new Juego();
		result = dado1.getvalor() + dado2.getvalor();
		if(result > 8) {
			System.out.println("Has ganado");
		}else {
			System.out.println("Has perdido");
		}
		
	}

}
