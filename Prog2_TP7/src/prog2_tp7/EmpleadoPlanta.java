package prog2_tp7;

public class EmpleadoPlanta extends Empleado{
    private double sueldoMensual;
    
    public EmpleadoPlanta(String nombre, double sueldoMensual){
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    @Override
    public double calcularSueldo(){
        return sueldoMensual;
    }
}
