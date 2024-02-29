package Java;

public class OpComparazione {


    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("Primo numero: " + numero1);
        System.out.println("Secondo numero: " + numero2);

        // Determina se i numeri sono diversi e stampa il risultato
        boolean sonoDiversi = confrontaNumeri(numero1, numero2);
        System.out.println("I due numeri sono diversi: " + sonoDiversi);
    }
    public static boolean confrontaNumeri(int num1, int num2) {
        return num1 != num2;
    }
}
