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
      
        //Con esto mandamos a llamar el codigo que pusimos en GeneradorCuestionario
        GeneradorCuestionario generador=new GeneradorCuestionario();
        //
        for(Pregunta p:generador.getCuestionario().getPregunta()){
        
            System.out.println(p.getTitulo());
            for(Opcion o:p.getOpcion()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            
            }
                
        }
        
        
    }
}
