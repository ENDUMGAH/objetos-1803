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
public class Usuario {
    private float peso;
    private float altura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Usuario() {
    }

    public Usuario(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Usuario(float peso) {
        this.peso = peso;
    }
}
