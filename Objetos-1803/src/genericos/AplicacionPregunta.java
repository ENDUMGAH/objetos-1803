/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;
import java.util.*;
/**
 *
 * @author T-101
 */
public class AplicacionPregunta {
    public static void main(String[] args) {
        //Geberamnos las opciones por que es lo mas independiente en las tablas
        
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
        
        
        //Pregunta 2
        
        Opcion o21=new Opcion();
        o21.setTitulo("11");
        o21.setCorrecta(true);
        
        Opcion o22=new Opcion();
        o22.setTitulo("22");
        o22.setCorrecta(false);
        
        Opcion o23=new Opcion();
        o23.setTitulo("40");
        o23.setCorrecta(false);
       
        Opcion o24=new Opcion();
        o24.setTitulo("3");
        o24.setCorrecta(false);
        
        //Sigue la pregunta
        
        Pregunta p2=new Pregunta();
        p2.setTitulo("¿Cuantos de futbol hay en la cancha (por equipo) ?");
        //Antes generamos el ArrayList con las opciones de arriba
        ArrayList<Opcion> opcionesp2=new ArrayList<>();
        opcionesp1.add (o21);
        opcionesp1.add (o22);
        opcionesp1.add (o23);
        opcionesp1.add (o24);
        
        //Ahora agregamos este ArrayList a la primer pregunta 
        p2.setOpcion(opcionesp2);
        
        
        
        
        
        
        
        
        
        //Ahora haremos el cuestionario
        
        Cuestionario c1=new Cuestionario();
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add (p1);
        preguntas.add(p2);
        c1.setPregunta(preguntas);
        
        for(Pregunta p:preguntas){
        
            System.out.println(p.getTitulo());
            for(Opcion o:p.getOpcion()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            
            }
                
        }
        
        
    }
}
