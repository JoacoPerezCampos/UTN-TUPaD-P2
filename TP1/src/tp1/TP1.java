package tp1;

import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        // Ejercicio 2
        Ej2.saludo(args);
                
        // Ejercicio 3
        String nombre = "Joaquin";
        int edad = 34;
        double altura = 1.74;
        boolean estudiante = true;
        
        Ej3.mostrarDatos(nombre, edad, altura, estudiante);

        // Ejercicio 4
        Ej4.PedirYMostrarDatos(sc);

        // Ejercicio 5
        Ej5.SolicitarEnterosYOperarlos(sc);

        // Ejercicio 6
        Ej6.MostrarMensaje();

        // Ejercicio 8
        int num1 = Ej8.SolicitarEntero(sc);
        int num2 = Ej8.SolicitarEntero(sc);
        System.out.println(Ej8.DividirEnteros(num1, num2));
        System.out.println(Ej8.DividirDobles(Double.valueOf(num1), Double.valueOf(num2)));
        
        // Ejercicio 9
        Ej9.main(sc);
       
        // Ejercicio 10
        Ej10.main(args);

        //Cerrar Scanner
        sc.close();
    }
}
