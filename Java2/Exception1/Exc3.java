/*
Scrivere una funzione che provi a
dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
 */

package Java2.Exception1;


import java.util.Scanner;

public class Exc3 {
    public static void divisionePerZero(int numero) {
        try {
            int risultato = numero / 0;
            System.out.println("Il risultato è: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero:");
        int numero = scanner.nextInt();

        divisionePerZero(numero);
    }
}
