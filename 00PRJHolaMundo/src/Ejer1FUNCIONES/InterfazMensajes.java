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
        
      
        String frase = lector.leerFrase();
        int opcion = lector.leerOpcion();
        
        Mensaje mensaje = new Mensaje(frase, opcion);
        
        mostrarMensaje(mensaje);
        
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
