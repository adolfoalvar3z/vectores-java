import java.util.Scanner;

public class EjercicioArraysSeis {

    public static void main(String[] args) {
        int[][] vuelos = new int[6][3];
        String opcion = "";
        int destino, horario, pasajes;
        Scanner teclado = new Scanner(System.in);
        //CARGA DE 0 PARA EVITAR FUTUROS ERRORES
        for (int f = 0; f < vuelos.length; f++) {
            for (int c = 0; c < vuelos[f].length; c++) {
                vuelos[f][c] = 0;
            }
        }

        do {
            System.out.println("""
                    ------BIENVENIDOS A NUESTRA AEROLINEA------
                    ******************* Menu ******************
                    1.- Cargar Base de Asientos:
                    2.- Reservar Asientos:

                                    
                    Para salir del menú escriba la palabra \"finish\".
                                    
                    Ingrese su Opción: 
                    """);
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    for (int f = 0; f < vuelos.length; f++) {
                        for (int c = 0; c < vuelos[f].length; c++) {
                            System.out.println("Ingrese el valor de la fila " + f + " columna " + c);

                            vuelos[f][c] = teclado.nextInt();
                        }
                    }
                    opcion = "";
                    break;
                case "2":

                    System.out.println(STR. """
                    ******************* Menu ******************
                    Reservar Asientos:
                        Tenemos pasajes disponibles a los siguientes destinos:
                                                       0      1      2
                                                    mañana, tarde, noche
                            - 0 Rio de Janeiro      [\{ vuelos[0][0] }]    [\{ vuelos[0][1] }]    [\{ vuelos[0][2] }]
                            - 1 Cancún              [\{ vuelos[1][0] }]    [\{ vuelos[1][1] }]    [\{ vuelos[1][2] }]
                            - 2 Madrid              [\{ vuelos[2][0] }]    [\{ vuelos[2][1] }]    [\{ vuelos[2][2] }]
                            - 3 Roma                [\{ vuelos[3][0] }]    [\{ vuelos[3][1] }]    [\{ vuelos[3][2] }]
                            - 4 Milán               [\{ vuelos[4][0] }]    [\{ vuelos[4][1] }]    [\{ vuelos[4][2] }]
                            - 5 Iguazú              [\{ vuelos[5][0] }]    [\{ vuelos[5][1] }]    [\{ vuelos[5][2] }]

                    """ );
                    opcion = "SI";

                    do {
                        System.out.print("Ingrese el Destino: ");
                        destino = teclado.nextInt();
                        System.out.print("Ingrese el Horario: ");
                        horario = teclado.nextInt();
                        System.out.print("Ingrese la cantidad de pasajes a reservar: ");
                        pasajes = teclado.nextInt();
                        if (vuelos[destino][horario] >= pasajes && pasajes > 0) {
                            vuelos[destino][horario] -= pasajes;
                            System.out.println("Reserva realizada con éxito");
                        } else {
                            System.out.println("No hay suficientes pasajes disponibles o ingresaste una cantidad no válida");
                        }
                        System.out.println(STR. """
                    ******************* Menu ******************
                        Tenemos pasajes disponibles a los siguientes destinos:
                                                       0      1      2
                                                    mañana, tarde, noche
                            - 0 Rio de Janeiro      [\{ vuelos[0][0] }]    [\{ vuelos[0][1] }]    [\{ vuelos[0][2] }]
                            - 1 Cancún              [\{ vuelos[1][0] }]    [\{ vuelos[1][1] }]    [\{ vuelos[1][2] }]
                            - 2 Madrid              [\{ vuelos[2][0] }]    [\{ vuelos[2][1] }]    [\{ vuelos[2][2] }]
                            - 3 Roma                [\{ vuelos[3][0] }]    [\{ vuelos[3][1] }]    [\{ vuelos[3][2] }]
                            - 4 Milán               [\{ vuelos[4][0] }]    [\{ vuelos[4][1] }]    [\{ vuelos[4][2] }]
                            - 5 Iguazú              [\{ vuelos[5][0] }]    [\{ vuelos[5][1] }]    [\{ vuelos[5][2] }]

                    """ );
                        System.out.print("Deseas realizar otra reserva? SI/NO: ");
                        opcion = teclado.next();

                    } while (!opcion.equalsIgnoreCase("NO"));


                    opcion = "";

                    break;
                case "finish":
                    for (int f = 0; f < vuelos.length; f++) {
                        for (int c = 0; c < vuelos[f].length; c++) {
                            System.out.print("[" + vuelos[f][c] + "]");
                        }
                        System.out.println("");
                    }
                    break;
            }
        } while (!opcion.equalsIgnoreCase("finish"));

    }
}