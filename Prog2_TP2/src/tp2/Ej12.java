package tp2;

public class Ej12 {
    
    public static void mostrarPrecios(double[] precios, int indice){
        if(indice < precios.length){
            System.out.println("Precio: $" + precios[indice]);
            mostrarPrecios(precios, indice + 1);
        }
    }
}
