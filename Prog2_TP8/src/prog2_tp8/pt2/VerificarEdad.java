package prog2_tp8.pt2;

public class VerificarEdad {

    public static void verificarEdad(int edad) throws InvalidAgeException {
        if (edad < 0 || edad > 120) {
            throw new InvalidAgeException("Edad inválida: " + edad);
        } else {
            System.out.println("Edad válida: " + edad);
        }
    }
}
