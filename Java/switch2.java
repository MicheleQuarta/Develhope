package Java;
import java.util.Scanner;
public class switch2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Chiede all'utente di inserire un carattere per rappresentare l'operazione matematica
            System.out.print("Inserisci un carattere per rappresentare un'operazione matematica (+, -, *, /): ");
            char operatore = scanner.next().charAt(0);
            scanner.close();

            // Stampa il tipo di operazione matematica corrispondente al carattere inserito
            System.out.println(identificaOperazione(operatore));
        }

        // Metodo per identificare il tipo di operazione matematica
        public static String identificaOperazione(char operatore) {
            switch (operatore) {
                case '+':
                    return "Addizione";
                case '-':
                    return "Sottrazione";
                case '*':
                    return "Moltiplicazione";
                case '/':
                    return "Divisione";
                default:
                    return "Errore: Carattere non valido per rappresentare un'operazione matematica.";
            }
        }
    }
