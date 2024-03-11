package Java2.Exception1;
import java.util.Scanner;

public class Exc1 {
    public static boolean Range(int numero){
        if (numero < 10){
            return true;
        } else {
            throw new ArithmeticException("Il numero non è nel range specificato.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int NumeroDaControllare = scanner.nextInt();
        try{
            boolean ControllaRange = Range(NumeroDaControllare);
            System.out.println("il numero inserito è nel range? \n " + ControllaRange);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }

}
