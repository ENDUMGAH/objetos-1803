/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class TestTareas {
    ArrayList<Tarea>Test;
    public static void main(String[] args) {
        for(Tarea t:new TestTareas().Test){
            System.out.println(t);
        }
        }

    public TestTareas() {
        Test=new ArrayList<>();
        Tarea T=new Tarea(true,"Hacer el examen parcial",120);
        
        Test.add(T);
        
    }
        
        
    }

