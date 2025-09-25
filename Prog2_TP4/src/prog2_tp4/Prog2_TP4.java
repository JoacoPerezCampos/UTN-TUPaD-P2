package prog2_tp4;

public class Prog2_TP4 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Pérez", "Desarrollador");
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado("Ana López", "Analista", 1000000);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        System.out.println("---Modificamos datos---");
        empleado2.setNombre("Pablo Campos");
        empleado2.setPuesto("IT");

        empleado1.actualizarSalario(5.0);
        empleado2.actualizarSalario(5000);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());

    }

}
