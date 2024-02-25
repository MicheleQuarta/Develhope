package Java;
import java.util.Scanner;

public class break1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di partenza: ");
        int numeroPartenza = scanner.nextInt();
        System.out.print("Inserisci il massimo numero di risultati desiderati: ");
        int massimoRisultati = scanner.nextInt();
        scanner.close();

        // Stampa l'array inverso con i numeri naturali in ordine inverso
        stampaNumeriInversi(numeroPartenza, massimoRisultati);
    }

    // Metodo per stampare i numeri naturali in ordine inverso
    public static void stampaNumeriInversi(int numero, int massimoRisultati) {
        System.out.print("Numeri naturali in ordine inverso: [");
        int contatore = 0;
        while (contatore < massimoRisultati) {
            System.out.print(numero + " ");
            numero--;
            contatore++;
            if (numero < 0) {
                break; // Esce dal ciclo se il numero diventa negativo
            }
        }
        System.out.println("]");
    }
}
