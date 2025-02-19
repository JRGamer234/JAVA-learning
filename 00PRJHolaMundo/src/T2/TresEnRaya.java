package T2;
import java.util.Scanner;

public class TresEnRaya {
    private char[][] tablero = new char[3][3];
    private boolean turnoX = true; // true para X, false para O
    
    public TresEnRaya() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '_';
            }
        }
    }
    
    public void imprimir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public boolean colocarFicha(int fila, int columna) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != '_') {
            System.out.println("Posición inválida. Intenta de nuevo.");
            return false;
        }
        tablero[fila][columna] = turnoX ? 'X' : 'O';
        turnoX = !turnoX;
        return true;
    }
    
    public boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '_' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) return true;
            if (tablero[0][i] != '_' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) return true;
        }
        if (tablero[0][0] != '_' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) return true;
        if (tablero[0][2] != '_' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) return true;
        return false;
    }
    
    public void jugar() {
        Scanner teclado = new Scanner(System.in);
        int turnos = 0;
        while (turnos < 9) {
            imprimir();
            System.out.println("Turno de " + (turnoX ? "X" : "O") + " (fila columna):");
            int fila = teclado.nextInt();
            int columna = teclado.nextInt();
            if (colocarFicha(fila, columna)) {
                if (hayGanador()) {
                    imprimir();
                    System.out.println("¡El jugador " + (turnoX ? "O" : "X") + " ha ganado!");
                    break;
                }
                turnos++;
            }
        }
        if (turnos == 9) {
            imprimir();
            System.out.println("¡Empate!");
        }
        teclado.close();
    }
    
    public static void main(String[] args) {
        new TresEnRaya().jugar();
    }
}
