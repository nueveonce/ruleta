/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ejercicio02_ruleta.Servicios;

import guia09_ejercicio02_ruleta.Entidades.Revolver;

/**
 *
 * @author nueveonce
 */
public class ServiciosRevolver {

    private Revolver revolver;

    public ServiciosRevolver() {
        this.revolver = new Revolver();

    }

    public ServiciosRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    /**
     * . le pone los valores de posición actual y de posición del agua, Los .
     * valores deben ser aleatorios.
     */
    public void llenarRevolver() {

        revolver.setPosicionActual((int) (Math.random() * 6)+1);
        revolver.setPosicionAgua((int) (Math.random() * 6)+1);
        System.out.println("pos: " + revolver.getPosicionActual());
        System.out.println("Agua: " + revolver.getPosicionAgua());

    }

    /**
     * devuelve true si la posición del agua coincide con la posición actual
     */
    public boolean mojar() {

        return revolver.getPosicionActual() == revolver.getPosicionAgua();

    }

    /**
     * cambia a la siguiente posición del tambor
     */
    public void siguenteChorro() {

        revolver.setPosicionActual(revolver.getPosicionActual() + 1);

        if (revolver.getPosicionActual() > 6) {
            revolver.setPosicionActual(1);
        }

    }
}
