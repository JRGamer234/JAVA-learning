package T2;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
	    public static final int TAM = 10;
	    public static char[][] tablero = new char[TAM][TAM];
	    public static int[][] barcos = new int[TAM][TAM];
	    public static Random random = new Random();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        HundirLaFlota h = new HundirLaFlota();
	        
	        h.inicializarTablero();
	        h.colocarBarcos();
	        System.out.println("Bienvenido a Hundir la Flota!");

	        while (h.quedanBarcos()) {
	            h.mostrarTablero();
	            System.out.print("Introduce fila: ");
	            int fila = scanner.nextInt();
	            System.out.print("Introduce columna: ");
	            int columna = scanner.nextInt();
	            
	            if (fila < 0 || fila >= TAM || columna < 0 || columna >= TAM) {
	                System.out.println("Coordenadas fuera de rango. Inténtalo de nuevo.");
	                continue;
	            }
	            
	            if (h.disparar(fila, columna)) {
	                System.out.println("¡Impacto!");
	            } else {
	                System.out.println("Agua.");
	            }
	        }

	        System.out.println("¡Has hundido todos los barcos!");
	        scanner.close();
	    }

	    public void inicializarTablero() {
	        for (int i = 0; i < TAM; i++) {
	            for (int j = 0; j < TAM; j++) {
	                tablero[i][j] = '~';
	                barcos[i][j] = 0;
	            }
	        }
	    }

	    public void colocarBarcos() {
	        int[] tamaños = {1, 1, 1, 2, 2, 3};
	        for (int tamaño : tamaños) {
	            boolean colocado = false;
	            while (!colocado) {
	                int fila = random.nextInt(TAM);
	                int columna = random.nextInt(TAM);
	                boolean horizontal = random.nextBoolean();
	                
	                if (cabeBarco(fila, columna, tamaño, horizontal)) {
	                    for (int i = 0; i < tamaño; i++) {
	                        int f = horizontal ? fila : fila + i;
	                        int c = horizontal ? columna + i : columna;
	                        barcos[f][c] = tamaño;
	                    }
	                    colocado = true;
	                }
	            }
	        }
	    }

	    public boolean cabeBarco(int fila, int columna, int tamaño, boolean horizontal) {
	        for (int i = 0; i < tamaño; i++) {
	            int f = horizontal ? fila : fila + i;
	            int c = horizontal ? columna + i : columna;
	            if (f >= TAM || c >= TAM || barcos[f][c] != 0) return false;
	        }
	        return true;
	    }

	    public boolean disparar(int fila, int columna) {
	        if (tablero[fila][columna] == 'X') {
	            return true;
	        } else if (barcos[fila][columna] > 0) {
	            tablero[fila][columna] = 'X';
	            barcos[fila][columna] = 0;
	            return true;
	        } else {
	            tablero[fila][columna] = 'O';
	            return false;
	        }
	    }

	    public void mostrarTablero() {
	        System.out.println("  0 1 2 3 4 5 6 7 8 9");
	        for (int i = 0; i < TAM; i++) {
	            System.out.print(i + " ");
	            for (int j = 0; j < TAM; j++) {
	                System.out.print(tablero[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public boolean quedanBarcos() {
	        for (int i = 0; i < TAM; i++) {
	            for (int j = 0; j < TAM; j++) {
	                if (barcos[i][j] > 0) return true;
	            }
	        }
	        return false;
	    }
}