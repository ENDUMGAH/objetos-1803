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
public class Triangulo implements Figura{
    private     
    float base;
    float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return(float)((this.altura*this.base)/2);
    }

    @Override
    public float perimetro() {
        return (float)(this.base*3);
    }

    public Triangulo() {
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
