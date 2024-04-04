package Java2.ArrayList.ArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni. Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {
        List<Studente> students = new ArrayList<>();
        students.add(new Studente("Michele", 20));
        students.add(new Studente("Roberto", 18));
        students.add(new Studente("Gabriele", 21));
        students.add(new Studente("Francesco", 19));
        students.add(new Studente("Simone", 17));
        students.add(new Studente("Gianpaolo", 22));
        students.add(new Studente("Valentina", 16));
        students.add(new Studente("Chiara", 23));
        students.add(new Studente("Serena", 15));
        students.add(new Studente("Emanuele", 24));
        students.add(new Studente("Diletta", 14));
        students.add(new Studente("Catia", 13));

        System.out.println("ArrayList iniziale:");
        System.out.println(students);

        // Ordinare la collezione in base all'età
        Collections.sort(students, Comparator.comparingInt(Studente::getAge));

        System.out.println("ArrayList iniziale:");
        System.out.println(students);
    }
}

