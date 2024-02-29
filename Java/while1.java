package Java;
import java.util.Scanner;
public class while1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il limite superiore: ");
        int limite = scanner.nextInt();
        scanner.close();

        int somma = calcolaSomma(limite);

        System.out.println("La somma dei valori prima del limite " + limite + " è: " + somma);
    }

    public static int calcolaSomma(int limite) {
        int somma = 0;
        int valore = 1;

        while (valore < limite) {
            somma += valore;
            valore++;
        }

        return somma;
    }
}
