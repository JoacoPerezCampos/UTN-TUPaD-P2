package prog2_tp5;

public class Reserva {

    private String fecha;
    private String hora;
    private ClienteRestorant clienteRestorant; // Asociación unidireccional
    private Mesa mesa;       // Agregación

    public Reserva(String fecha, String hora, ClienteRestorant clienteRestorant, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.clienteRestorant = clienteRestorant;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public ClienteRestorant getClienteRestorant() {
        return clienteRestorant;
    }

    public Mesa getMesa() {
        return mesa;
    }

    @Override
    public String toString() {
        return "Reserva para " + clienteRestorant.getNombre() + " el " + fecha + " a las " + hora
                + " en la Mesa Nº " + mesa.getNumero();
    }
}
