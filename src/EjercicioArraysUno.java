import java.util.Scanner;

public class EjercicioArraysUno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[15];
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor en el indice: " + i);
            vector[i] = teclado.nextInt();
            if (vector[i] == 3) contador++;
        }
        System.out.println("El numero 3 se repite: " + contador + " veces");
    }
}
