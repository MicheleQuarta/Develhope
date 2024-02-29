package Java;
import java.util.Scanner;
public class for1 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserisci un numero per la tabellina aritmetica: ");
            int numero = scanner.nextInt();
            scanner.close();
            stampaTabellina(numero);
        }
        public static void stampaTabellina(int numero) {
            System.out.println("Tabellina aritmetica del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

