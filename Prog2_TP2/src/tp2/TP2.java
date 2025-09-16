package tp2;

import java.util.Scanner;

public class TP2 {

    public static void main(String[] args) {
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        Ej01.verificarBisiesto(sc);

        // Ejercicio 2
        Ej02.mayorDeTres(sc);

        // Ejercicio 3
        Ej03.clasificarEdad(sc);

        // Ejercicio 4
        Ej04.calcularDescuento(sc);

        // Ejercicio 5
        Ej05.SumarParesWhile(sc);

        // Ejercicio 6
        Ej06.ContadorPositivosNegativosYCeros(sc);

        // Ejercicio 7
        Ej07.ValidarNota(sc);

        // Ejercicio 8
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto (ej. 10 para 10%):");
        double impuesto = sc.nextDouble();

        System.out.print("Ingrese el descuento (ej. 5 para 5%):");
        double descuento = sc.nextDouble();

        double precioFinal = Ej08.calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.printf("El precio final del producto es: $ %.2f%n", precioFinal);

        // Ejercicio 9
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = sc.nextDouble();

        sc.nextLine();
        System.out.print("Ingrese la zona del envío:\n1 - Nacional\n2 - Internacional \n");
        int zona = sc.nextInt();

        double costoEnvio = Ej09.calcularCostoEnvio(peso, zona);
        double total = Ej09.calcularTotalCompra(precioProducto, costoEnvio);

        System.out.printf("El costo de envío es: $ %.2f%n ", costoEnvio);
        System.out.printf("El total a pagar es: $ %.2f%n", total);
        System.out.println();

        // Ejercicio 10
        System.out.print("Ingrese el stock actual: ");
        int stockActual = sc.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = sc.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = sc.nextInt();

        int nuevoStock = Ej10.actualizarStock(stockActual, cantVendida, cantRecibida);
        System.out.print("El nuevo stock es: " + nuevoStock);
        System.out.println();

        // Ejercicio 11
        System.out.print("Ingrese el precio del producto: $ ");
        double precio = sc.nextDouble();

        Ej11.calcularDescuentoEspecial(precio);;
        System.out.println();

        // Ejercicio 12
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        Ej12.mostrarPrecios(precios, 0);
        System.out.println();

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        Ej12.mostrarPrecios(precios, 0);
        System.out.println();

        // Ejercicio 13
        precios[2] = 149.75;

        System.out.println("Precios originales:");
        Ej13.mostrarPrecios(precios, 0);
        System.out.println();
        
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        Ej13.mostrarPrecios(precios, 0);
        System.out.println();
        
        sc.close();
    }
}
