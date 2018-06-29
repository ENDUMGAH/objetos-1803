/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author T-101
 */
public class Tarea {
    boolean completada;
    String nombreDeTarea;
    int duracion;
    
   public Tarea(){}
   
   public Tarea(boolean compleatada, String nombreDeTarea, int duracion){
   this.completada= completada;
   this.duracion=duracion;
   this.nombreDeTarea=nombreDeTarea;
   }

    @Override
    public String toString() {
        return "Tarea{" + "completada=" + completada + ", nombreDeTarea=" + nombreDeTarea + ", duracion=" + duracion + '}';
    }

   public Tarea(int duracion){
       this.duracion=duracion;
   }
   
    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getNombreDeTarea() {
        return nombreDeTarea;
    }

    public void setNombreDeTarea(String nombreDeTarea) {
        this.nombreDeTarea = nombreDeTarea;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
}
