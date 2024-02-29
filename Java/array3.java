/*
Scrivere un programma che contenga un metodo che permetta di sostituire gli elementi duplicati
in un array di interi con il valore -1.
L'array ottenuto dovrà essere stampato a video.
 */
package Java;
import java.util.Arrays;

public class array3 {

    public static void main(String[] args) {
        int[] array = generaArrayCasuale(10);
        System.out.println("Array originale: " + Arrays.toString(array));
        sostituisciDuplicati(array);
        System.out.println("Array dopo la sostituzione: " + Arrays.toString(array));
    }

    public static int[] generaArrayCasuale(int lunghezza) {
        int[] array = new int[lunghezza];
        for (int i = 0; i < lunghezza; i++) {
            array[i] =(int) (Math.random() * 10); // Genera numeri casuali tra 0 e 9
        }
        return array;
    }

    public static void sostituisciDuplicati(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = -1;
                }
            }
        }
    }
}
