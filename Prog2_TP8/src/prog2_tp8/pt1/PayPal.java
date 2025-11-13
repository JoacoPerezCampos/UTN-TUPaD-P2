package prog2_tp8.pt1;

public class PayPal implements IPago {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado vía PayPal desde " + email + " por $" + monto);
    }
}
