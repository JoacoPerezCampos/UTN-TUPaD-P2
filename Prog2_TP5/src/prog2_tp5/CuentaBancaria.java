package prog2_tp5;

public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private TitularCuenta titularCuenta;      // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion, TitularCuenta titularCuenta) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion); // Composición
        this.titularCuenta = titularCuenta;
        titularCuenta.setCuenta(this); // Enlazamos bidireccionalmente
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public TitularCuenta getTitularCuenta() {
        return titularCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta CBU: " + cbu + " | Saldo: $" + saldo + " | Titular: " + titularCuenta.getNombre();
    }
}
