package prog2_tp5;


public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        double totalConRecargo = monto * 1.21; // Ejemplo: IVA 21%
        System.out.println("Calculando impuesto: " + impuesto);
        System.out.println("Monto con IVA: $" + totalConRecargo);
    }
}
