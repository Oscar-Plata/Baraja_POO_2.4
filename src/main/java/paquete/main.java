package paquete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase main de funcionamiento de la baraja
 * @author oscar
 * @version (17/10/21
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baraja baraja = new Baraja();
        Jugador jugador=new Jugador();
        ArrayList<Carta> cartas=new ArrayList<>(5);
        int opc ;
        do {
            System.out.println("Menu\n 0)Llenar Baraja\n");
            System.out.println("1)Mostrar Baraja\n2)Revolver\n");
            System.out.println("3)Sacar 5 Cartas\n4)Dar cartas a Jugador\n");
            System.out.println("5)Mostrar Cartas del juagor\n6)Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 0:
                    baraja.llenarBaraja();
                    break;
                case 1:
                    baraja.mostrarBaraja();
                    break;

                case 2:
                    baraja.revolver();
                    break;

                case 3:
                    cartas = baraja.darCartas(5);
                    for (int i = 0; i < 5; i++) {
                        System.out.println(cartas.get(i));
                    }


                case 4: jugador.recibirCartas(cartas);
                    break;
                case 5: 
                        jugador.mostrarCartas();
                        jugador.mostrarAlta();
                        jugador.mismoPalo();
                    break;
                case 6:
                        System.out.println("Saliendo...\n");
                        break;
                default: System.out.println("Error num no valido\n");
                break;

            }


        }while (opc != 6);

    }
}
