/*
Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
 */
package Java2.Autoboxing;
import java.util.Scanner;

public class Autoboxing1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //primitivi
        System.out.println("inserisci numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("inserisci numero 2");
        int numero2 = scanner.nextInt();
        System.out.println("somma");
        int somma = numero1 + numero2;
        System.out.println(somma);
        System.out.println("inserisci carattere");
        char carattere = scanner.next().charAt(0);
        System.out.println("carattere: " + carattere);

        //oggetti
        System.out.println("inserisci numero 3");
        Integer numero3 = scanner.nextInt();
        System.out.println("inserisci numero 4");
        Integer numero4 = scanner.nextInt();
        System.out.println("somma");
        Integer somma2 = numero3 + numero4;
        System.out.println(somma2);
        System.out.println("inserisci carattere");
        Character carattere2 = scanner.next().charAt(0);
        System.out.println("carattere2 : " + carattere2);

        //autoboxing
        Integer numero5= 123;
        Double numero6= 10.0;
        Character carattere3= 'C';
        //unboxing
        int numero7 = numero5;
        double numero8 = numero6;
        char carattere4= carattere3;

    }
}
