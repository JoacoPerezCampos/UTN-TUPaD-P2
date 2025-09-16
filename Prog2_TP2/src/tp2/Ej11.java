package tp2;

public class Ej11 {
      
    public static double descuentoEspecial = 0.1;
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;
        
       System.out.printf("El descuento aplicado es: $ %.2f%n",  descuentoAplicado);
       System.out.printf("El precio final con descuento es: $ %.2f%n", precioFinal);
    }
}
