package prog2_tp7;

public class Animal {
    protected String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public void hacerSonido(){
        System.out.println("Sonido genérico de un animal");
    }
    
    public void describirAnimal(){
        System.out.println(nombre + " es un animal genérico");
    }
}
