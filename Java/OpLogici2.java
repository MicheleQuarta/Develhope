package Java;
import java.util.Scanner;

public class OpLogici2 {

    public static boolean isPari(int numero) {
        // Un numero è pari se l'AND logico (&) tra il numero e 1 è uguale a 0
        // Altrimenti è dispari
        return (numero & 1) == 0;
    }
    public static void main(String[] args) {
        // Chiamata alla funzione per determinare se un numero è pari o dispari
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

    // Metodo per determinare se un numero è pari o dispari utilizzando solo operatori logici

}
