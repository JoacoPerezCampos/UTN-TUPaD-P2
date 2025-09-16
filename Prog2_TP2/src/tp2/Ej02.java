package tp2;

import java.util.Scanner;

public class Ej02 {

    public static void mayorDeTres(Scanner sc) {
        double mayor = Double.MIN_VALUE;
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingrese un número:");
            double num = sc.nextDouble();
            if (mayor < num) {
                mayor = num;
            }
            sc.nextLine();
        }
        System.out.println("El número mayor ingresado es: " + mayor + "\n");
    }
}
