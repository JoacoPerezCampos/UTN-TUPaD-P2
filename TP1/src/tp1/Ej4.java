package tp1;

import java.util.Scanner;

public class Ej4 {

    public static void PedirYMostrarDatos(Scanner sc) {
        //Solicitar datos
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        //Mostrar datos ingresados
        System.out.println("--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre + ".");
        System.out.println("Edad: " + edad + "años.\n");
    }
}
