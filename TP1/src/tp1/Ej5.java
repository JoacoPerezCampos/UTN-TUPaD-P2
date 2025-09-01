package tp1;

import java.util.Scanner;

public class Ej5 {

    public static void SolicitarEnterosYOperarlos(Scanner sc) {

        //Solicitar datos
        System.out.print("Ingrese un número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese otro número entero: ");
        int num2 = sc.nextInt();

        //Mostrar operaciones y resultados
        System.out.println("--- Operaciones con " + num1 + " y " + num2 + " ---");
        System.out.println(" Suma \n" + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Resta \n" + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplicación \n" + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("División \n" + num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
