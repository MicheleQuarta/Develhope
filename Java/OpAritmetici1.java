package Java;

public class OpAritmetici1 {
    public static void main(String[] args) {

        int dividendo = 9;
        int divisore = 4;
        int resto = calcolaResto(dividendo, divisore);
        System.out.println("Il resto della divisione tra " + dividendo + " e " + divisore + " è: " + resto);
    }
    public static int calcolaResto(int dividendo, int divisore) {
    // l'operatore modulo % calcola il resto della divisione tra i due numeri
        return dividendo % divisore;
    }
}

