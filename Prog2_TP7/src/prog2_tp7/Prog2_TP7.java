package prog2_tp7;

import java.util.ArrayList;
import java.util.List;

public class Prog2_TP7 {

    public static void main(String[] args) {
        // Kata 1: Vehiculo y herencia básica
        System.out.println("-- Kata 1: Vehiculo y herencia básica --\n");
        Auto auto = new Auto("Volkswagen", "Gazel", 4);
        auto.mostrarInfo();
        System.out.println();

        // Kata 2: Figuras geométricas y métodos abstractos
        System.out.println("-- Kata 2: Figuras geométricas y métodos abstractos --\n");
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(3, 7),
            new Circulo(3),
            new Rectangulo(2.4, 3.6)
        };

        for (Figura f : figuras) {
            f.mostrarArea(); // Polimorfismo
        }
        System.out.println();

        // Kata 3: Empleado y polimorfismo
        System.out.println("-- Kata 3: Empleado y polimorfismo --\n");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan Pérez", 500000));
        empleados.add(new EmpleadoTemporal("José López", 20, 25000));
        empleados.add(new EmpleadoPlanta("Ana Gómez", 600000));
        empleados.add(new EmpleadoTemporal("Maria Martínez", 15, 25000));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre + " - Sueldo: $" + e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Empleado de Planta permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Empleado Temporal");
            }
            System.out.println();
        }
        
        // Kata 4: Animales y comportamiento sobrescrito
        System.out.println("-- Kata 4: Animales y comportamiento sobrescrito --\n");
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Garabato"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); // Polimorfismo
            System.out.println();
        }
    }

}
