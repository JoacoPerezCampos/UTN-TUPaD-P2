package prog2_tp3;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    //Constructores
    public Gallina(int idGallina){
        this(idGallina, 0,0);
    }
    
    public Gallina(int idGallina, int edad){
        this(idGallina, edad, 0);
    }
    
    public Gallina(int idGallina, int edad, int huevosPuestos){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    // Métodos
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo.");
    }

    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " cumplió un año más. Edad: " + edad);
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " -> Edad: " + edad + " años, Huevos puestos: " + huevosPuestos);
    }
}
