/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;
import java.util.*;
//Para mandar a llamar la paqueteria de ArrayList
/**
 *
 * @author T-101
 */
public class Cuestionario {
    private float resultado;
    private ArrayList<Pregunta> pregunta;

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public ArrayList<Pregunta> getPregunta() {
        return pregunta;
    }

    public void setPregunta(ArrayList<Pregunta> pregunta) {
        this.pregunta = pregunta;
    }
    
}
