
package excepciones;

public class SegundasExcepciones {
    public static void main(String[] args) {
     
        int a=2;
        int b=2;
        int arreglo[]={1,2};
        try{
        String numeroMalo="Cuatro";
        int numeroBueno=Integer.parseInt(numeroMalo);
        
        System.out.println(a/b);
        System.out.println(numeroBueno*2);
        System.out.println(arreglo[2]);
        
        }catch(Exception e){
            System.out.println("Veamos que excepcion ocurre "+e.getMessage());
        }
    }
}
