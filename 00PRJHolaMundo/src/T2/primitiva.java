package T2;
//Necesitamos un array de tamaño 6 para almacenar los numeros de la primitiva
//Estos se generan de forma aleatoria ( NO SE PUEDEN REPETIR )
//Y quierp que se impriman separados por guiones

public class primitiva {
 public static void main(String[] args) {
     
     int[] numerosPremiados = new int[6];
     
     for (int i = 0; i < numerosPremiados.length; i++) {
         int numeroAleatorio;
         boolean repetido;
         
         do {
             // Genera número entre 1 y 49
             numeroAleatorio = (int)(Math.random() * 49) + 1;
             
             // Comprobar si el número está repetido
             repetido = true;
             for (int j = 0; j < i; j++) {
                 if (numerosPremiados[j] == numeroAleatorio) {
                     repetido = false;
                 }
             }
         } while (!repetido);
         
         numerosPremiados[i] = numeroAleatorio;
     }
     
     // Imprimir los números separados por guiones
     for (int i = 0; i < numerosPremiados.length; i++) {
         System.out.print(numerosPremiados[i]);
         if (i < numerosPremiados.length - 1) {
             System.out.print("-");
         }
     }
 }
}