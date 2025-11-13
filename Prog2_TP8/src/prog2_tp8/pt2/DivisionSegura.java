package prog2_tp8.pt2;

public class DivisionSegura implements IDivisible {

    @Override
    public int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Es imposible dividir por cero.");
            return 0;
        } finally {
            System.out.println("Operación de división finalizada.");
        }
    }
}
