package T2;

/**
 * EJERCICIO 1
 * Cargar en un vector los nombres de 5 paises y en otro vector paralelo la
 * cantidad de habitantes del mismo. Ordenar alfabéticamente e imprimir los
 * resultados.
 */



import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        String[] paises = {"España", "Argentina", "Brasil", "Chile", "Perú"};
        
        System.out.println("Array original: " + Arrays.toString(paises));
        
        ordenarAlfabeticamente(paises);
        
        System.out.println("Array ordenado: " + Arrays.toString(paises));
    }

    public static void ordenarAlfabeticamente(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
