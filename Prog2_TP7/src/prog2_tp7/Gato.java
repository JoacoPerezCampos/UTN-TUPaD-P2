package prog2_tp7;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Miau!");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println(nombre + " es un gato");
    }
}

