/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete3;


public class Tarjeta {
    int num;
    String nombre;
    float saldo;

    @Override
    public String toString() {
        return "Tarjeta{" + "num=" + num + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }
    
    
    
    public Tarjeta(int num, String nombre,float saldo){
    this.nombre=nombre;
    this.num=num;
    this.saldo=saldo;
    } 
    
    public Tarjeta(){}
    
    public Tarjeta(int num, String nombre){
    this.num=num;
    this.nombre= nombre;
    }
    
}
