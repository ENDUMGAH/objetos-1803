/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.util.ArrayList;
import javax.swing.UIManager;

/**
 *
 * @author T-101
 */
public class ProbarCliente {
    public static void main(String[] args) {
        
        for(Cliente g:new GeneradorTarjetas().getCliente()){
       
            System.out.println(g);
        }
   
    }
}
