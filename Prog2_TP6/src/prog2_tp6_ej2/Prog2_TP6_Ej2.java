package prog2_tp6_ej2;

public class Prog2_TP6_Ej2 {

    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "Julio Cortázar", "Argentina");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chilena");

        // Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "El Amor en los Tiempos del Cólera", 1985, a1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, a2);
        biblioteca.agregarLibro("ISBN004", "La Casa de los Espíritus", 1982, a3);
        biblioteca.agregarLibro("ISBN005", "De Amor y de Sombra", 1984, a3);

        // Listar todos los libros
        biblioteca.listarLibros();

        // Buscar libro por ISBN
        System.out.println("\n--- BUSCAR LIBRO POR ISBN (ISBN003) ---");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro solicitado.");
        }
        
        // Filtrar libros por año
        biblioteca.filtrarLibrosPorAnio(1984);

        // Eliminar un libro
        System.out.println("\n--- ELIMINAR LIBRO (ISBN002) ---");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // Mostrar cantidad de libros
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
