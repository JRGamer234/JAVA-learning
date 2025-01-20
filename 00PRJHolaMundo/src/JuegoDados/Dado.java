package JuegoDados;

public class Dado {

	int valor;
	
	public Dado() {
		valor = (int) (Math.random()*6+1);
	}
	public void imprimir() {
		System.out.println("Ha salido un: "+ valor);
	}
	public int getvalor() {
		return valor;
	}
	
}
