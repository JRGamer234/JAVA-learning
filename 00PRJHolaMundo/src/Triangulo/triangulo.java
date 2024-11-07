package Triangulo;

public class triangulo {

	public triangulo(int lado1, int lado2, int lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	private int lado1;
	private int lado2;
	private int lado3;
	
	public int imprimirMayorLado() {
		int mayor;
		
		if (lado1 > lado2 && lado1 > lado3) {
			mayor = lado1;
		}else if(lado2 > lado1 && lado2 >= lado3) {
			mayor = lado2;
		}else{
			mayor = lado3;
		}
		
		System.out.println("El lado mayot es: "+ mayor);
		
	}

}
