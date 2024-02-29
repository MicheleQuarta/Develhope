package Java;

public class OpAritmetici3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Calcola la media
        double media = calcolaMedia(num1, num2, num3);
        System.out.println("La media di " + num1 + ", " + num2 + " e " + num3 + " è: " + media);
    }
    // Metodo per calcolare la media di tre numeri
    public static double calcolaMedia(int num1, int num2, int num3) {
        // Somma dei tre numeri e divisione per il numero di numeri
        return (double) (num1 + num2 + num3) / 3;
    }
}
