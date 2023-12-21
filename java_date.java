import java.time.*;
import java.time.format.DateTimeFormatter;
public class java_date {
    public static void main(String []args){
        LocalDate d=LocalDate.now();
        System.out.println("current date is: " + d);
        LocalTime t=LocalTime.now();
        System.out.println("Current Time is: " + t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("Current Date and Time: " + dt);
        DateTimeFormatter date=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter date1=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatdate=dt.format(date);
        String formatdate1=dt.format(date1);
        System.out.println("formated date and time: "+formatdate);
        System.out.println("format 2 :"+formatdate1);
    }
    
}
