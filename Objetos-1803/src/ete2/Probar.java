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
public class Probar { 
    public static void main(String[] args) {
        for(Cliente p:new GeneradorTarjetas().getGenerador()){
            System.out.println(p);
        }
    }
}
