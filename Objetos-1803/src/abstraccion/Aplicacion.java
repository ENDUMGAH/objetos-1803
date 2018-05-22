package abstraccion;

public class Aplicacion {

    public static void main(String[] arg) {
        Grados g = new Grados();
        //a este objeto le asignamos un valor a su atributo centigrados
        g.setCentigrados(20);
        //creamos un objeto de clase conversion

        Conversion c = new Conversion();
        c.setGrados(g);
        //Aplicar modelo
        
        System.out.println(c.CentigradosAFarenheit());
        Longitudes l = new Longitudes();
        //a este objeto le asignamos un valor a su atributo centigrados
        l.setMetros(0);
        //creamos un objeto de clase conversion
        c.setLongitudes(l);
        //Aplicar modelo
        
        System.out.println(c.MetrosAPies());
    }
}
