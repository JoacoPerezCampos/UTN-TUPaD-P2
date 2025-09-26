package prog2_tp5;


public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;     
    private Usuario usuario;     
    
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;   // Se inyecta una batería externa
        this.usuario = usuario;
        usuario.setCelular(this); // Asociación bidireccional
    }

    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }

    @Override
    public String toString() {
        return "Celular " + marca + " " + modelo + " (IMEI: " + imei + ")";
    }
}

