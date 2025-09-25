package prog2_tp3;

public class Prog2_TP3 {

    public static void main(String[] args) {
        // Ejercio 1
        Estudiante estudiante1 = new Estudiante("Joaquín", "Pérez Campos", "Programación II", 8.0);

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(3);

        estudiante1.bajarCalificacion(5);

        estudiante1.mostrarInfo();

        // Ejercicio 2
        Mascota perro1 = new Mascota("Toddy", "Perro", 14);

        perro1.mostrarInfo();
        perro1.cumplirAnios();
        perro1.cumplirAnios();
        perro1.cumplirAnios();
        System.out.println("Después de 3 años");
        perro1.mostrarInfo();

        // Ejercicio 3
        Libro libro1 = new Libro("1984", "George Orwell", 1949);
        libro1.setAnioPublicacion(3838);
        libro1.setAnioPublicacion(1949);
        libro1.mostrarInfo();

        System.out.println("");

        // Ejercicio 4
        Gallina g1 = new Gallina(1);
        Gallina g2 = new Gallina(2);

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();

        System.out.println("\nEstado final de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("");
        // Ejercicio 5
        NaveEspacial nave1 = new NaveEspacial("Halcón Milenario", 50);

        nave1.avanzar(30);

        nave1.recargarCombustible(30);
        nave1.avanzar(30);
        
        System.out.println("");
        System.out.println("Estado de la nave:");
        nave1.mostrarEstado();
    }

}
