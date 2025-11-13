package prog2_tp8.pt2;

public class ConversionCadenaANumero implements IConvertidor {

    @Override
    public int convertirTextoANumero(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada inválida, no es un número entero.");
            return 0;
        }
    }
}
