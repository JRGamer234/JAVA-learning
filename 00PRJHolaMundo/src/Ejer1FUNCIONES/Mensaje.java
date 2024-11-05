package Ejer1FUNCIONES;

public class Mensaje {
    private String texto;
    private int tipoMensaje;
    
    public Mensaje(String texto, int tipoMensaje) {
        this.texto = texto;
        this.tipoMensaje = tipoMensaje;
    }
    
    public String getTexto() {
        return texto;
    }
    
    public int getTipoMensaje() {
        return tipoMensaje;
    }
}
