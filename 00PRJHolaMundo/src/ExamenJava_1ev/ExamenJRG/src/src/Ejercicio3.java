package src;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alt = 10;
		//cuadrado1
		for(int i = 0; i < alt ;i++)
		{
			for (int j = 0; j++ < alt +1 ; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j++ < alt; j++) {
				System.out.print("! ");
			}
			
			System.out.println("");
		}
		//cuadrado2
		System.out.println("* * * * * * * * *");
		System.out.println("*       *       *");
		System.out.println("*       *       *");
		System.out.println("*       *       *");
		System.out.println("* * * * * * * * *");
		System.out.println("*       *       *");
		System.out.println("*       *       *");
		System.out.println("*       *       *");
		System.out.println("* * * * * * * * *");
		
		
	}

}
