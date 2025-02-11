package T2;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Array original: " + Arrays.toString(numeros));
        
        ordenarPorSeleccion(numeros);
        
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }

    public static void ordenarPorSeleccion(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}