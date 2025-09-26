package prog2_tp5;

public class TitularCuenta {

    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Asociación bidireccional

    public TitularCuenta(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
}
