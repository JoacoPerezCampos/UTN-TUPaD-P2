
package prog2_tp5;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // Composición: el pasaporte crea su foto
        this.foto = new Foto(imagen, formato);
        this.titular = titular;
        // Asociación bidireccional: el titular también sabe su pasaporte
        titular.setPasaporte(this);
    }

    public String getNumero() { return numero; }
    public String getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    @Override
    public String toString() {
        return "Pasaporte Nº " + numero + " emitido el " + fechaEmision +
               " | Titular: " + titular.getNombre();
    }
}
