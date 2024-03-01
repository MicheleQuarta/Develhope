package Auto;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(2000, "AB123CD", "Fiat", "Panda");
        System.out.println("La mia auto ha cilindrata: " + auto1.getCilindrata());
        System.out.println("La mia auto ha targa: " + auto1.getTarga());
        System.out.println("La mia auto è della marca: " + auto1.getMarca());
        System.out.println("Il modello della mia auto è: " + auto1.getModello());
    }
}
