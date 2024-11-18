package Aprenderfuncioens;
public class AprenderClasesFunciones {
	private static mensajes mismensajes;

	public static void main(String[] args) {
		mismensajes = new mensajes();

		mismensajes.mensaje("Hola prueba Clases");
		mismensajes.mensaje_rojo("Adios a las clases");
		mismensajes.mensaje_info("Esto es una ventana");

	}

	public static void mensaje(String msg) {
		System.out.println(msg);
	}

}
