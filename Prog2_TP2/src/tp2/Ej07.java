package tp2;

import java.util.Scanner;

public class Ej07 {

    public static boolean esNotaValida(int nota) {
        boolean esNotaValida = true;
        if (nota < 0 || nota > 10) {
            esNotaValida = false;
        }
        return esNotaValida;
    }

    public static void ValidarNota(Scanner sc) {
        int nota;
        do {
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = sc.nextInt();
            if (!esNotaValida(nota)) {
                System.out.println("Error: Nota Invalida. Intente de nuevo.");
            }
        } while (!esNotaValida(nota));

        System.out.println("Nota guardada correctamente.");

    }
}
