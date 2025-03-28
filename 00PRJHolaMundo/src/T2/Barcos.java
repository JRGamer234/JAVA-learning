package T2;
import java.util.Scanner;
public class Barcos {
	public void juego() {
	    Scanner sc = new Scanner(System.in);
	    int vidas = 3;
	    int barco = (int)(Math.random() * 10) + 1;
	    boolean ganado = false;

	    while (vidas > 0) {
	        System.out.println("Vidas: " + vidas);
	        System.out.println("¿En qué posición está el barco? (1-10)");
	        int x = sc.nextInt();

	        if (x == barco) {
	            System.out.println("¡Lo has encontrado!");
	            ganado = true;
	        } else {
	            vidas--;
	            System.out.println("Fallaste. Te quedan " + vidas + " vidas");
	        }
	    }
	    if (vidas == 0) {
	        System.out.println("Perdiste. El barco estaba en " + barco);
	    }
	}
	public static void main(String[] args) {
		Barcos b = new Barcos();
		b.juego();
	}
}