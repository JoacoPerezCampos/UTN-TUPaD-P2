package prog2_tp6_ej3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Sincroniza el curso -> profesor
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this); // sincroniza el otro lado
            }
        }
    }

    public void eliminarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            cursos.remove(curso);
            if (curso.getProfesor() == this) {
                curso.setProfesor(null); // rompe el vínculo
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso curso : cursos) {
            System.out.println(" - " + curso.getCodigo() + ": " + curso.getNombre());
        }
        System.out.println();
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id
                + " | Especialidad: " + especialidad
                + " | Cursos dictados: " + cursos.size());
    }
}
