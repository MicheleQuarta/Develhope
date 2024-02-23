package Java;
import java.util.Scanner;
public class switch1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Chiede all'utente di inserire un numero da 1 a 7
            System.out.print("Inserisci un numero da 1 a 7: ");
            int numero = scanner.nextInt();
            scanner.close();

            // Stampa il giorno della settimana corrispondente al numero inserito
            System.out.println(nomeGiornoSettimana(numero));
        }

        // Metodo per restituire il nome del giorno della settimana in base al numero
        public static String nomeGiornoSettimana(int numeroGiorno) {
            switch (numeroGiorno) {
                case 1:
                    return "Lunedì";
                case 2:
                    return "Martedì";
                case 3:
                    return "Mercoledì";
                case 4:
                    return "Giovedì";
                case 5:
                    return "Venerdì";
                case 6:
                    return "Sabato";
                case 7:
                    return "Domenica";
                default:
                    return "Errore: il numero deve essere compreso tra 1 e 7";
            }
        }
    }

