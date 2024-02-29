package Java;
import java.util.Scanner;

public class OpLogici2 {

    public static boolean isPari(int numero) {
        return (numero & 1) == 0;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (isPari(numero)) {
            System.out.println(numero + " è un numero pari.");
        } else {
            System.out.println(numero + " è un numero dispari.");
        }
    }
}
