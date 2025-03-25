//1. Crear un array de numeros enteros de tamaño 10 (5 mins)
//2. Haced una funcion que muestre el array separado por guiones (5 mins)
//3. Buscad el mayor elemento del array y colocadlo en la primera posicion (10 mins)
//4. Ordenar el array de mayor a menor (10 mins)
//5. Crear una matriz 5x5 inicialmente vacía:
/*        Hacer un menú con estas opciones:
*
* - Rellenar TODA la matriz de números, debes pedírselo al usuario.
* - Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
* - Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
* - Sumar la diagonal principal
* - Sumar la diagonal inversa
* - La media de todos los valores de la matriz
*/

package T2;

import java.util.Scanner;
import java.util.Arrays;

public class PrepExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[][] matriz = new int[5][5];
        
        llenarArray(sc, array);
        mostrarArray(array);
        colocarMayorAlInicio(array);
        ordenarArrayDesc(array);
        mostrarArray(array);
        
        menuMatriz(sc, matriz);
    }
    
    public static void llenarArray(Scanner sc, int[] array) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }
    
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }
    
    public static void colocarMayorAlInicio(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = array[maxIndex];
        array[maxIndex] = array[0];
        array[0] = temp;
    }
    
    public static void ordenarArrayDesc(int[] array) {
        Arrays.sort(array);
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    
    public static void menuMatriz(Scanner sc, int[][] matriz) {
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Sumar una fila");
            System.out.println("3. Sumar una columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Media de la matriz");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    llenarMatriz(sc, matriz);
                    break;
                case 2:
                    System.out.print("Ingrese la fila (0-4): ");
                    int fila = sc.nextInt();
                    if (fila >= 0 && fila < 5) {
                        System.out.println("Suma de la fila: " + sumarFila(matriz, fila));
                    } else {
                        System.out.println("Fila inválida.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la columna (0-4): ");
                    int columna = sc.nextInt();
                    if (columna >= 0 && columna < 5) {
                        System.out.println("Suma de la columna: " + sumarColumna(matriz, columna));
                    } else {
                        System.out.println("Columna inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Suma de la diagonal principal: " + sumarDiagonalPrincipal(matriz));
                    break;
                case 5:
                    System.out.println("Suma de la diagonal inversa: " + sumarDiagonalInversa(matriz));
                    break;
                case 6:
                    System.out.println("Media de los valores: " + calcularMedia(matriz));
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
    }
    
    public static void llenarMatriz(Scanner sc, int[][] matriz) {
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    
    public static int sumarFila(int[][] matriz, int fila) {
        return Arrays.stream(matriz[fila]).sum();
    }
    
    public static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }
    
    public static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
    
    public static int sumarDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += matriz[i][4 - i];
        }
        return suma;
    }
    
    public static double calcularMedia(int[][] matriz) {
        int sumaTotal = 0;
        for (int[] filaMatriz : matriz) {
            for (int num : filaMatriz) {
                sumaTotal += num;
            }
        }
        return (double) sumaTotal / 25;
    }
}

