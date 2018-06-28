/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete3;

import java.util.ArrayList;

/**
 *
 * @author Gus
 */
public class GeneradorTarjetas {
    private ArrayList<Cliente> clientes;
    
     public GeneradorTarjetas() {  
         
    clientes= new ArrayList<>();
    
    Tarjeta t1=new Tarjeta (1234,"Banamex",32000);
    Tarjeta t2= new Tarjeta(5678,"HSBC",17500);
    Tarjeta t3=new Tarjeta(8765,"Scotia",19600);
    Tarjeta t4=new Tarjeta(4321,"Banamex",48000);

   
    
    Cliente c1=new Cliente("Juan",t1);
    Cliente c2= new Cliente("Ana",t2);
    Cliente c3=new Cliente("Pedro",t3);
    Cliente c4= new Cliente ("Irma",t4);
    
    clientes.add(c1);
    clientes.add(c2);
    clientes.add(c3);
    clientes.add(c4);
    }
    
     public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
            
}
