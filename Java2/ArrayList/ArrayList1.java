package ArrayList;
import java.util.ArrayList;

public class ArrayList1 {
    private String name;
    private int age;

    public ArrayList1(String name, int age) {
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
        ArrayList<ArrayList1> studentList = new ArrayList<>();

        System.out.println("ArrayList vuoto:");
        stampaArrayList(studentList);

        studentList.add(new ArrayList1("Alice", 20));
        studentList.add(new ArrayList1("Bob", 22));
        studentList.add(new ArrayList1("Carol", 21));
        studentList.add(new ArrayList1("David", 19));

        System.out.println("\nArrayList aggiornato:");
        stampaArrayList(studentList);
    }

    public static void stampaArrayList(ArrayList<ArrayList1> list) {
        for (ArrayList1 student : list) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
