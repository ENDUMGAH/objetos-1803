/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author T-101
 */
public class ProbarOrdenamientos {

    public static void main(String[] args) {
        Set<Integer> enteros = new LinkedHashSet<>();
        System.out.println("Aleatorios");
        Set<Integer> valores = new LinkedHashSet<>();
        while (valores.size() < 4) {
            Random r = new Random();
            int valor = r.nextInt(4);
            valores.add(valor);
        }
        System.out.println(valores);
    }
}
