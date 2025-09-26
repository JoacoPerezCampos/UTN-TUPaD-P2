package prog2_tp4;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    private static int ultimaID = 1;

    //Constructores
    public Empleado() {
        this("Desconocido", "Desconocido", 500000);
    }

    public Empleado(String nombre, String puesto) {
        this(nombre, puesto, 500000);
    }

    public Empleado(String nombre, String puesto, double salario) {
        this.id = ultimaID;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        ultimaID++;
    }

    //Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Empleado: " + nombre + " " + "\nID: " + id
                + "\nPuesto: " + puesto + "\nSalario: $" + salario + "\n";
    }

    // Métodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // Método mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
