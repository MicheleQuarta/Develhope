/*
Scrivere un programma che contenga un metodo che permette di inizializzare
una matrice e di scambiare le sue righe e le sue colonne stampandola a video.
Matrice di partenza

1 2 3
4 5 6
Matrice risultato

 1 4
 2 5
 3 6
 */

package Java;

public class matrice2 {

    public static void main(String[] args) {
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6}
        };// Stampa prima matrice
        System.out.println("Matrice di partenza:");
        stampaMatrice(matrice);

        // Scambia righe e colonne
        int[][] matriceScambiata = scambiaRigheConColonne(matrice);

        // Stampa matrice finale
        System.out.println("\nMatrice risultato:");
        stampaMatrice(matriceScambiata);
    }
    public static void stampaMatrice(int[][] matrice) {
        for (int riga = 0; riga < matrice.length; riga++) {
            for (int colonna = 0; colonna < matrice[0].length; colonna++) {
                System.out.print(matrice[riga][colonna] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] scambiaRigheConColonne(int[][] matrice) {
        int righe = matrice.length;
        int colonne = matrice[0].length;
        int[][] matriceScambiata = new int[colonne][righe];

        for (int riga = 0; riga < righe; riga++) {
            for (int colonna = 0; colonna < colonne; colonna++) {
                matriceScambiata[colonna][riga] = matrice[riga][colonna];
            }
        }

        return matriceScambiata;
    }
}
