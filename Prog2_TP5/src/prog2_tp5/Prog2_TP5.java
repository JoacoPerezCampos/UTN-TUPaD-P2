package prog2_tp5;

public class Prog2_TP5 {

    public static void main(String[] args) {

        //Ejercicio1
        Titular t1 = new Titular("Juan Pérez", "12345678");
        Pasaporte p1 = new Pasaporte("AR1234", "2025-09-01", "juan_foto1", ".jpg", t1);

        System.out.println(p1);
        System.out.println(p1.getFoto());
        System.out.println(t1.getPasaporte());
        System.out.println("");

        //Ejercicio 2
        Bateria bat1 = new Bateria("Samsung-5000", 5000);
        Usuario u1 = new Usuario("María López", "87654321");
        Celular cel1 = new Celular("IMEI123456", "Samsung", "Galaxy S21", bat1, u1);

        System.out.println(cel1);
        System.out.println(cel1.getBateria());
        System.out.println(cel1.getUsuario());
        System.out.println(u1.getCelular());
        System.out.println("");

        //Ejercicio 3
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial e1 = new Editorial("Sudamericana", "Buenos Aires, Argentina");

        Libro l1 = new Libro("Cien Años de Soledad", "978-84-376-0494-7", a1, e1);

        System.out.println(l1);
        System.out.println(l1.getAutor());
        System.out.println(l1.getEditorial());
        System.out.println("");

        //Ejercicio 4
        Cliente c1 = new Cliente("Ana Gómez", "44556677");
        Banco b1 = new Banco("Banco Nación", "30-12345678-9");

        TarjetaDeCredito tarj1 = new TarjetaDeCredito("1234-5678-9876-5432", "12/27", c1, b1);

        System.out.println(tarj1);
        System.out.println(c1.getTarjeta());
        System.out.println(b1);
        System.out.println("");

        //Ejercicio 5
        Propietario prop1 = new Propietario("Carlos Ruiz", "55667788");
        Computadora comp1 = new Computadora("Dell", "SN-98765", "Z690", "Intel", prop1);

        System.out.println(comp1);
        System.out.println(comp1.getPlacaMadre());
        System.out.println(prop1.getComputadora());
        System.out.println("");

        //Ejercicio 6
        ClienteRestorant clienteRestorant1 = new ClienteRestorant("Lucía Fernández", "1122334455");
        Mesa m1 = new Mesa(5, 4);
        Reserva r1 = new Reserva("2025-10-01", "20:30", clienteRestorant1, m1);

        System.out.println(r1);
        System.out.println(r1.getClienteRestorant());
        System.out.println(r1.getMesa());
        System.out.println("");

        //Ejercicio 7
        Motor motor = new Motor("V8 2.0", "a123v123");
        Conductor cond1 = new Conductor("José Gómez", "A1234321B");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "EcoSport", motor, cond1);

        System.out.println(vehiculo);
        System.out.println(vehiculo.getConductor());
        System.out.println(cond1.getVehiculo());
        System.out.println(motor);
        System.out.println("");

        //Ejercicio 8
        UsuarioDoc usuarioDoc1 = new UsuarioDoc("Martín López", "martin@mail.com");
        Documento d1 = new Documento("Contrato", "Contenido del contrato...", "HASH123ABC", "2025-09-26", usuarioDoc1);

        System.out.println(d1);
        System.out.println(d1.getFirma());
        System.out.println(d1.getFirma().getUsuarioDoc());
        System.out.println("");

        //Ejercicio 9
        Paciente paciente1 = new Paciente("Ana Torres", "OSDE");
        Profesional prof1 = new Profesional("Dr. Gómez", "Cardiología");

        CitaMedica cita1 = new CitaMedica("2025-10-05", "10:30", paciente1, prof1);

        System.out.println(cita1);
        System.out.println(cita1.getPaciente());
        System.out.println(cita1.getProfesional());
        System.out.println("");

        //Ejercicio 10
        TitularCuenta tc1 = new TitularCuenta("Carla Méndez", "32145678");
        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890123456789012", 50000.0, "ABC123", "2025-09-20", tc1);

        System.out.println(cuenta1);
        System.out.println(cuenta1.getClave());
        System.out.println(tc1.getCuenta());
        System.out.println("");

        //Ejercicio 11
        //Dependencias de uso
        Artista artista = new Artista("Coldplay", "Rock Alternativo");
        Cancion cancion = new Cancion("Yellow", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
        System.out.println("");

        //Ejercicio 12
        Contribuyente contribuyente = new Contribuyente("Laura Pérez", "20-34567890-1");
        Impuesto impuesto = new Impuesto(10000.0, contribuyente);

        Calculadora calc = new Calculadora();
        calc.calcular(impuesto);
        System.out.println("");

        //Ejercicio 13
        UsuarioQR usuarioQR = new UsuarioQR("Martín López", "martin.lopez@email.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("ABC123XYZ", usuarioQR);
        System.out.println("");
        
        //Ejercicio 14
        Proyecto proyecto = new Proyecto("Documental Naturaleza", 45);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
        editor.exportar("AVI", proyecto);
        System.out.println("");
    }

}
