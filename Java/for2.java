package Java;
import java.util.Scanner;

public class for2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserisci il numero di partenza: ");
            int numeroPartenza = scanner.nextInt();
            System.out.print("Inserisci il massimo numero di risultati desiderati: ");
            int massimoRisultati = scanner.nextInt();
            scanner.close();
            stampaNumeriInversi(numeroPartenza, massimoRisultati);
        }
        public static void stampaNumeriInversi(int numero, int massimoRisultati) {
            System.out.print("Numeri naturali in ordine inverso: [");
            for (int i = 0; i < massimoRisultati; i++) {
                System.out.print(numero-- + " ");
            }
            System.out.println("]");
        }
    }
