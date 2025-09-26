package prog2_tp5;

public class ClienteRestorant {
    private String nombre;
    private String telefono;

    public ClienteRestorant(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return nombre + " (Tel: " + telefono + ")";
    }
}
