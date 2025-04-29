package Evaluacion1;

import java.util.Scanner;

public class ejer1 {

	public void notas() {
		Scanner sc = new Scanner(System.in);
		float[] notas = new float[10];
		int sus = 0, ap = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Introduce la nota del alumno " + (i+1) + " :");
			notas[i] = sc.nextFloat();
			if(notas[i] >= 7) {
				ap++;
			}else {
				sus++;
				
			}
		}
		System.out.println("Aprobados: " + ap + "\nSuspensos: " + sus +".");
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
/*Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen notas mayores o 
 * iguales a 7 y cuántos menores.

Para resolver este problema se requieren tres contadores:

aprobados (Cuenta la cantidad de alumnos aprobados)
reprobados (Cuenta la cantidad de reprobados)
f (es el contador del for)
Dentro de la estructura repetitiva debemos hacer la carga de la variable nota y verificar con una 
estructura condicional si el contenido de la variable nota es mayor o igual a 7 para incrementar el 
contador aprobados, en caso de que la condición retorne falso debemos incrementar la variable reprobados.*/
		
		ejer1 e = new ejer1();
		e.notas();
	}

}
