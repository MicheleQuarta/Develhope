package Java2.Nullability;

public class Null1 {
    public static void main(String[] args) {
        Integer numeratore = 10;
        Integer denominatore = null;
        try {
            if (numeratore == null || denominatore == null) {
                throw new NullPointerException("Numeratore o denominatore nullo");
            }

            double risultato = numeratore / denominatore;
            System.out.println("Risultato della divisione: " + risultato);
        } catch (NullPointerException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero");
        }
    }
}