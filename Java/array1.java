/*
Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10
e che che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
 */

package Java;
public class array1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int somma = 0;
        for (int i = 0; i < array.length; i++) {
            somma += array[i];
        }
        System.out.println("La somma dei numeri è: " + somma);
    }
}

