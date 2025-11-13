package prog2_tp8.pt1;

public class Prog2_TP8_Pt1 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana López", "ana@mail.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 2000));
        pedido.agregarProducto(new Producto("Teclado", 4500));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        pedido.cambiarEstado("Enviado");

        IPagoConDescuento pago = new TarjetaCredito("Ana López");
        double descuento = pedido.calcularTotal() * pago.aplicarDescuento(10);
        double totalConDescuento = pedido.calcularTotal() - descuento;

        pago.procesarPago(totalConDescuento);
    }

}
