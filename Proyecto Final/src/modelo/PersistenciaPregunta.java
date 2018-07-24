/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class PersistenciaPregunta {
    public static void guardar (Pregunta p)throws Exception {
        ArrayList <Pregunta> preguntas= new ArrayList<>();
        File file= new File("Cuestionario.yo");
        
        if(file.exists())preguntas=leer();
        preguntas.add(p);
        
        FileOutputStream fos= new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);       
        oos.writeObject(preguntas);
        oos.close();     
    }
    public static ArrayList<Pregunta> leer()throws Exception{
    File file=new File("Cuestionario.yo");
        FileOutputStream fis= new FileOutputStream(file);
        ObjectOutputStream ois=new ObjectOutputStream(fis);
        ArrayList<Pregunta> preguntas = (ArrayList<Pregunta>)ois.readObject();
        return preguntas;
        
    }
}
