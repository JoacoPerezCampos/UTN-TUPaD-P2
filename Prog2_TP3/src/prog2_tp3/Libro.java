package prog2_tp3;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    //Constructores
    public Libro() {
        this("Desconocido", "Desconocido", 0);
    }

    public Libro(String titulo) {
        this(titulo, "Desconocido", 0);
    }

    public Libro(String titulo, String autor) {
        this(titulo, autor, 0);
    }

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); 
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1377 && anioPublicacion <= 2025) { // validación básica
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año de publicación inválido: " + anioPublicacion);
        }
    }
    
    //Mostrar informacion
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}
