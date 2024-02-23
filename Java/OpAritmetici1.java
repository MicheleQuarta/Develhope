package Java;

public class OpAritmetici1 {
    public static void main(String[] args) {
        // Esempio di utilizzo del metodo
        int dividendo = 9;
        int divisore = 4;

        // Calcola il resto della divisione
        int resto = calcolaResto(dividendo, divisore);

        // Stampa il risultato
        System.out.println("Il resto della divisione tra " + dividendo + " e " + divisore + " è: " + resto);
    }

    // Metodo per calcolare il resto della divisione
    public static int calcolaResto(int dividendo, int divisore) {
    // l'operatore modulo % calcola il resto della divisione tra i due numeri
        return dividendo % divisore;
    }
}

