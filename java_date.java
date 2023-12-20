import java.time.*;
public class java_date {
    public static void main(String []args){
        LocalDate d=LocalDate.now();
        System.out.println("current date is: " + d);
        LocalTime t=LocalTime.now();
        System.out.println("Current Time is: " + t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("Current Date and Time: " + dt);
    }
    
}
