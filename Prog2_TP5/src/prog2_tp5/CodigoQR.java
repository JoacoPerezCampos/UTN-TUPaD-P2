package prog2_tp5;

public class CodigoQR {

    private String valor;
    private UsuarioQR usuarioQR; // Asociación unidireccional

    public CodigoQR(String valor, UsuarioQR usuarioQR) {
        this.valor = valor;
        this.usuarioQR = usuarioQR;
    }

    public String getValor() {
        return valor;
    }

    public UsuarioQR getUsuarioQR() {
        return usuarioQR;
    }

    @Override
    public String toString() {
        return "Código QR [" + valor + "] para " + usuarioQR.getNombre();
    }
}
