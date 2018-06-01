/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-101
 */
public class Arreglos1 {
    public static void main(String[] args) {
        int []valores={1,-20,4};
        //Corchetes es arreglo
        for(int i=0;i<valores.length;i++){
        //letgth se adapta al numero de valores, jamas se desborda
            System.out.println(valores[i]);
        
    }
        //Este ciclo for es el mejorado y se recomienda siempre
        for (int v:valores){
            System.out.println(v);
        }
    
        //Segunda forma para iniciar arreglos
        int otro[]=new int[4];
        
        for (int valor: otro){
        System.out.println(valor);
        }
    }
    
}
