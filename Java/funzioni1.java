package Java;

public class funzioni1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int risultato = somma(num1, num2);
        System.out.println("La somma di " + num1 + " e " + num2 + " è: " + risultato);
    }

    // Funzione per calcolare la somma di due numeri
    public static int somma(int num1, int num2) {
        return num1 + num2;
    }
}
