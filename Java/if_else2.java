package Java;
import java.util.Scanner;
public class if_else2 {
public static void main(String[] args) {
            // Chiede all'utente di inserire una stringa
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserisci una stringa: ");
            String input = scanner.nextLine();
            scanner.close();

            // Calcola la lunghezza della stringa
            int lunghezza = input.length();

            // Stampa un messaggio in base alla lunghezza della stringa
            if (lunghezza > 10) {
                System.out.println("Lunghezza maggiore di 10.");
            } else if (lunghezza < 10) {
                System.out.println("Lunghezza minore di 10.");
            } else {
                System.out.println("Lunghezza pari a 10.");
            }
        }
    }


