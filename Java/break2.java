package Java;
import java.util.Scanner;
public class break2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserisci il valore massimo: ");
            int valoreMassimo = scanner.nextInt();
            scanner.close();

            //Richiamo della fn
            stampaNumeriConSalto(valoreMassimo);
        }
        // Fn per stampare i numeri fino al valore inserito, escludendo il 5
        public static void stampaNumeriConSalto(int valoreMassimo) {
            for (int i = 1; i <= valoreMassimo; i++) {
                if (i == 5) {
                   continue;
                }
                System.out.print(i + " ");
            }
        }
    }

