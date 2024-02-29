package Java;

public class Casting2 {
    public static void main(String[] args) {
        char carattere1 = 'A'; // Valore ASCII di 'A' è 65
        char carattere2 = 'B'; // Valore ASCII di 'B' è 66
        int somma = carattere1 + carattere2;
        System.out.println("La somma dei valori ASCII è: " + somma); // Dovrebbe stampare 131
    }
}
