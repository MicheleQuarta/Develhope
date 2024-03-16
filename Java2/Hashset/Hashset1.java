package Java2.Hashset;

import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");
        System.out.println("La grandezza dell'HashSet è: " + hashSet.size());
        System.out.println("Elementi dell'HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}
