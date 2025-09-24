package prog2_tp3;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    //constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion);
    }
    
    //metodo setter para validar que la calificacion sea entre 0 y 10
    private void setCalificacion(double calificacion){
        if (calificacion < 0) {
            this.calificacion = 0;
        } else if (calificacion > 10) {
            this.calificacion = 10;
        } else {
            this.calificacion = calificacion;
        }
    }
    
    //metodo para mostrar informacion del estudiante
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println();
    }
    
    public void subirCalificacion(double puntos){
        setCalificacion(this.calificacion + puntos);
        System.out.println("Calificación aumentada en " + puntos + " puntos.");
        System.out.println("Calificación actual: " + this.calificacion);
        System.out.println();

    }
    
    public void bajarCalificacion(double puntos){
        setCalificacion(this.calificacion - puntos);
        System.out.println("Calificación disminuida en " + puntos + " puntos.");
        System.out.println("Calificación actual: " + this.calificacion);
        System.out.println();

    }
}
