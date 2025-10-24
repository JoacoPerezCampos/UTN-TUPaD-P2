package prog2_tp6_ej3;

public class Prog2_TP6_Ej3 {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        // Crear profesores
        Profesor p1 = new Profesor("P001", "Laura Gómez", "Matemáticas");
        Profesor p2 = new Profesor("P002", "Carlos López", "Programación");
        Profesor p3 = new Profesor("P003", "María Pérez", "Inglés");

        // Agregar profesores a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        // Crear cursos
        Curso c1 = new Curso("C101", "Probabilidad y Estadística");
        Curso c2 = new Curso("C102", "Programación II");
        Curso c3 = new Curso("C103", "Arquitectura y Sistemas Operativos");
        Curso c4 = new Curso("C104", "Bases de Datos");
        Curso c5 = new Curso("C105", "Org. Empresarial");

        // Agregar cursos
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores
        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C104", "P002");
        uni.asignarProfesorACurso("C103", "P003");

        // Listar profesores y cursos
        uni.listarProfesores();
        uni.listarCursos();

        // Cambiar profesor de un curso
        System.out.println("\n--- Cambio de profesor en 'Probabilidad y Estadística' ---");
        uni.asignarProfesorACurso("C101", "P002");

        // Verificar sincronización
        uni.listarProfesores();
        uni.listarCursos();

        // Eliminar un curso
        System.out.println("\n--- Eliminando curso 'Org. Empresarial' ---");
        uni.eliminarCurso("C105");
        uni.listarCursos();

        // Eliminar un profesor
        System.out.println("\n--- Eliminando profesor 'María Pérez' ---");
        uni.eliminarProfesor("P003");
        uni.listarProfesores();
        uni.listarCursos();

        // Reporte final
        uni.reporteCursosPorProfesor();
    }
}

