package prog2_tp5;


public class Bateria {
    private String modelo;
    private int capacidad; // mAh

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }

    @Override
    public String toString() {
        return "Batería " + modelo + " - " + capacidad + "mAh";
    }
}
