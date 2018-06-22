/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author T-101
 */
public class Aplicacion {
    public static void main(String[] args) throws Exception{
        //Esto es para leer
        for( Cliente c=PersistenciaUsuario.leer()){
        System.out.println("Vamos a checar el nombre "+c.getNombre());
        
       /*
       Cliente c=new Cliente();
       c.setNombre("kisha");
       c.setEdad(17);
       PersistenciaUsuario.guardar(c);
       */
        }
    }
}
