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

        fruitList.add(new Frutto("Apple"));
        fruitList.add(new Frutto("Banana"));
        fruitList.add(new Frutto("Orange"));
        fruitList.add(new Frutto("Grapes"));

        System.out.println("LinkedList originale:");
        stampaLinkedList(fruitList);

        fruitList.addFirst(new Frutto("Strawberry"));

        fruitList.addLast(new Frutto("Pineapple"));

        System.out.println("\nLinkedList aggiornata:");
        stampaLinkedList(fruitList);
    }

    public static void stampaLinkedList(LinkedList<Frutto> list) {
        for (Frutto fruit : list) {
            System.out.println("Fruit: " + fruit.getName());
        }
    }
}

