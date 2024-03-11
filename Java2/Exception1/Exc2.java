/*
Scrivere una funzione che controlli
se un carattere è un numero, altrimenti lanciare una eccezione.
 */

package Java2.Exception1;
import java.util.Scanner;

public class Exc2 {
    public static boolean controllaCarattere(char carattere) {
        //check s'è ASCII
        if (carattere >= '0' && carattere <= '9') {
            return true;
        } else {
            throw new ArithmeticException("Il carattere non è un numero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un carattere: ");
        char carattere = scanner.next().charAt(0);
        try {
            boolean controllaSeNumero = controllaCarattere(carattere);
            System.out.println("Il carattere inserito è un numero? " + controllaSeNumero);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        scanner.close();
    }
}
