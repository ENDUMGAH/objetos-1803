/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete4;

/**
 *
 * @author T-101
 */
public class Cuadrado implements Figura{
private float lado;
    
    @Override
    public float area() {
    return (float)(this.lado*this.lado);
    }

    @Override
    public float perimetro() {
        return (float)(this.lado*4);
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
}
