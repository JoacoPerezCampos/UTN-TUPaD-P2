package tp2;

import java.util.Scanner;

public class Ej06 {

    public static void ContadorPositivosNegativosYCeros(Scanner sc) {
        int num;
        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;
        System.out.println("Contador de Positivos, Negativos y Ceros");
        for (int i = 1; i < 11; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            num = sc.nextInt();
            if (num < 0) {
                contNegativos++;
            } else if (num > 0) {
                contPositivos++;
            } else {
                contCeros++;
            }
        }
        System.out.println("Resultados:\nPositivos: " + contPositivos
                + "\nNegativos: " + contNegativos + "\nCeros: " + contCeros
                + "\n");
    }
}
