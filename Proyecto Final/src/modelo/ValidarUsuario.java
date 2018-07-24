/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author T-101
 */
public class ValidarUsuario {
    
    public static void autenticar (Usuario u)
            throws UsuarioNoValidaException{
        if(!u.getLogin().equals("Gustavo")&&!u.getPassword().equals("13617498"))
            throw new UsuarioNoValidaException();
            
    }
    
}
