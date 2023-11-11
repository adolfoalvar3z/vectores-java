import java.util.Scanner;

public class Vectores {
    public static void main(String[] args){
        int vector[] = new int[4];

        //vector[2] = vector[0]+vector[1];
        //System.out.println(vector[2]);
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i<vector.length; i++){
            //asignación de valores
            System.out.println("Ingrese un valor en el indice: "+i);
            vector[i] = teclado.nextInt();
        }

        for(int i=0; i<vector.length; i++){
            //asignación de valores
            System.out.println("Estoy en el indice: "+i);
            System.out.println("Tengo guardado: "+vector[i]);
            System.out.println("-------------");
        }
    }

}
