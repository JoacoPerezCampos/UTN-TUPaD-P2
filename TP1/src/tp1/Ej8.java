package tp1;

import java.util.Scanner;

public class Ej8 {
    public static int SolicitarEntero(Scanner sc){
        //Solicitar datos
        System.out.print("Ingrese número entero: ");
        int num = sc.nextInt();
        return num;

    }
    public static String DividirEnteros(int num1, int num2){
       int resultado = num1 / num2;
       return "División entera\n" + num1 + " / " + num2 + " = " + resultado ;
    }
    public static String DividirDobles(double num1, double num2){
       double resultado = num1 / num2;
       return "División con decimales\n" + num1 + " / " + num2 + " = " + resultado ;
    }
}   
