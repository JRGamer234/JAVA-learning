package Evaluacion1;

public class ejer3 {

	public void cuadrado() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
	
	public void rombo() {
		for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }

        // Parte inferior del rombo
        for (int i = 5 - 1; i >= 1; i--) {
            for (int j = 5; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }
	}
	
	public void abeto() {
		for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }
		for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 + 1; j++)
                System.out.print(" ");
            System.out.println("***");
        }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejer3 e = new ejer3();
		e.cuadrado();
		e.rombo();
		e.abeto();
	}

}
