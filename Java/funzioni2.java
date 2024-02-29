package Java;

public class funzioni2 {
    public static void main(String[] args) {
        String stringa = "Hello, world!";
        System.out.println("La lunghezza della stringa '" + stringa + "' è: " + lunghezza(stringa));
    }
    public static int lunghezza(String str) {
        return str.length();
    }
}
