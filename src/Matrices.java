import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        //asignacion
        Scanner teclado = new Scanner(System.in);

        for (int i=0; i<matriz.length; i++){
            for (int j=0;j<matriz.length; j++) {
                System.out.println("Ingrese un valor en la posicion: "+i+","+j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i=0; i<matriz.length; i++){
            for (int j=0;j<matriz.length; j++) {
                System.out.println("El valor en la posicion: "+i+","+j+" es: "+matriz[i][j]);
            }
            System.out.print("\n");
        }


    }
}
