
package tp2;


public class Ej08 {
    public static double calcularPrecioFinal(double precio, double impuesto, double descuento){
        double impuestoDecimal = impuesto /100;
        double decuentoDecimal = descuento /100;
        
        double precioFinal = precio + (precio * impuestoDecimal) - (precio * decuentoDecimal);
        return precioFinal;
    }
}
