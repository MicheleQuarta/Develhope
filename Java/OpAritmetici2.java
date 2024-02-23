package Java;

public class OpAritmetici2 {
    public static void main(String[] args) {
        // Esempio di utilizzo del metodo modificato
        int dividendo = 9;
        int divisore = 4;
        int terzoNumero = 2;

        // Calcola il risultato della divisione sequenziale
        double risultato = calcolaDivisioneSequenziale(dividendo, divisore, terzoNumero);

        // Stampa il risultato
        System.out.println("Il risultato della divisione sequenziale tra " + dividendo + ", " + divisore + " e " + terzoNumero + " è: " + risultato);
    }

    // Metodo per calcolare il risultato di una divisione sequenziale
    public static double calcolaDivisioneSequenziale(int dividendo, int divisore, int terzoNumero) {
        if (divisore == 0 || terzoNumero == 0) {
            System.out.println("Errore: divisione per zero.");
            return 0; // Ritorna 0 o gestisce l'errore in un altro modo appropriato
        }

        // Prima divide il dividendo per il divisore, poi il risultato per il terzo numero
        double risultatoTemporaneo = (double)dividendo / divisore;
        return risultatoTemporaneo / terzoNumero;
    }
}
