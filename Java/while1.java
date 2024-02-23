package Java;
import java.util.Scanner;
public class while1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiede all'utente di inserire il limite superiore
        System.out.print("Inserisci il limite superiore: ");
        int limite = scanner.nextInt();
        scanner.close();

        // Calcola la somma dei valori prima del limite
        int somma = calcolaSomma(limite);

        // Stampa la somma dei valori
        System.out.println("La somma dei valori prima del limite " + limite + " è: " + somma);
    }

    // Metodo per calcolare la somma dei valori prima del limite
    public static int calcolaSomma(int limite) {
        int somma = 0;
        int valore = 1;

        // Utilizza un ciclo while per aggiungere i valori fino al limite
        while (valore < limite) {
            somma += valore;
            valore++;
        }

        return somma;
    }
}
