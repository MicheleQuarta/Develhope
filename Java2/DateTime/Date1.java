/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
 */
package Java2.DateTime;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Date1 {
    public static void main(String[] args) {
        String dateString = "2002-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);// Creazione oggetto OffsetDateTime dalla stringa

        DateTimeFormatter formaCompleta = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy H:mm:ss");
        System.out.println("Data Completa: " + dateTime.format(formaCompleta));
        DateTimeFormatter formaMedia = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data Media: " + dateTime.format(formaMedia));
        DateTimeFormatter formaCorta = DateTimeFormatter.ofPattern("M/d/yy H:mm");
        System.out.println("Data Corta: " + dateTime.format(formaCorta));

    }
}
