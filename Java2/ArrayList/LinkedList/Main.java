package Java2.ArrayList.LinkedList;
import java.util.LinkedList;
import java.util.List;

/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String) In questa classe avere i metodi pubblici
 per ottenere le informazioni. Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo Stampare la collezione aggiornata
 */
public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Arancio"));

        System.out.println("LinkedList iniziale:");
        System.out.println(fruits);

        fruits.addFirst(new Fruit("Melograno"));

        fruits.addLast(new Fruit("Ananas"));

        System.out.println("LinkedList aggiornata:");
        System.out.println(fruits);
    }
}