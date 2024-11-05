package Ejer1FUNCIONES;

public class FormateadorMensajes {
// Color Rojo
	private static final String ANSI_RED = "\u001B[31m";
    
    public void mostrarMensajeNormal(String mensaje) {
        System.out.println("\nMensaje normal:");
        System.out.println("- " + mensaje);
    }
    
    public void mostrarMensajeError(String mensaje) {
        System.out.println("\nMensaje de error:");
        System.out.println(ANSI_RED + "ERROR: " + mensaje );
    }
}