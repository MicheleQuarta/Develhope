package ArrayList;
import java.util.LinkedList;

public class Frutto {
    private String name;

    public Frutto(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        LinkedList<Frutto> fruitList = new LinkedList<>();

        fruitList.add(new Frutto("Mela"));
        fruitList.add(new Frutto("Banana"));
        fruitList.add(new Frutto("Arancia"));
        fruitList.add(new Frutto("Mandarino"));

        System.out.println("LinkedList originale:");
        stampaLinkedList(fruitList);

        fruitList.addFirst(new Frutto("Fragola"));

        fruitList.addLast(new Frutto("Ananas"));

        System.out.println("\nLinkedList aggiornata:");
        stampaLinkedList(fruitList);
    }

    public static void stampaLinkedList(LinkedList<Frutto> list) {
        for (Frutto frutto1 : list) {
            System.out.println("Frutto: " + frutto1.getName());
        }
    }
}

