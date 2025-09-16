
package tp2;

import java.util.Scanner;

public class Ej03 {
    public static void clasificarEdad(Scanner sc){
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad < 12){
            System.out.println("Eres niño/a\n");
        }else if (edad >= 12 && edad < 18){
            System.out.println("Eres adolescente\n");
        }else if (edad >= 18 && edad < 60){
            System.out.println("Eres adulto/a\n");
        }else if (edad >= 60){
            System.out.println("Eres adulto/a mayor\n");
        }
    }
}
