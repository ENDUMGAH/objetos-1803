/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete2;

/**
 *
 * @author Gus
 */
public class Tarjeta {
    private int numero2;
    private String nombre2;
    private float saldo2;
    
    @Override
    public String toString() {
        return "Tarjeta{" + "nombre2=" + nombre2 + ", numero2=" + numero2 + ", saldo2=" + saldo2 + '}';
    }

    public Tarjeta(String nombre2, int numero2, float saldo2) {
        
        this.numero2 = numero2;
        this.nombre2 = nombre2;
        this.saldo2 = saldo2;
    }

    public Tarjeta() {
    }
    
    public Tarjeta(String nombre2, int numero2) {
        this.numero2 = numero2;
        this.nombre2 = nombre2;
        
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public float getSaldo2() {
        return saldo2;
    }

    public void setSaldo2(float saldo2) {
        this.saldo2 = saldo2;
    }

    
}


