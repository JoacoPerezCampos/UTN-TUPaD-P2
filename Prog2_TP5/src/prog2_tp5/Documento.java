package prog2_tp5;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    
    public Documento(String titulo, String contenido, String codigoHash, String fecha, UsuarioDoc usuarioDoc) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuarioDoc);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        return "Documento: " + titulo + " | Firma: " + firma.getCodigoHash();
    }
}
