package Java;

public class OpAritmetici2 {
    public static void main(String[] args) {
        int dividendo = 9;
        int divisore = 4;
        int terzoNumero = 2;
        double risultato = calcolaDivisioneSequenziale(dividendo, divisore, terzoNumero);
        System.out.println("Il risultato della divisione sequenziale tra " + dividendo + ", " + divisore + " e " + terzoNumero + " è: " + risultato);
    }
    //Divisione sequenziali
    public static double calcolaDivisioneSequenziale(int dividendo, int divisore, int terzoNumero) {
        if (divisore == 0 || terzoNumero == 0) {
            System.out.println("Errore: divisione per zero.");
            return 0; // Ritorna 0 o gestisce l'errore in un altro modo appropriato
        }

        // Prima divide il dividendo per il divisore, poi il risultato con il terzo numero
        double risultatoTemporaneo = (double)dividendo / divisore;
        return risultatoTemporaneo / terzoNumero;
    }
}
