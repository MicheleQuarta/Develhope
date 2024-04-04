package Java2.ArrayList.ArrayList1;

import java.util.ArrayList;
/*
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> studentList = new ArrayList<>();

        System.out.println("ArrayList vuoto:");
        stampaArrayList(studentList);

        studentList.add(new Studente("Alice", 20));
        studentList.add(new Studente("Bob", 22));
        studentList.add(new Studente("Michele", 21));
        studentList.add(new Studente("David", 19));

        System.out.println("\nArrayList aggiornato:");
        stampaArrayList(studentList);
    }

    public static void stampaArrayList(ArrayList<Studente> list) {
        for (Studente student : list) {
            System.out.println("Nome: " + student.getName() + ", Anni: " + student.getAge());
        }
    }
}
