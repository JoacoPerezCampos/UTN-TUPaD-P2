package prog2_tp7;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
