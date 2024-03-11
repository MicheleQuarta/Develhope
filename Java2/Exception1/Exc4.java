/*
Scrivere una funzione che accetti un array in input e
provi a dividere un numero dell'array per 0 e
gestisca sia l'eccezione della divisione che quella di indice non presente nell'array,
leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console.
 */
package Java2.Exception1;

public class Exc4 {
    public static void divisionePerZero(int[] array, int i) {
        try {
            int risultato = array[i] / 0;
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione: " + e);
        } catch (Exception e) {
            System.out.println("Errore di indice: " + e);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        divisionePerZero(array, 1);
        divisionePerZero(array, 3);
    }
}
