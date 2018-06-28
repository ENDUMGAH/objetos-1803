/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorTarjetas {

    private ArrayList<Cliente> Lista;

    public GeneradorTarjetas() {
        
        Lista=new ArrayList<>();
        
        Tarjeta T1 = new Tarjeta(1234, "Banamex", 3200);
        Tarjeta T2 = new Tarjeta(5678, "HSBC", 17500);
        Tarjeta T3 = new Tarjeta(8765, "Scotia", 19600);
        Tarjeta T4 = new Tarjeta(4321, "Banamex", 48000);

        Cliente c1 = new Cliente("Juan", T1);
        Cliente c2 = new Cliente("Ana", T2);
        Cliente c3 = new Cliente("Pedro", T3);
        Cliente c4 = new Cliente("Irma", T4);
        
        
        Lista.add(c1);
        Lista.add(c2);
        Lista.add(c3);
        Lista.add(c4);
        
        
    }

    public ArrayList<Cliente> getCliente() {
        return Lista;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.Lista = Lista;
    }
    
    
    
}
