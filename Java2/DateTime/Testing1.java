package Java2.DateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testing1 {

    public static String formatOffsetDateTime(OffsetDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {

        String inputString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);
        String formattedDate = formatOffsetDateTime(dateTime);
        System.out.println("Data formattata: " + formattedDate);
    }

    @Test
    public void testFormatOffsetDateTime() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formattedDate = formatOffsetDateTime(dateTime);
        assertEquals("01 marzo 2023", formattedDate);
    }
}
