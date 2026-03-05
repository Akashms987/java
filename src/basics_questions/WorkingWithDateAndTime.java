package basics_questions;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date:" + date);
        LocalTime time = LocalTime.now();
        System.out.println("Time:" + time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + dateTime);
        /*
        Display
        E - Name of the day (mon - sun)
        D - Day of the year(1-366)
        dd - Day of the month (1-12)
        M - Month Number (1-12)
        MMM - Month name - jan- dec
         */
        DateTimeFormatter format = DateTimeFormatter.ofPattern("D, MMM dd yyyy");
        String formattedDateTime = dateTime.format(format);
        System.out.println("Formatted Date:" + formattedDateTime);
    }


}
