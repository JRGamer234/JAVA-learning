
public class Calculadoraa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public int sumar(int num1, int num2) {
			return num1 + num2;
		}
		
		public int restar(int num1, int num2) {
			return num1 - num2;
		}
		
		public int multiplicar(int num1, int num2) {
			return num1 * num2;
		}
		
		public intdividir(int num1, int num2) {
			if(num2 > 0) {
				return num1 / num2;
			}
			System.err.println("No se puede dividir por 0");
			return -1;
			
		}
	}

}
