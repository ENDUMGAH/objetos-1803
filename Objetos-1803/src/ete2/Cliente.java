/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete2;

import ete.Tarjeta;

/**
 *
 * @author Gus
 */
public class Cliente {
private String nombre2;
private Tarjeta tarjeta2;

public Cliente(){
}

public Cliente(String nombre2, Tarjeta tarjeta2){
this.nombre2= nombre2;
this.tarjeta2= tarjeta2;
}

    

    @Override
    public String toString() {
        return "Cliente{" + "nombre2=" + nombre2 + ", tarjeta2=" + tarjeta2 + '}';
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public Tarjeta getTarjeta2() {
        return tarjeta2;
    }

    public void setTarjeta2(Tarjeta tarjeta2) {
        this.tarjeta2 = tarjeta2;
    }


   
    
}
