package T2;

/**
* EJERCICIO 2
* Cargar en un vector los nombres de 10 alumnos y en otro vector paralelo la
* nota de cada uno. Pedir que tipo de ordenación quiere:
* Ordenar alfabéticamente e imprimir los resultados.
* Ordenar con respecto a la nota e imprimir nuevamente.
* Calculamos la media de nota en esta clase.
*/

import java.util.Scanner;

public class ArraysParalelos {
    String[] nombres = new String[10];
    float[] notas = new float[10];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArraysParalelos programa = new ArraysParalelos();
        programa.cargarDatos();
        programa.mostrarMenu();
    }

    // Método para pedir los nombres y notas de los alumnos
    public void cargarDatos() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Nota de " + nombres[i] + ": ");
            notas[i] = scanner.nextFloat();
            scanner.nextLine(); // Limpiar buffer
        }
    }

    // Menú para elegir el tipo de ordenación
    public void mostrarMenu() {
        System.out.println("\n1. Ordenar por nombre\n2. Ordenar por nota");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            ordenarPorNombre();
            System.out.println("\nLista ordenada por nombre:");
        } else if (opcion == 2) {
            ordenarPorNota();
            System.out.println("\nLista ordenada por nota:");
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        imprimirLista();
        calcularMedia();
    }

    // Ordenar alfabéticamente por nombre
    public void ordenarPorNombre() {
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[i].compareToIgnoreCase(nombres[j]) > 0) {
                    intercambiar(i, j);
                }
            }
        }
    }

    // Ordenar por nota de mayor a menor
    public void ordenarPorNota() {
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] < notas[j]) {
                    intercambiar(i, j);
                }
            }
        }
    }

    // Método auxiliar para intercambiar nombres y notas
    public void intercambiar(int i, int j) {
        String tempNombre = nombres[i];
        nombres[i] = nombres[j];
        nombres[j] = tempNombre;

        float tempNota = notas[i];  // Changed from double to float
        notas[i] = notas[j];
        notas[j] = tempNota;
    }

    // Imprimir la lista de alumnos y sus notas
    public void imprimirLista() {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }

    // Calcular y mostrar la media de las notas
    public void calcularMedia() {
        float suma = 0;  // Changed from double to float
        for (float nota : notas) {  // Changed from double to float
            suma += nota;
        }
        System.out.println("\nNota media de la clase: " + (suma / notas.length));
    }
}