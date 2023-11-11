import java.util.Scanner;

public class EjercicioArraysCuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String[] ciudades = new String[5];
        Double[] temperaturasMinima = new Double[5];
        Double[] temperaturasMaxima = new Double[5];
        Double minima = 99999999999.0;
        Double maxima = -9999999999.0;
        int posMinima = -1;
        int posMaxima = -1;

        for (int i = 0; i < ciudades.length; i++) {
            //ingreso de datos por teclado
            System.out.println("Ingrese el nombre de la ciudad: ");
            ciudades[i] = teclado.next();
            System.out.println("Ingrese la temperatura minima: ");
            temperaturasMinima[i] = teclado2.nextDouble();
            System.out.println("Ingrese la temperatura maxima: ");
            temperaturasMaxima[i] = teclado2.nextDouble();
        }

        for (int i = 0; i < ciudades.length; i++) {
            if (temperaturasMinima[i] < minima) {
                minima = temperaturasMinima[i];
                posMinima = i;
            }
            if (temperaturasMaxima[i] > maxima) {
                maxima = temperaturasMaxima[i];
                posMaxima = i;
            }
        }

        //ingreso de datos por teclado
        System.out.println("La Ciudad con la temperatura Minima es: " + ciudades[posMinima] + ", con una Temperatura Minima de: " + temperaturasMinima[posMinima]);
        System.out.println("La Ciudad con la temperatura Maxima es: " + ciudades[posMaxima] + ", con una Temperatura Maxima de: " + temperaturasMaxima[posMaxima]);
    }
}
