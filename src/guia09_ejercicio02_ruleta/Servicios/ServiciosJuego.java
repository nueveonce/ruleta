/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ejercicio02_ruleta.Servicios;

import guia09_ejercicio02_ruleta.Entidades.Jugador;
import guia09_ejercicio02_ruleta.Entidades.Revolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author nueveonce
 */
public class ServiciosJuego {

    private Scanner leer;
    private ArrayList<Jugador> jugadores;
    private Revolver rev;

    public ServiciosJuego() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.jugadores = new ArrayList();
        this.rev = new Revolver();
    }

    public ServiciosJuego(Scanner leer, ArrayList<Jugador> jugadores, Revolver revolver) {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.jugadores = new ArrayList();
        this.rev = new Revolver();
    }

    /**
     * este método recibe los jugadores y el revolver para guardarlos en los
     * atributos del juego.
     */
    public void llenarJuego() {
        Integer numeroJugadores;
        System.out.print("INGRESE LA CANTIDAD DE JUGADORES (MIN 1 - MAX 6): ");
        System.out.println("");

        do {
            numeroJugadores = leer.nextInt();
        } while (numeroJugadores < 1 || numeroJugadores > 6);

        for (int i = 1; i <= numeroJugadores; i++) {
            jugadores.add(cargarJugadores(i));
        }
    }

//    /**
//     * . cada ronda consiste en un jugador que se apunta con el revolver de agua y
//     * aprieta el gatillo, Sí el revolver tira el agua el jugador se moja y se
//     * termina el juego, sino se moja, se pasa al siguiente jugador hasta que
//     * uno se moje, Si o si alguien se tiene que mojar, Al final del juego, se
//     * debe mostrar que jugador se mojó.
//     *
//     */
    public void ronda() {
        ServiciosRevolver servRev = new ServiciosRevolver();
        ServiciosJugador servJug = new ServiciosJugador();

        servRev.llenarRevolver(); //CARGO EL REVOLVER
        llenarJuego();//CARGO LOS NOMBRE DE LOS PARTICIPANTES
        for (int i = 0; i < jugadores.size(); i++) {
            
            System.out.println("DISPARO " + jugadores.get(i).getNombre());
            servJug.disparo(servRev); //DISPARO DE CADA PARTICIPANTE
        }
    }

    public Jugador cargarJugadores(int numero) {

        System.out.print("NOMBRE DEL PARTICIPANTE NUMERO  " + numero + " : ");
        String nombre = leer.next();
        return new Jugador(numero, nombre, false);
    }
}
