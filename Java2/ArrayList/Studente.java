package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Studente {
    private String name;
    private int age;

    public Studente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        ArrayList<Studente> studentList = new ArrayList<>();

        studentList.add(new Studente("Alice", 20));
        studentList.add(new Studente("Bob", 22));
        studentList.add(new Studente("Carol", 21));
        studentList.add(new Studente("David", 19));
        studentList.add(new Studente("Emma", 23));
        studentList.add(new Studente("Frank", 18));
        studentList.add(new Studente("Grace", 24));
        studentList.add(new Studente("Henry", 22));
        studentList.add(new Studente("Ivy", 20));
        studentList.add(new Studente("Jack", 21));
        studentList.add(new Studente("Kate", 19));
        studentList.add(new Studente("Leo", 23));

        System.out.println("ArrayList non ordinato:");
        stampaArrayList(studentList);

        Collections.sort(studentList, (s1, s2) -> s1.getAge() - s2.getAge());

        System.out.println("\nArrayList ordinato per età:");
        stampaArrayList(studentList);
    }

    public static void stampaArrayList(ArrayList<Studente> list) {
        for (Studente student : list) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
