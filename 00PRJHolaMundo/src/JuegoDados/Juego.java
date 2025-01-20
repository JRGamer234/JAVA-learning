package JuegoDados;

public class Juego {

	private static Juego mi_Juego;
	private static Dado dado1, dado2, dado3;
	private static int result;
	public Juego() {	//Constructor
		dado1 = new Dado();
		dado2 = new Dado();
		dado3 = new Dado();

	}
	
	public static void main(String[] args) {
		
		mi_Juego = new Juego();
		result = dado1.getvalor() + dado2.getvalor() + dado3.getvalor();
		dado1.imprimir();
		dado2.imprimir();
		dado3.imprimir();
		/*if(result >= 9) {
			System.out.println("Has ganado");
		}else {
			System.out.println("Has perdido");
		}*/
		System.out.println(result >= 9 ? "Has ganado" : "Has perdido");		
	}

}
