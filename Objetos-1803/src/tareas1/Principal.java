/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

/**
 *
 * @author T-101
 */
public class Principal {
    public static void main(String[] args) {
        Threadsito t1=new Threadsito();
        t1.setName("Pancho");
        Threadsito t2= new Threadsito();
        t2.setName("Panzon");
        Threadsito t3= new Threadsito();
        t3.setName("El carlitos");
        Threadsito t4= new Threadsito();
        t4.setName("El gus");
        Threadsito t5= new Threadsito();
        t5.setName("Juanito");
        
        Relojito r1=new Relojito();
        
        //E2
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        r1.start();
                
 
    }
           
}
