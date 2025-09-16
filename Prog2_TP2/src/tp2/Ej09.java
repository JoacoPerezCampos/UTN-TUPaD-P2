package tp2;

public class Ej09 {

    public static double calcularCostoEnvio(double peso, int zona) {
        double costoEnvio;

        switch (zona) {
            case 1 -> {
                System.out.print("Nacional: $5 por Kg.\n");
                costoEnvio = peso * 5;
            }

            case 2 -> {
                System.out.print("Internacional: $10 por Kg.\n");
                costoEnvio = peso * 10;
            }
                
            default -> {
                System.out.print("Zona Invalida\n");
                costoEnvio = 0;
            }
        }

        return costoEnvio;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
