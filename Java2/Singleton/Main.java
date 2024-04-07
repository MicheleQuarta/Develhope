package Java2.DesignPattern.Singleton;
/*
Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
 */

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Luca",29);
        User user2 = new User("Michele",25);
        user1.stampaInfoUser();
        user2.setNome("Michele impostore");
        user2.setEta(99);
        user2.stampaInfoUser();
    }


}
