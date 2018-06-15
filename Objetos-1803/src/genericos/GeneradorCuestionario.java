/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorCuestionario {

    private Cuestionario cuestionario;

    public GeneradorCuestionario() {
        cuestionario = new Cuestionario();
        Opcion o11=new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);
        
        Opcion o12=new Opcion();
        o12.setTitulo("Texcoco");
        o12.setCorrecta(false);
        
        Opcion o13=new Opcion();
        o13.setTitulo("Madrid");
        o13.setCorrecta(true);
       
        Opcion o14=new Opcion();
        o14.setTitulo("Ecatepec");
        o14.setCorrecta(false);
        
        //Sigue la pregunta
        
        Pregunta p1=new Pregunta();
        p1.setTitulo("¿Cual es la capital de España?");
        //Antes generamos el ArrayList con las opciones de arriba
        ArrayList<Opcion> opcionesp1=new ArrayList<>();
        opcionesp1.add (o11);
        opcionesp1.add (o12);
        opcionesp1.add (o13);
        opcionesp1.add (o14);
        
        //Ahora agregamos este ArrayList a la primer pregunta 
        p1.setOpcion(opcionesp1);
        
        
        
       
        
        //Ahora haremos el cuestionario
       
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add (p1);
        cuestionario.setPregunta(preguntas);
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }

}
