package prog2_tp5;

public class ClaveSeguridad {

    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "Clave: " + codigo + " (Última modificación: " + ultimaModificacion + ")";
    }
}
