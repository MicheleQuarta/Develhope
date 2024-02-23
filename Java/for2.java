package Java;
import java.util.Scanner;

public class for2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Chiede all'utente di inserire il numero di partenza e il massimo numero di risultati
            System.out.print("Inserisci il numero di partenza: ");
            int numeroPartenza = scanner.nextInt();
            System.out.print("Inserisci il massimo numero di risultati desiderati: ");
            int massimoRisultati = scanner.nextInt();
            scanner.close();

            // Stampa i numeri naturali in ordine inverso
            stampaNumeriInversi(numeroPartenza, massimoRisultati);
        }

        // Metodo per stampare i numeri naturali in ordine inverso
        public static void stampaNumeriInversi(int numero, int massimoRisultati) {
            System.out.print("Numeri naturali in ordine inverso: [");
            for (int i = 0; i < massimoRisultati; i++) {
                System.out.print(numero-- + " ");
            }
            System.out.println("]");
        }
    }
