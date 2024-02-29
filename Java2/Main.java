package Java2;

public class Main {
    public static void main(String[] args) {

        studente studente1 = new studente("Michele", "Quarta", 12345);

        System.out.println("Nome: " + studente1.getNome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("Identificativo: " + studente1.getIdentificativo());
    }
}
