package Java2.DateTime;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;

public class Testing2 {
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
    @Test
    public void testPrintDateTimeInfo() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(2023, dateTime.getYear());
        assertEquals(3, dateTime.getMonthValue());
        assertEquals(1, dateTime.getDayOfMonth());
        assertEquals(DayOfWeek.THURSDAY, dateTime.getDayOfWeek());
    }
}
