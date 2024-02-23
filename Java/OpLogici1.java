package Java;

public class OpLogici1 {

    public static boolean verificaCompreso(int limiteInferiore, int limiteSuperiore, int numeroConfronto) {
        return numeroConfronto >= limiteInferiore && numeroConfronto <= limiteSuperiore;
    }

    public static void main(String[] args) {
        int limiteInferiore = 10;
        int limiteSuperiore = 20;
        int numeroConfronto = 15;

        // Stampa i limiti e il numero di confronto
        System.out.println("Limite inferiore: " + limiteInferiore);
        System.out.println("Limite superiore: " + limiteSuperiore);
        System.out.println("Numero di confronto: " + numeroConfronto);

        // Verifica se il numero di confronto è compreso tra i due limiti e stampa il risultato
        boolean compreso = verificaCompreso(limiteInferiore, limiteSuperiore, numeroConfronto);
        System.out.println("Il numero di confronto è compreso tra " + limiteInferiore + " e " + limiteSuperiore + ": " + compreso);
    }
}
