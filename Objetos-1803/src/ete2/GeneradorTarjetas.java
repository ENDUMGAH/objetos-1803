package ete2;

import ete.Tarjeta;
import java.util.ArrayList;

public class GeneradorTarjetas {

    private ArrayList<Cliente> generador;

    public GeneradorTarjetas() {
        generador = new ArrayList<>();
        Tarjeta T1=new Tarjeta(1234,"Banamex",32000);
        Tarjeta T2=new Tarjeta(5678,"HSBC",17500);
        Tarjeta T3=new Tarjeta(8765,"Scotia",19600);
        Tarjeta T4=new Tarjeta(4321,"Bancomer",48000);

        Cliente C1 = new Cliente("Juan", T1 );
        Cliente C2 = new Cliente("Ana", T2);
        Cliente C3 = new Cliente("Pedro", T3);
        Cliente C4 = new Cliente("Irma", T4);

        generador.add(C1);
        generador.add(C2);
        generador.add(C3);
        generador.add(C4);

    }

    public ArrayList<Cliente> getGenerador() {
        return generador;
    }

    public void setGenerador(ArrayList<Cliente> generador) {
        this.generador = generador;
    }

}
