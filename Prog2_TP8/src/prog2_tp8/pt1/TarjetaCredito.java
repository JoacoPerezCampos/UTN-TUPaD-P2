package prog2_tp8.pt1;

public class TarjetaCredito implements IPagoConDescuento {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return porcentaje / 100;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de crédito a nombre de " + titular + " por $" + monto);
    }
}
