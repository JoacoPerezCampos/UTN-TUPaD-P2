package prog2_tp5;

public class FirmaDigital {

    private String codigoHash;
    private String fecha;
    private UsuarioDoc usuarioDoc; 

    public FirmaDigital(String codigoHash, String fecha, UsuarioDoc usuarioDoc) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuarioDoc = usuarioDoc;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public UsuarioDoc getUsuarioDoc() {
        return usuarioDoc;
    }

    @Override
    public String toString() {
        return "Firma: " + codigoHash + " (Fecha: " + fecha + ") - Usuario: " + usuarioDoc.getNombre();
    }
}
