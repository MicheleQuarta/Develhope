package Java2.Astratta1;

public class Main {
    public static void main(String[] args) {
        
        Rettangolo rettangolo = new Rettangolo(5.0, 3.0);
        double areaRettangolo = rettangolo.calcolaArea();
        System.out.println("L'area del rettangolo è: " + areaRettangolo);

        Triangolo triangolo = new Triangolo(4.0, 3.0);
        double areaTriangolo = triangolo.calcolaArea();
        System.out.println("L'area del triangolo è: " + areaTriangolo);
    }
}