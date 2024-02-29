/*
Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere a o 0 in caso non ce ne siano.
 */

package Java;
import java.util.Random;

public class array2 {

    public static void main(String[] args) {
        char[] array = creaArray(20);
        stampaOccorrenze(array);
    }

    public static char[] creaArray(int lunghezza) {
        char[] array = new char[lunghezza];
        Random random = new Random();
        int i = 0;
        while (i < lunghezza) {
            array[i] = (char) ((Math.random() * 26) + 'a');
            i++;
        }
        return array;
    }

    public static void stampaOccorrenze(char[] array) {
        int i = 0;
        while (i < array.length) {
            char carattere = array[i];
            if (carattere == 'a') {
                System.out.print(carattere + " ");
            } else {
                System.out.print("0 ");
            }
            i++;
        }
    }
}


/*
In  array[i] = (char) ((Math.random() * 26) + 'a'), aggiungo "a" perchè così trasformo i numeri random
nei corrispettivi ASCII, quindi 0 diventa "a", 1 diventa "b", ecc..
 */

