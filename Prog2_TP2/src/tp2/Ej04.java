
package tp2;

import java.util.Scanner;

public class Ej04 {
    public static void calcularDescuento(Scanner sc){
        System.out.print("Ingrese el precio del producto: $ ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese la categoría de descuento: (A,B o C) ");
        String descuento = sc.nextLine();
        switch (descuento.toLowerCase()){
            case "a":
                System.out.println("Descuento aplicado: 10%\nPrecio Final: $"+ precio*0.9+"\n");
                break;
            case "b":
                System.out.println("Descuento aplicado: 15%\nPrecio Final: $"+ precio*0.85+"\n");
                break;
            case "c":
                System.out.println("Descuento aplicado: 20%\nPrecio Final: $"+ precio*0.8+"\n");
                break;
            default:
                System.out.println("Tipo de descuento erroneo\n");
        }
        

    }
}
