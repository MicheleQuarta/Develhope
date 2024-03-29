/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */
package Java2.DateTime;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Date3 {
    public static void main(String[] args) {

        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);

        int anno = dateTime.getYear();
        int mese = dateTime.getMonthValue();
        int giornoDelMese = dateTime.getDayOfMonth();

        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();// Ottenere il giorno della settimana

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giornoDelMese);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}
