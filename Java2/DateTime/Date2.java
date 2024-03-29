package Java2.DateTime;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Date2 {
    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Data formattata: " + dateTime.format(formatter));
    }
}
