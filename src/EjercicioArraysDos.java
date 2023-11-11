import java.util.Scanner;

public class EjercicioArraysDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double notas[][] = new Double[4][4];
//ingresar notas
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length - 1; j++) {
                System.out.println("Ingrese Nota para Alumno " + i + " en la materia " + j + ": ");
                notas[i][j] = teclado.nextDouble();
            }
            notas[i][3] = (notas[i][0] + notas[i][1] + notas[i][2]) / (notas.length - 1);
        }
//mostrar notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Las notas del alumno " + i + " son: ");
            for (int j = 0; j < notas.length - 1; j++) {
                System.out.print(notas[i][j] + ", ");
            }
            System.out.println("Siendo el promedio: " + notas[i][3]);

        }
    }
}
