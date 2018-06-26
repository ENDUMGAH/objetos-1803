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
public class Tarjeta {

    private int num;
    private String nombre;
    private float saldo;

    @Override
    public String toString() {
        return "Tarjeta{" + "num=" + num + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }

    public Tarjeta(int num, String nombre, float saldo) {
        this.num = num;
        this.nombre = nombre;
        this.saldo = saldo;

    }

    public Tarjeta() {
    }

    public Tarjeta(int num3, String nombre3) {
        this.nombre = nombre3;
        this.num = num3;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
