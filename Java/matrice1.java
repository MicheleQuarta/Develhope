/*
Scrivere un programma che contenga un metodo che permette di inizializzare
una matrice riempita con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga
 */

package Java;


public class matrice1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int sum = 0;
        int[] primaRiga = matrix[0];
        for (int i = 0; i < primaRiga.length; i++) {
            sum += primaRiga[i];
        }
        System.out.println("La somma degli elementi nella prima riga è: " + sum);
    }
}
