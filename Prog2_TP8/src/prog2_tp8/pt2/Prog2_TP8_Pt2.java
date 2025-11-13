package prog2_tp8.pt2;

import java.util.Scanner;

public class Prog2_TP8_Pt2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 1 División segura
            System.out.println("-- DIVISIÓN SEGURA --");
            DivisionSegura division = new DivisionSegura();
            System.out.print("Ingrese el numerador: ");
            int a = sc.nextInt();
            System.out.print("Ingrese el denominador: ");
            int b = sc.nextInt();
            int resultado = division.dividir(a, b);
            System.out.println("Resultado: " + resultado);
            System.out.println();
            sc.nextLine(); // limpiar buffer

            // 2 Conversión de cadena a número
            System.out.println("-- CONVERSIÓN DE CADENA A NÚMERO --");
            ConversionCadenaANumero conversor = new ConversionCadenaANumero();
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();
            int numero = conversor.convertirTextoANumero(texto);
            System.out.println("Número convertido: " + numero);
            System.out.println();

            // 3 Lectura de archivo
            System.out.println("-- LECTURA DE ARCHIVO --");
            LectorArchivo lector = new LectorArchivo();
            System.out.print("Ingrese la ruta del archivo a leer: ");
            String ruta = sc.nextLine();
            lector.leerArchivo(ruta);
            System.out.println();

            // 4 Excepción personalizada: Edad inválida
            System.out.println("-- VERIFICACIÓN DE EDAD --");
            System.out.print("Ingrese una edad: ");
            int edad = sc.nextInt();
            try {
                VerificarEdad.verificarEdad(edad);
            } catch (InvalidAgeException e) {
                System.out.println("Error capturado: " + e.getMessage());
            }
            System.out.println();
            sc.nextLine(); // limpiar buffer

            // 5 Try-with-resources
            System.out.println("-- TRY-WITH-RESOURCES --");
            System.out.print("Ingrese la ruta del archivo a leer con try-with-resources: ");
            String ruta2 = sc.nextLine();
            TryWithResourcesEjemplo.leerArchivo(ruta2);
        }

        System.out.println("\n-- FIN DE LOS EJERCICIOS --");
    }
}
