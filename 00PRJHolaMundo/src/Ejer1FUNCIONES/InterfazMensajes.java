package Ejer1FUNCIONES;

public class InterfazMensajes {
    private LectorDatos lector;
    private FormateadorMensajes formateador;
    
    public InterfazMensajes() {
        lector = new LectorDatos();
        formateador = new FormateadorMensajes();
    }
    
    public void iniciar() {
        System.out.println("=== FORMATEADOR DE MENSAJES ===");
        
        // Leer datos
        String frase = lector.leerFrase();
        int opcion = lector.leerOpcion();
        
        // Crear objeto mensaje
        Mensaje mensaje = new Mensaje(frase, opcion);
        
        // Mostrar mensaje según la opción seleccionada
        mostrarMensaje(mensaje);
        
        // Cerrar scanner
        lector.cerrar();
    }
    
    private void mostrarMensaje(Mensaje mensaje) {
        switch (mensaje.getTipoMensaje()) {
            case 1:
                formateador.mostrarMensajeNormal(mensaje.getTexto());
                break;
            case 2:
                formateador.mostrarMensajeError(mensaje.getTexto());
                break;
        }
    }
}
