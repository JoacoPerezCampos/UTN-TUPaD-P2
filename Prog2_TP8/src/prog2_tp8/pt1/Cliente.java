package prog2_tp8.pt1;

public class Cliente implements INotificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificarCambio(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
}
