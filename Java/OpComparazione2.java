package Java;

public class OpComparazione2 {

    public static boolean confrontaCaratteri(char carattere1, char carattere2) {
        return carattere1 != carattere2;
    }

    public static void main(String[] args) {

        char carattere1 = 'a';
        char carattere2 = 'b';

        System.out.println("Primo carattere: " + carattere1);
        System.out.println("Secondo carattere: " + carattere2);

        // Determina se i caratteri sono diversi e stampa il risultato
        boolean sonoDiversi = confrontaCaratteri(carattere1, carattere2);
        System.out.println("I due caratteri sono diversi: " + sonoDiversi);
    }
}
