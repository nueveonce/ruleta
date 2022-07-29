/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ejercicio02_ruleta.Servicios;

import guia09_ejercicio02_ruleta.Entidades.Jugador;
import guia09_ejercicio02_ruleta.Entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author nueveonce
 */
public class ServiciosJugador {

    public ServiciosJugador() {
    }

    /**
     * . el método, recibe el revolver de agua y llama a los métodos de mojar()
     * y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo
     * y si el revolver tira el agua, el jugador se moja. El atributo mojado
     * pasa a false y el método devuelve true, sino false.
     *
     * @param r
     */
    public void disparo( ServiciosRevolver servRev) {
        
        if (servRev.mojar() == true) {            
            System.out.println("******MOJADO*****");          
            servRev.siguenteChorro();
            System.out.println("");

        } else {
            
            System.out.println("SAFO");
            servRev.siguenteChorro();
            System.out.println("");
        }

    }

}
