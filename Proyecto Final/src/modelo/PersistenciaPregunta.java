/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

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
        FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Pregunta> preguntas = (ArrayList<Pregunta>)ois.readObject();
        return preguntas;
        
    }
    public static void borrar(int num)throws Exception{
    num-=1;
    ArrayList<Pregunta> preguntas= new ArrayList<>();
    File file=new File("Cuestionario.yo");
    preguntas=leer();
    preguntas.remove(num);
    FileOutputStream fos=new FileOutputStream(file);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(oos);
    oos.close();
    
    }
        
    }

}
