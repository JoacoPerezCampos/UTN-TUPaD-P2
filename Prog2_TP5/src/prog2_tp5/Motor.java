package prog2_tp5;

public class Motor {
   private String tipo;
   private String nroSerie;
   
   public Motor(String tipo, String nroSerie){
       this.tipo = tipo;
       this.nroSerie = nroSerie;
   }

    public String getTipo() {
        return tipo;
    }

    public String getNroSerie() {
        return nroSerie;
    }
  
   @Override
    public String toString() {
        return "Motor Nº " + nroSerie + " (Tipo: " + tipo + ")";
    }
}
