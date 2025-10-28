package prog2_tp7;

public class Vaca extends Animal {

    public Vaca(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau!");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println(nombre + " es una vaca");
    }
}
