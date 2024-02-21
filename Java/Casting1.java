public class Casting1 {
    public static void main(String[] args) {
        double numero1 = 3.15;
        double numero2 = 2.86;
        double somma = numero1 + numero2;
        int risultatoSenzaVirgola = (int) somma;
        System.out.println("La somma senza virgola è: " + risultatoSenzaVirgola);
    }
}

