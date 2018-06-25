/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construc;

/**
 *
 * @author Gus
 */
public class Construc {
  
    private float peso;
    private float altura;

    public Construc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    
    public Construc()
    {}
    
    
    
    

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
}
