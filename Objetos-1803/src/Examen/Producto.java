/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author T-101
 */
public class Producto {
    private String nombre;
    private int unidades;
    private float costo;

    public Producto() {
    }
    
    public Producto(String nombre, int unidades, float costo){
        this.nombre=nombre;
        this.unidades=unidades;
        this.costo=costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
