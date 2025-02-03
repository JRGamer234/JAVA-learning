package T2.ahorcado;

import java.util.Scanner;

public class ahorcado {
    private static final int MAX_INTENTOS = 6;
    private static String palabraSecreta;
    private static char[] palabraAdivinada;
    private static int intentosRestantes;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        inicializarJuego("PROGRAMACION");
        
        while (intentosRestantes > 0 && !palabraCompleta()) {
            mostrarEstadoJuego();
            System.out.print("\nIngresa una letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);
            procesarIntento(letra);
        }
        
        finalizarJuego();
        scanner.close();
    }
    
    private static void inicializarJuego(String palabra) {
        palabraSecreta = palabra.toUpperCase();
        palabraAdivinada = new char[palabraSecreta.length()];
        intentosRestantes = MAX_INTENTOS;
        
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
    }
    
    private static void mostrarEstadoJuego() {
        System.out.println("\n=== AHORCADO ===");
        System.out.println("Intentos restantes: " + intentosRestantes);
        System.out.print("Palabra: ");
        for (char letra : palabraAdivinada) {
            System.out.print(letra + " ");
        }
        dibujarAhorcado();
    }
    
    private static void procesarIntento(char letra) {
        boolean acierto = false;
        
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra && palabraAdivinada[i] == '_') {
                palabraAdivinada[i] = letra;
                acierto = true;
            }
        }
        
        if (!acierto) {
            intentosRestantes--;
            System.out.println("¡Letra incorrecta!");
        }
    }
    
    private static boolean palabraCompleta() {
        for (char letra : palabraAdivinada) {
            if (letra == '_') {
                return false;
            }
        }
        return true;
    }
    
    private static void finalizarJuego() {
        mostrarEstadoJuego();
        if (palabraCompleta()) {
            System.out.println("\n¡Has ganado!");
        } else {
            System.out.println("\nPerdiste. La palabra era: " + palabraSecreta);
        }
    }
    
    private static void dibujarAhorcado() {
        System.out.println("\n");
        switch (MAX_INTENTOS - intentosRestantes) {
            case 0:
                System.out.println("  ----");
                System.out.println("  |  ");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("-----");
                break;
            case 1:
                System.out.println("  ----");
                System.out.println("  |  O");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("-----");
                break;
            case 2:
                System.out.println("  ----");
                System.out.println("  |  O");
                System.out.println("  |  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("-----");
                break;
            case 3:
                System.out.println("  ----");
                System.out.println("  |  O");
                System.out.println("  | /|");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("-----");
                break;
            case 4:
                System.out.println("  ----");
                System.out.println("  |  O");
                System.out.println("  | /|\\");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("-----");
                break;
            case 5:
                System.out.println("  ----");
                System.out.println("  |  O");
                System.out.println("  | /|\\");
                System.out.println("  | /");
                System.out.println("  |");
                System.out.println("-----");
                break;
            case 6:
                System.out.println("  ----");
                System.out.println("  |  O");
                System.out.println("  | /|\\");
                System.out.println("  | / \\");
                System.out.println("  |");
                System.out.println("-----");
                break;
        }
    }
}