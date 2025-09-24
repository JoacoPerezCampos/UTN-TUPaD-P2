package prog2_tp3;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;

    //constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println();
    }
    
    public void cumplirAnios(){
        this.edad += 1;
    }
}
