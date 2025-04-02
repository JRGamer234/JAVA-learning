package T2;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class PracticaExamen {

	private Scanner sc;
	
	public PracticaExamen(){
		sc = new Scanner(System.in);
	}
	
	public void ArrayNormal() {
		//Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.
		//Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.Imprimir las alturas.
		float[] altura = new float[5];
		float suma = 0;
		for(int i=0;i<altura.length;i++) {
			System.out.println("Altura de persona " + (i+1) + ": ");
			altura[i] = sc.nextFloat();
			suma += altura[i];
		}
		float promedio = suma / 5;
		int alto = 0, bajo = 0;
		
		for(int i=0;i<altura.length;i++) {
			if(altura[i] > promedio) {
				alto++;
			}else if(altura[i] < promedio) {
				bajo++;
			}
		}
		System.out.println("El promedio es: " + promedio);
		
		if(alto > bajo) {
			System.out.println("Hay más altos que bajos.");
		}else {
			System.out.println("Hay más bajos que altos.");
		}
		System.out.println("Las alturas son: ");
		for(int i=0;i<altura.length;i++) {
			System.out.print(altura[i] + " | ");
		}
		 
	}
	
	public void ArrayRandom() {
		//Crea una array de tamaño random(max 50) y
		//cargalo con número entre
		//100 y 200 incluidos.
		
		int tamano = (int)(Math.random()*50)+1;
		int[] numeros = new int[tamano];
		
		for(int i=0; i<tamano; i++) {
			numeros[i] = (int)(Math.random()*101)+100;
		}
		for(int i=0; i < numeros.length ; i++) {
			int numero = numeros[i];
			System.out.println(numero + " | ");
		}
		System.out.println("El tamaño del array es de: " + tamano);
	}
	
	public void OrdenarArray() {
		// EJERCICIO 1//paises[f].compareTo(paises[f+1])>0
		// Definir un vector donde almacenar los nombres de 5 paises.
		// Confeccionar el algoritmo de ordenamiento alfabético.
		
		/*Es importante importar = "import java.util.Arrays y import java.util.Comparator*/
		String[] paises = {"España","Argentina","Brasil","Chile","Peru"};
		//Ordenar de la A -> Z
		Arrays.sort(paises);
		System.out.println(Arrays.toString(paises));
		
		//Ordenar de la Z -> A
		Arrays.sort(paises, Comparator.reverseOrder());
		System.out.println(Arrays.toString(paises));
		
		// PARA NUMEROS ENTEROS usar (INTEGER) y para decimales con (DOUBLE)
		Integer[] numbers = {5, 8, 3, 7, 6, 8};
		//Menor a Mayor
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		//Mayor a Menor
		Arrays.sort(numbers, Comparator.reverseOrder());
		System.out.println(Arrays.toString(numbers));	
	}
	
	public void ArraysParalelos() {
		//Cargar en un vector los nombres de 10 alumnos y en otro vector paralelo la
		//nota de cada uno. Pedir que tipo de ordenación quiere:
		//Ordenar alfabéticamente e imprimir los resultados. 
		//Ordenar con respecto a la nota (mayor a menor) e imprimir nuevamente.
		//Calculamos la media de nota en esta clase.
		
		String[] alumno = {"Pepe", "Jorge", "Juanito", "Eva", "Antonio"};
		Double[] notas = {5.2, 6.1, 3.2, 8.9, 1.5};
		 //Para hacerlo más sencillo es mejor introducir un índice,

		//En el caso de tener que ser automático poner esto: 
		Integer[] indice = new Integer[alumno.length];									
		for(int i = 0; i < indice.length; i++) {
			indice[i] = i;
			}
		
		//Ordebar según el nombre del alumno
		Arrays.sort(indice, Comparator.comparing(i -> alumno[i]));
		
		//Mostrar
		for(int i =0; i<indice.length;i++) {
			System.out.println("Alumno: "+ alumno[i] + " | Nota: " + notas[i] + "");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PracticaExamen p = new PracticaExamen();
		int opcion = 0;
		System.out.println("1) ArrayNormal \n2) ArrayRandom \n3) OrdenarArray \n4) ArrayParalelo");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1: {
				p.ArrayNormal();
			break;
		}
		case 2: {
				p.ArrayRandom();
			break;
		}
		case 3: {
			p.OrdenarArray();
			break;
		}
		case 4: {
			p.ArraysParalelos();
		}
		default:
			break;
		}
		
		
		
	}

}
