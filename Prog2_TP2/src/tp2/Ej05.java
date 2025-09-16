package tp2;

import java.util.Scanner;

public class Ej05 {

    public static boolean esPar(int num) {
        boolean esPar = false;
        if (num % 2 == 0) {
            esPar = true;
        }
        return esPar;
    }

    public static int SumarParesWhile(Scanner sc) {
        int num;
        int resultado = 0;
        System.out.print("Suma de números pares\nIngrese un número para comenzar: \n(Para terminar ingrese 0)\n");
        do {
            num = sc.nextInt();
            if (esPar(num)) {
                resultado += num;
            }
            System.out.print("Resultado = " + resultado + "\nIngrese el número siguiente: \n");
        } while (num != 0);

        System.out.print("La sumatoria de los números pares ingresados es igual a " + resultado + "\n");
        return resultado;
    }
}
