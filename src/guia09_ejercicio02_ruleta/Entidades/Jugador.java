/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ejercicio02_ruleta.Entidades;

/**
 *
 * @author nueveonce
 */
public class Jugador {
    private Integer id;
    private String nombre; //nombre  + id
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, Boolean mojado) {
        this.id = id+1;
        this.nombre = nombre + " " + id;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
