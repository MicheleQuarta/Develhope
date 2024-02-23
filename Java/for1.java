package Java;
import java.util.Scanner;
public class for1 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Chiede all'utente di inserire il numero per il quale stampare la tabellina aritmetica
            System.out.print("Inserisci un numero per la tabellina aritmetica: ");
            int numero = scanner.nextInt();
            scanner.close();

            // Stampa la tabellina aritmetica del numero specificato
            stampaTabellina(numero);
        }

        // Metodo per stampare la tabellina aritmetica di un numero
        public static void stampaTabellina(int numero) {
            System.out.println("Tabellina aritmetica del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

