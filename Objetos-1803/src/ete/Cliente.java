/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

/**
 *
 * @author T-101
 */
public class Cliente {

    private String nombre;
    private Tarjeta tarjeta;

    public Cliente(String nombre1, Tarjeta tarjeta1) {
        this.nombre = nombre1;
        this.tarjeta = tarjeta1;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tarjeta=" + tarjeta + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

}
