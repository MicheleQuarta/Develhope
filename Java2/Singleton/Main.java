package Java2.DesignPattern.Singleton;
/*
Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
 */

import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            User user1 = User.getInstance();
            user1.setNome("Luca");
            user1.setEtà(22);
            System.out.println("Info User1: " + user1);

            User user2 = User.getInstance();
            user2.setNome("Michele");
            user2.setEtà(25);
            System.out.println("Info User2: " + user2);

            System.out.println("\nNuove Info degli user");
            System.out.println("Info User1: " + user1);
            System.out.println("Info User2: " + user2);
        }
    }