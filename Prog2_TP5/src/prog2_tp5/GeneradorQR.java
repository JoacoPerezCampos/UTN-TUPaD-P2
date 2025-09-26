package prog2_tp5;

public class GeneradorQR {
    public void generar(String valor, UsuarioQR usuarioQR) {
        CodigoQR codigo = new CodigoQR(valor, usuarioQR);
        System.out.println("Generado: " + codigo);
    }
}
