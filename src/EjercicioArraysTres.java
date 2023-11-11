import java.util.Scanner;

public class EjercicioArraysTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombres[] = new String[8];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese un nombre: ");
            nombres[i] = teclado.next();
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El nombre en la posicion " + i + " es: " + nombres[i]);
        }

    }
}
