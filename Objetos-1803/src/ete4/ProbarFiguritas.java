/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete4;
import java.util.ArrayList;
import javax.swing.UIManager;
/**
 *
 * @author T-101
 */
public class ProbarFiguritas {
    public static void main(String[] args) {
     Circulo circulo=  new Circulo(3);
     Triangulo triangulo= new Triangulo(2,3);
     Cuadrado cuadrado= new Cuadrado(2);
     
     ArrayList<Figura> figuras=new ArrayList<>();
     figuras.add(circulo);
     figuras.add(triangulo);
     figuras.add(cuadrado);
     
     for(Figura x:figuras){
         String s=(x.getClass().toString());
         System.out.println("Calculos de la figura "+s.substring(11));
         System.out.println("Area: "+x.area());
         System.out.println("Perimetro: "+x.perimetro());
     }
    }
}
