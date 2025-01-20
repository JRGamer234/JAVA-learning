package Triangulo;

public class triangulo {

	public class Triangulo {
		private double lado1;
		private double lado2;
		private double lado3;
		private String tipo;

		public Triangulo(double lado1, double lado2, double lado3) {
			this.lado1 = esLadoValido(lado1) ? lado1 : 1;
			this.lado2 = esLadoValido(lado2) ? lado2 : 1;
			this.lado3 = esLadoValido(lado3) ? lado3 : 1;
			calcularTipo();
		}

		public double getLado1() {
			return lado1;
		}

		public double getLado2() {
			return lado2;
		}

		public double getLado3() {
			return lado3;
		}

		public String getTipo() {
			return tipo;
		}

		// Setters
		public void setLado1(double lado1) {
			if (esLadoValido(lado1)) {
				this.lado1 = lado1;
				calcularTipo();
			}
		}

		public void setLado2(double lado2) {
			if (esLadoValido(lado2)) {
				this.lado2 = lado2;
				calcularTipo();
			}
		}

		public void setLado3(double lado3) {
			if (esLadoValido(lado3)) {
				this.lado3 = lado3;
				calcularTipo();
			}
		}

		// Métodos privados
		private boolean esLadoValido(double lado) {
			return lado > 0;
		}

		private void calcularTipo() {
			if (lado1 == lado2 && lado2 == lado3) {
				tipo = "Equilátero";
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				tipo = "Isósceles";
			} else {
				tipo = "Escaleno";
			}
		}
	}
}
