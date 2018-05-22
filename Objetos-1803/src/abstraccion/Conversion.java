package abstraccion;

public class Conversion {

    private Grados grados;

    public float CentigradosAFarenheit() {
        //este metodo tiene logica

        float resultado = (float) (grados.getCentigrados() * 1.8 + 32);
        return resultado;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }

    //Longitudes
    private Longitudes longitudes;

    public float MetrosAPies() {
        //este metodo tiene logica

        float resultado = (float) (longitudes.getMetros() * 3.28);
        return resultado;
    }

    public Longitudes getLongitudes() {
        return longitudes;
    }

    public void setLongitudes(Longitudes longitudes) {
        this.longitudes = longitudes;
    }
}
