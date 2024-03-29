package Java2.DateTime;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date4 {
    public static void main(String[] args) {

        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime dateTime1 = OffsetDateTime.parse(inputString);

        OffsetDateTime dateTime2 = dateTime1.plusYears(1);

        dateTime2 = dateTime2.minusMonths(1);

        dateTime2 = dateTime2.plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);// Formattazione del risultato localizzata per l'Italia

        System.out.println("Risultato: " + dateTime2.format(formatter));
    }
}
