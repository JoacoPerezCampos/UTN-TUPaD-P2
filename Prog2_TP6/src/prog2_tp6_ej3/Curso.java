package prog2_tp6_ej3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // relación bidireccional

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Sincroniza ambos lados
    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) return; // no hay cambio

        // Si tenía un profesor anterior, se quita del lado anterior
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }

        // Asignar nuevo profesor
        this.profesor = profesor;

        // Sincronizar desde el otro lado
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " | Código: " + codigo +
                " | Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }
}

