package prog2_tp7;

abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
    
    public void mostrarArea(){
        System.out.println("Area del " + nombre + " = " + calcularArea());
    }
}

