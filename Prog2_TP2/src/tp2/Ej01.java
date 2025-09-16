package tp2;

import java.util.Scanner;

public class Ej01 {

    public static boolean esBisiesto(int ano) {
        boolean esBisiesto = false;
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            esBisiesto = true;
        }
        return esBisiesto;
    }

    public static void verificarBisiesto(Scanner sc) {
        System.out.print("Ingrese un año: ");
        int num = sc.nextInt();
        if (esBisiesto(num)) {
            System.out.println("El año " + num + " es bisiesto\n");
        } else {
            System.out.println("El año " + num + " no es bisiesto\n");
        }
    }

}
