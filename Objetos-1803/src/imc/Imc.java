/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author T-202
 */
public class Imc {

    private Usuario usuario;
    
    public Usuario getUsuario(){
        
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getImc() {
        float Imc = usuario.getPeso() / (usuario.getAltura() * usuario.getAltura());
        String resultado;

        if (Imc < 20) {
            resultado = Imc + ", anemia";
        } else if (Imc >= 20 && Imc < 25) {
            resultado = Imc + ", ideal";
        } else {
            resultado = Imc + ", sobrepeso";
        }

        return resultado;
    }
}
