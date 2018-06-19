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
        
        Cliente c=new Cliente();
        c.setEdad(20);
        c.setNombre("Gustavo");
        c.setSueldo(2000);
        
        PersistenciaUsuario.guardar(c);
        System.out.println("Guardado con exito!!!");
    }
}
