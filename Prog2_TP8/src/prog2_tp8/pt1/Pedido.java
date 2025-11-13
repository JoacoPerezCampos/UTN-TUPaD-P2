package prog2_tp8.pt1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements IPagable {
    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambio("El pedido cambió de estado a: " + nuevoEstado);
    }

    public String getEstado() {
        return estado;
    }
}
