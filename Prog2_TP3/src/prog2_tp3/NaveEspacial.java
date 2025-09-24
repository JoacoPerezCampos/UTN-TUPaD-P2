
package prog2_tp3;


public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // límite máximo

    // Constructores
    public NaveEspacial(){
        this("",0);
    }
    
    public NaveEspacial(String nombre){
        this(nombre,0);
    }
    
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial > MAX_COMBUSTIBLE) {
            this.setCombustible(MAX_COMBUSTIBLE);
        } else {
            this.setCombustible(combustibleInicial);
        }
    }
    
    
    public String getNombre() {    
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    
    public void setCombustible(int combustible) {    
        if (combustible >= 0){ 
            this.combustible = combustible;
        } else {
            System.out.println("La cantidad de combustible no puede ser negativa.");
        }
    }

    // Método despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " despegó. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    // Método avanzar
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // ejemplo: 2 unidades de combustible por km
        if (combustible >= consumo && distancia > 0 ) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    // Método recargar
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println(nombre + " se recargó al máximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    // Método mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}

