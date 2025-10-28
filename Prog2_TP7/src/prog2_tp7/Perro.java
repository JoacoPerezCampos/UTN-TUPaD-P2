package prog2_tp7;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau!");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println(nombre + " es un perro");
    }
}
