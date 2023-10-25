import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(" U_U L-6 in DateTime.java => " + date);

        LocalTime time = LocalTime.now();
        System.out.println(" U_U L-10 in DateTime.java => " + time);

        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
    }

}