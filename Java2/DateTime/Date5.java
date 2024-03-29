package Java2.DateTime;

import java.time.OffsetDateTime;

public class Date5 {
    public static void main(String[] args) {

        String inputString1 = "2023-03-01T13:00:00Z";
        String inputString2 = "2024-03-01T13:00:00Z";

        OffsetDateTime dateTime1 = OffsetDateTime.parse(inputString1);
        OffsetDateTime dateTime2 = OffsetDateTime.parse(inputString2);


        boolean isFirstBeforeSecond = dateTime1.isBefore(dateTime2);// Verifica se la prima data è precedente alla seconda
        boolean isSecondAfterFirst = dateTime2.isAfter(dateTime1);// Verifica se la seconda data è successiva alla prima
        boolean areEqual = dateTime1.isEqual(dateTime2);// Verifica se le due date sono uguali

        System.out.println("La prima data è precedente alla seconda: " + isFirstBeforeSecond);
        System.out.println("La seconda data è successiva alla prima: " + isSecondAfterFirst);
        System.out.println("Le due date sono uguali: " + areEqual);
    }
}
