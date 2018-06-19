/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author T-101
 */
public class PersistenciaUsuario {
    public static void guardar (Cliente c)throws Exception{
        //Paso 1: generar el archivo dond ese va a guardar el serializado
        File file=new File("D://la.raza.enchilosa");
        //Si no existe lo genera y si ya existe lo sobreescribe
        
        //Paso 2: Indicar que lo vamos a generar para escribir en el
        FileOutputStream fos=new FileOutputStream(file);
        
        //Escribir un objeto en el
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
                
          
    }
    
}
